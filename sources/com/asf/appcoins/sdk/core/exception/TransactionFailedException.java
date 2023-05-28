package com.asf.appcoins.sdk.core.exception;

public class TransactionFailedException extends Exception {
    public TransactionFailedException(String str) {
        super(str);
    }

    public TransactionFailedException(Throwable th) {
        super(th);
    }

    public TransactionFailedException(String str, Exception exc) {
        super(str, exc);
    }
}
