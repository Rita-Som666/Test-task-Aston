package aston;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int evenNumber : numbers) {
            if (evenNumber % 2 == 0) {
                System.out.println(evenNumber);
            }
        }
    }
}