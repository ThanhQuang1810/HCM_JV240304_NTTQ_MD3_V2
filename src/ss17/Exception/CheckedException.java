package ss17.Exception;

import java.util.Map;

public class CheckedException extends Exception {
    Map<String, String> detailError;
    String error;
    int code;

    public CheckedException(Map<String, String> detailError, String error, int code) {
        this.detailError = detailError;
        this.error = error;
        this.code = code;
    }

    public CheckedException() {
    }
}
