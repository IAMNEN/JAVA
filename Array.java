import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//user give number of input to store values in array;
        int size = sc.nextInt();//fetch value

        int marks[] = new int[size];//Create Array and give user variable size

        for (int i = 0; i < size; i++) {
            marks[i] = sc.nextInt();//individual Array Values
        }
        int x = sc.nextInt();//find value 
        // marks[0] = 97;
        // marks[1] = 95;
        // marks[2] = 90;

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        // we can use for for multi array value print   

        for (int i = 0; i < size; i++) {
            if (marks[i] == x) {
                System.out.println(x + " Number Found in " + marks[i] + " Position");
            }
        }
    }
}
