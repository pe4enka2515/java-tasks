import java.util.function.Consumer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Consumer<StringBuilder> printUpperStr = str -> {
            for(int i=0;i<str.length();i++) {
                if ((i+1)%3==0) str.setCharAt(i, (String.valueOf(str.charAt(i)).toUpperCase().toCharArray())[0]);
            }
            System.out.println(str);
        };
        printUpperStr.accept(new StringBuilder(in.nextLine()));
    }
}