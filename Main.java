import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        double max = 1.5;
        double min = 0.5;

        double mod = rand.nextDouble()*(max - min) + min;

        double strength = 10;

        double agility = 10;

        double intelligence = 30;

        double damage = mod*5*intelligence;

        System.out.println("Damage = " + damage);



    }
}
