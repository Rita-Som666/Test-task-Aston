package aston;

import java.util.Scanner;
public class Main {

    public static String compare(String a, String b) {
        String result;
        if (a.equals(b)) {
            result = "Строки идентичны";
        } else result = "Строки неидентичны";
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        scanner.close();
        String result = compare(a, b);
        System.out.println(result);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    }
}