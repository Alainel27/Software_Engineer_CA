package Utils;

public class Utils {

    public static boolean validStringLength(String strToCheck, int maxLength){
        if (strToCheck != null ){
            return strToCheck.length() <= maxLength;
        }
        return false;
    }
}
