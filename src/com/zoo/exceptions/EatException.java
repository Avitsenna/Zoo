package com.zoo.exceptions;

public class EatException extends Throwable {
    public EatException() {
    }

    public EatException(String message) {
        super(message);
    }

    public EatException(String message, Throwable cause) {
        super(message, cause);
    }

    public EatException(Throwable cause) {
        super(cause);
    }

    public EatException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
