package com.deep;

import com.deep.InvalidPaymentDetailsException;
import com.deep.PaymentInfo;

import java.io.BufferedWriter;
import java.io.IOException;

class PaymentValidationService implements AutoCloseable {
    private BufferedWriter writer;

    public PaymentValidationService(BufferedWriter writer) {
        this.writer = writer;
    }

    public void validate(PaymentInfo payment) throws IOException {
        try {
            // Amount check
            if (payment.getAmount() == null || payment.getAmount() <= 0) {
                throw new InvalidPaymentDetailsException("Amount must be greater than zero. Provided: " + payment.getAmount());
            }

            // Payer and receiver check
            if (payment.getPayerAccountNumber() == null || payment.getPayerAccountNumber().isEmpty()
                    || payment.getReceiverAccountNumber() == null || payment.getReceiverAccountNumber().isEmpty()
                    || payment.getPayerAccountNumber().equals(payment.getReceiverAccountNumber())) {
                throw new InvalidPaymentDetailsException("Payer and receiver accounts are invalid. Payer: "
                        + payment.getPayerAccountNumber() + ", Receiver: " + payment.getReceiverAccountNumber());
            }

            // Purpose check
            if (payment.getPurposeOfPayment() == null || payment.getPurposeOfPayment().isEmpty()) {
                throw new InvalidPaymentDetailsException("Purpose of payment is missing.");
            }

        } finally {
            writer.write("Payment ValidationService. Resource closed ");
            writer.flush();
        }
    }

    @Override
    public void close() throws IOException {
        writer.write("Payment ValidationService. Resource closed ");
        writer.flush();
    }
}