import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /// int no1 = sc.nextInt();
        // int no2 = sc.nextInt();
        int button = sc.nextInt();

        // if (no1 == no2) {
        // System.out.println("Equal");
        // } else if (no1 > no2) {
        // System.out.println("No1 Is Bigger");
        // } else {
        // System.out.println("No2 Is Bigger");
        // }

        switch (button) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bye");
                break;

            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
}
