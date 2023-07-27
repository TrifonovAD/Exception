package Homework3;

public class InvalidDataException extends Exception{
    private int errorCode;

    public InvalidDataException(int errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
