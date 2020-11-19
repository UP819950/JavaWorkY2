package StackFiles;

import java.util.InputMismatchException;

public class CustomInputException extends InputMismatchException {


    public CustomInputException(String customInfo) {
        super(customInfo);
    }


}
