import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//in this statement use for fetch data from user
        // String name = sc.nextLine();//There Are two types of input (Next
        // ,NextLine,nextFloat etc..) next is use fot one word and next line is fetch
        // whole line of input
        // System.out.println(name);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;

        System.out.println(sum);
    }
}
public class strings{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
    }
}       