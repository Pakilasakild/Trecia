import java.util.Scanner;

public class Main {
    public static void everyNth(String str, int n) {
        for (int i = 0; i < str.length();){
            char a = str.charAt(i);
            System.out.print(a);
            i = i + n;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int n = sc.nextInt();
        everyNth(text, n);
    }
}