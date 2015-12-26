/**
 * Created by Garrett on 12/12/2015.
 */
public class DigitAddition_tail {
    public static void main(String[] args) {
        System.out.println(addDig(1555, 0));
    }
    public static int addDig(int num, int total) {
        String conv = Integer.toString(num);
        total += (int) (conv.charAt(0) - 48);
        if (conv.length() == 1)
            return total;
        return addDig(Integer.parseInt(conv.substring(1,conv.length())), total);
    }
}
