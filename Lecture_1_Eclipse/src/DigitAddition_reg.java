/**
 * Created by Garrett on 12/12/2015.
 */
public class DigitAddition_reg {
    public static void main(String[] args) {
        System.out.println(addDig(999));
    }
    public static int addDig(int n) {
        String conv = Integer.toString(n);
        if (conv.length() == 1)
            return Character.getNumericValue(conv.charAt(0));
        return Character.getNumericValue(conv.charAt(0)) + addDig(Integer.parseInt(conv.substring(1, conv.length())));
    }
}
