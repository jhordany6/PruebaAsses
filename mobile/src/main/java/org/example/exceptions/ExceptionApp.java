package org.example.exceptions;

public class ExceptionApp extends AssertionError {

    public static final String RETIRE_NOT_SUCESS = "Ocurrio un error en la solicitud, intentalo de nuevo";

    public ExceptionApp(String message) {
        super(message);
    }

    public ExceptionApp(String message, Throwable cause) {
        super(message, cause);
    }
}
