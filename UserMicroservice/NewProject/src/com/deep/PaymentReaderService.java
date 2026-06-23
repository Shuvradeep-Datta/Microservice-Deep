package com.deep;

import java.io.BufferedWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;

class PaymentReaderService implements AutoCloseable {
    private BufferedWriter writer;

    public PaymentReaderService(BufferedWriter writer) {
        this.writer = writer;
    }

    public PaymentInfo read(List<String> inputs) throws IOException {
        try {
            if (inputs.size() < 5) {
                throw new MissingPaymentDetailException("Not enough input details provided.");
            }

            // Parse date
            LocalDate date;
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                date = LocalDate.parse(inputs.get(0), formatter);
            } catch (DateTimeParseException e) {
                throw new InvalidDateFormatException(inputs.get(0));
            }

            // Parse amount
            Double amount;
            try {
                amount = Double.parseDouble(inputs.get(1));
                if (amount <= 0) throw new InvalidAmountFormatException(inputs.get(1));
            } catch (NumberFormatException e) {
                throw new InvalidAmountFormatException(inputs.get(1));
            }

            String payer = inputs.get(2);
            String receiver = inputs.get(3);
            String purpose = inputs.get(4);

            return new PaymentInfo(date, amount, payer, receiver, purpose);
        } finally {
            writer.write("Payment ReaderService. Resource closed ");
            writer.flush();
        }
    }

    @Override
    public void close() throws IOException {
        writer.write("Payment ReaderService. Resource closed ");
        writer.flush();
    }
}