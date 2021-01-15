import java.util.Scanner;

class degzimet {
    public static void main(String[] args) {
        
        System.out.println("Programi per paraqitjen e notes..");

        

        Scanner sc = new Scanner(System.in);

        
        

        System.out.println("Enter points that you got in exam");

        int points = sc.nextInt();

        int grade;

        if(points >= 51 && points <= 60){
            grade = 6;
            System.out.println("You'r grade is " + grade);
        }
        else if(points >= 61 && points <= 70){
            grade = 7;
            System.out.println("You'r grade is " + grade);
        }
        else if(points >= 71 && points <= 80){
            grade = 8;
            System.out.println("You'r grade is " + grade);
        }
        else if(points >= 81 && points <= 90){
            grade = 9;
            System.out.println("You'r grade is " + grade);
        }
        else if(points >= 91 && points <= 100){
            grade = 10;
            System.out.println("You'r grade is " + grade);
        }
        

        sc.close();


    }
}