package com.deep;

import java.time.LocalDate;
class PaymentInfo {
    LocalDate dateOfPayment;
    Double amount;
    String payerAccountNumber;
    String receiverAccountNumber;
    String purposeOfPayment;

    public PaymentInfo(LocalDate dateOfPayment, Double amount, String payerAccountNumber,
                       String receiverAccountNumber, String purposeOfPayment) {
        this.dateOfPayment = dateOfPayment;
        this.amount = amount;
        this.payerAccountNumber = payerAccountNumber;
        this.receiverAccountNumber = receiverAccountNumber;
        this.purposeOfPayment = purposeOfPayment;
    }

    public LocalDate getDateOfPayment() { return dateOfPayment; }
    public Double getAmount() { return amount; }
    public String getPayerAccountNumber() { return payerAccountNumber; }
    public String getReceiverAccountNumber() { return receiverAccountNumber; }
    public String getPurposeOfPayment() { return purposeOfPayment; }
}