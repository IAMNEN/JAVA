import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("You Are Adult");
        } else {
            System.out.println("You are Littele Baby");
        }
    }
}
