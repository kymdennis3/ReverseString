import java.util.Scanner;

public class Main {
    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        char [] arr = text.toCharArray();
        String rev ="";
        for (char i : arr)
            rev =1 + rev;
        System.out.println(text + "this is Print backwards" + "Man! I'm becoming good at this. Holla!!");
    }
}