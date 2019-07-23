import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.SimpleFormatter;

public class DifferenceInTwoDates {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Start Date in dd-mm-yyyy/HH:MM:SS format:");

        String s1 = scanner.next();

        System.out.println("Enter end Date in dd-mm-yyyy/HH:MM:SS format");

        String s2 = scanner.next();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-mm-yyyy/HH:MM:SS");

        try {
            Date startDate = simpleDateFormat.parse(s1);
            Date endDate = simpleDateFormat.parse(s2);

            long differenceMilliSec = endDate.getTime() - startDate.getTime();

            long seconds = TimeUnit.MILLISECONDS.toSeconds(differenceMilliSec) % 60;
            long minutes = TimeUnit.MILLISECONDS.toMinutes(differenceMilliSec) % 60;
            long hours = TimeUnit.MILLISECONDS.toHours(differenceMilliSec) % 24;
            long days = TimeUnit.MILLISECONDS.toDays(differenceMilliSec) % 365;
            long years = TimeUnit.MILLISECONDS.toDays(differenceMilliSec) % 3651;

            System.out.println("Difference in:");

            System.out.println(years + " years," + days + " days," + hours + " hours," + minutes + " minutes," + seconds + " seconds");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        scanner.close();
    }

}
