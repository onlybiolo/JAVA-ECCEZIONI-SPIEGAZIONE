package org.example;

public class DeliverooFalcariException extends Exception {
    private int statusCode;

    public DeliverooFalcariException(String message)
    {
        super(message);
    }

    public DeliverooFalcariException(String message, int StatusCode)
    {
        super(message);
        this.statusCode = StatusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }
}

