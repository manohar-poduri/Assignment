import java.util.Scanner;

public class Convertion {

    int num;

    void getValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Enter the Number: ");
        num = Integer.parseInt(String.valueOf(scanner.nextInt()));
    }
    void convert(){

        String binary = Integer.toBinaryString(num);
        System.out.println("Binary Value: " + binary);
        String octal = Integer.toOctalString(num);
        System.out.println("Octal Value: " + octal);
        String hexa = Integer.toHexString(num);
        System.out.println("HexaDecimal Value: " + hexa);
    }

    public static void main(String[] args) {
        Convertion obj = new Convertion();
        obj.getValue();
        obj.convert();
    }
}
