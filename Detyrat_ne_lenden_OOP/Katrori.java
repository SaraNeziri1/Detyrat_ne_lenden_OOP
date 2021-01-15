import java.util.Scanner;
public class Katrori{
    public static void main(String[] args) {
        float s;
        float h;

        Scanner sc =new Scanner(System.in);
        System.out.println("Shtyp vleren s:");
        s = sc.nextFloat();

        System.out.println("Shtyp vleren h:");
        h = sc.nextFloat();

        float siperfaqja = (3*s)+(3*h);

        System.out.println(siperfaqja);
    }
}