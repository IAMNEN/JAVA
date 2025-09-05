import java.util.Scanner;

public class Function {

    public static int cal(int a, int b) {
        int ans = a + b;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = cal(a, b);
        System.out.println(ans);
    }
}
