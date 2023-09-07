package September07;

public class Billboard {
    // java allows multiple methods with the same name so long as the input parameters are different
    // multiple to allow for condition of only 1 parameter of name, and another for name & price
    // will align with appropriate depending on # of params received
    public static int billboard(String name) {
        // Your code
        int total = 0;
        for (int i = 0;i < name.length();i++) {
            total += 30;
        }
        return total;
    }
    public static int billboard(String name, int price) {
        // Your code
        int total = 0;
        for (int i = 0;i < name.length();i++) {
            total += price;
        }
        return total;
    }
}