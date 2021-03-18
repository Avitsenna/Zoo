package com.zoo.exceptions;

public class MoveException extends Throwable{
    public MoveException() {
    }

    public MoveException(String message) {
        super(message);
    }

    public MoveException(String message, Throwable cause) {
        super(message, cause);
    }

    public MoveException(Throwable cause) {
        super(cause);
    }

    public MoveException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
