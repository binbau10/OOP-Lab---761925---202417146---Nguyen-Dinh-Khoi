import java.util.Scanner;
public class Exercise_6_4 {
    public static void main(String[] args){
        String[] MONTH_NAME = {"January", "Jan.", "Jan", "1", "February", "Feb.", "Feb", "2", "March", "Mar.", "Mar", "3", "April", "Apr.", "Apr", "4", "May", "May", "May", "5", "June", "June", "Jun", "6", "July", "July", "Jul", "7", "August", "Aug.", "Aug", "8", "September", "Sept.", "Sep", "9", "Octobeer", "Oct.", "Oct", "10", "November", "Nov.", "Nov", "11", "December", "Dec.", "Dec", "12"};
        int[] DAYS_IN_COMMON_YEAR = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[]DAYS_IN_LEAP_YEAR = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.println("Enter month (Valid form of month: month, abbreviation, 3 letters, number):");
            String month_name = sc.next();
            int month = -1;
            for (int i = 0; i < 48; i++)
            {
                if (month_name.equals(MONTH_NAME[i]))
                {
                    month = i / 4;
                    break;
                }
            }
            if (month == -1)
            {
                System.out.println("Invalid input.");
                continue;
            }
            System.out.println("Enter year (Must be non-negative):");
            int year = sc.nextInt();
            if (year < 0)
            {
                System.out.println("Invalid input.");
                continue;
            }
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            {
                System.out.println("The number of days is: " + DAYS_IN_LEAP_YEAR[month]);
                break;
            }
            else
            {
                System.out.println("The number of days is: " + DAYS_IN_COMMON_YEAR[month]);
                break;
            }
        }
        sc.close();
    }
}
