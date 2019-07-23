import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.Scanner;

public class ArmStrong {

    public static void main(String[] args) {

        int num,number,temp,total =0;
        System.out.println("enter the number");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        scanner.close();
        number= num;

        for ( ; number !=0; number /= 10) {

            temp = number%10;
            total =total + temp*temp*temp;

        }

        if (total == num) {

            System.out.println(num + " is an armstrong Number");

        } else {
            System.out.println(num + " is not an armstrong Number");
        }

    }

}

