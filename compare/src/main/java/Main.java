import java.util.Scanner;

public class Main {

    public static String compare(int a, int b) {
        String result;
        if (a > b) {
            result = "a > b";
        }
        if (b > a) {
            result = "b > a";
        } else result = "a = b";
        return result;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        String result = compare(a, b);
        System.out.println(result);
    }
}
