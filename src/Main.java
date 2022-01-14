import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("" + s.charAt(1) + s.charAt(3) + s.charAt(9));
        int n = s.length();
        System.out.println("" + s.charAt(0) + s.charAt(1) + s.charAt(n - 1));
        System.out.println("" + s.substring(n - 5, n));
        System.out.println("" + s.substring(0, n - 4));
        int i;
        for (i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(s.charAt(i));
            }
        }
        System.out.println();
    }
}
