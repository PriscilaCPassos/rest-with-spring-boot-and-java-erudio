package br.com.erudio.exceptions;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

public class ExceptionResponse implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Date timestamp;
    private String message;
    private String Details;

    public ExceptionResponse(Date timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        Details = details;
    }

    // Definindo os Getters:

    public Date getTimestamp() {

        return timestamp;
    }

    public String getMessage() {

        return message;
    }

    public String getDetails() {

        return Details;
    }
}

