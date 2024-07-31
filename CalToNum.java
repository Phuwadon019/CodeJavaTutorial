import java.util.Scanner;

public class CalToNum {
    public static void main(String[] args) {
        int number, num1, num2, result;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("____________________");
        System.out.println("1.คำนวณบวกเลข");
        System.out.println("2.คำนวณคูณเลข");
        System.out.println("3.คำนวณหารเลข");
        System.out.println("4.คำนวณลบเลข");
        System.out.println("____________________");
        number = keyboard.nextInt();
        switch (number) {
            case 1:
            System.out.println("____________________");
            System.out.println("คำนวณการบวกเลข");
            System.out.println("ใส่ตัวเลขที่คุณต้องการบวกกัน");
            System.out.println("____________________");
            num1 = keyboard.nextInt();
            num2 = keyboard.nextInt();
            result = num1+num2;
            System.out.println("ผลลัพธ์ =" +result);
            System.out.println("____________________");
            break;
            
            case 2:
            System.out.println("____________________");
            System.out.println("คำนวณการคูณเลข");
            System.out.println("ใส่ตัวเลขที่คุณต้องการบวกกัน");
            System.out.println("____________________");
            num1 = keyboard.nextInt();
            num2 = keyboard.nextInt();
            result = num1*num2;
            System.out.println("ผลลัพธ์ =" +result);
            System.out.println("____________________");
            break;


            case 3:
            System.out.println("____________________");
            System.out.println("คำนวณการหารเลข");
            System.out.println("ใส่ตัวเลขที่คุณต้องการบวกกัน");
            System.out.println("____________________");
            num1 = keyboard.nextInt();
            num2 = keyboard.nextInt();
            result = num1/num2;
            System.out.println("ผลลัพธ์ =" +result);
            System.out.println("____________________");
            break;

            case 4:
            System.out.println("____________________");
            System.out.println("คำนวณการหารเลข");
            System.out.println("ใส่ตัวเลขที่คุณต้องการบวกกัน");
            System.out.println("____________________");
            num1 = keyboard.nextInt();
            num2 = keyboard.nextInt();
            result = num1-num2;
            System.out.println("ผลลัพธ์ =" +result);
            System.out.println("____________________");
            break;


            default:
            System.out.println("That not good!! please select choose 1, 2, 3, or 4");
            break;
        }
    }
}
