import java.util.Scanner;

public class vleramax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Write Number  1");

        int firstNum = sc.nextInt();

        System.out.println("Write Number 2");

        int secondNum = sc.nextInt();

        int valueMax = firstNum > secondNum ? firstNum : secondNum;

        System.out.println("the maximum number is " + valueMax);

        sc.close();
    }
}