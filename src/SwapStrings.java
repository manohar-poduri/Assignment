public class SwapStrings {

    public static void main(String[] args) {
        String str1 = "hello", str2 = "world";


        System.out.println("Strings Before Swapping: " + str1 + " " + str2);


        str1 = str1 + str2;

        str2 = str1.substring(0,(str1.length() - str2.length()));

        str1 = str1.substring(str2.length());


        System.out.println("Strings After Swapping: " + str1 + " " + str2);
    }
}
