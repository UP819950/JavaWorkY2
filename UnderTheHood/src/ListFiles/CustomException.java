package ListFiles;

public class CustomException extends NullPointerException {


    public CustomException(String customInfo) {
        super(customInfo);
    }
}
