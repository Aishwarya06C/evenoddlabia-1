
package evenoddmavenfile;

public class evenodd {

    public static String check(int n) {
        return n % 2 == 0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        System.out.println("Number 10 is " + check(10));
    }
}
