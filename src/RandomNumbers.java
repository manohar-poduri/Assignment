import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {

    public static void main(String[] args) {

        int maxRange;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("enter the maximum random number:");


        maxRange = scanner.nextInt();

        for (int i = 0;  i<=10; i++){
            System.out.println(random.nextInt(maxRange));
        }


    }
}
