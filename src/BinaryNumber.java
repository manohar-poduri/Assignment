public class BinaryNumber  {

    static void isBinaryOrNot(int number) {
        boolean isBinary = true;
        int copyOfNumber = number;

        while(copyOfNumber != 0) {
            int temp = copyOfNumber%10;
            if (temp > 1){
                isBinary = false;
                break;

            } else {
                copyOfNumber = copyOfNumber/10;

            }

        }
        if (isBinary){
            System.out.println(number+ " is a binary Number");

        } else
        {
            System.out.println(number+ "is not a binary number");
        }
    }
    public static void main(String[] args){
        isBinaryOrNot(101101);
        isBinaryOrNot(110010110);
        isBinaryOrNot(10010011);
    }
}
