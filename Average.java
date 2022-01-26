import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        int math, phy, tur, che, mus;
        int total = 0;
        double avr = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Math note: ");
        math = input.nextInt();
        if (math >= 0 && math <= 100) {
            avr = avr + math;
            total = total + 1;
        }

        System.out.print("Enter the Physics note: ");
        phy = input.nextInt();
        if (phy >= 0 && phy <= 100){
            avr = avr + phy;
        total = total + 1;
        }

        System.out.print("Enter the Chemistry note: ");
        che = input.nextInt();
        if (che >= 0 && che <= 100){
            avr = avr + che;
            total = total + 1;
        }

        System.out.print("Enter the Turkish note: ");
        tur = input.nextInt();
        if (tur >= 0 && tur <= 100){
            avr = avr + tur;
            total = total + 1;
        }

        System.out.print("Enter the Music note: ");
        mus = input.nextInt();
        if (mus >= 0 && mus <= 100){
            avr = avr + mus;
            total = total + 1;
        }

        avr = avr/total;

        if (avr>=55){
            System.out.println("You Passed");
        }
        else {
            System.out.println("You failed");
        }
        System.out.println("Your average is "+avr);
    }
}
