package com.deep;

class InvalidDateFormatException extends RuntimeException {
    public InvalidDateFormatException(String date) {
        super("Invalid date format for date: " + date);
    }
}

// Invalid amount format exception
class InvalidAmountFormatException extends RuntimeException {
    public InvalidAmountFormatException(String amount) {
        super("Invalid amount format for amount: " + amount);
    }
}

// Missing payment detail exception
class MissingPaymentDetailException extends RuntimeException {
    public MissingPaymentDetailException(String detail) {
        super("Missing payment detail: " + detail);
    }
}

// Invalid payment details exception
class InvalidPaymentDetailsException extends RuntimeException {
    public InvalidPaymentDetailsException(String message) {
        super("Invalid payment details: " + message);
    }
}