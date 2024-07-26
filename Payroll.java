import java.util.Scanner;
public class Payroll {
    public static void main(String[] args) {
        /* 
         * 1.nextByte()ชนิตข้อมูลแบบ Byte
         * 2.nextDouble() ชนิดข้อมูลแบบ Double
         * 3.nextFloat() ชนิดข้อมูลแบบ float
         * 4.Int
         * 5.Line
         * 6.Long
         * 7.Short
         */
        String name;
        int hours;
        double payRate;
        double grossPay;
        Scanner keyboard = new Scanner(System.in);
        System.err.println("What's your name? ");
        name = keyboard.nextLine();
        System.out.println("How many hours did you work this week?");
        hours = keyboard.nextInt();
        System.out.println("What is your hourly pay rate? ");
        payRate = keyboard.nextDouble();
        grossPay = hours * payRate;
        System.out.println("Hello "+name);
        System.out.println("Your gross pay is "+grossPay);
        
    }
}
