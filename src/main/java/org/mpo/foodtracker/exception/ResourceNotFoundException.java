package org.mpo.foodtracker.exception;

public class ResourceNotFoundException extends Exception{
    private String message;
    private int statusCode;

    public ResourceNotFoundException(String message, int statusCode){
        //super(message,);
        this.message = message;
        this.statusCode = statusCode;

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
}
