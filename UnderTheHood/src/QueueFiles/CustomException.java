package QueueFiles;

import java.util.InputMismatchException;

public class CustomException extends NullPointerException {


    public CustomException(String customInfo) {
        super(customInfo);
    }
}

