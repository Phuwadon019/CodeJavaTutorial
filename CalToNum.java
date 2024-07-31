import java.util.Scanner;

public class CalToNum {
    public static void main(String[] args) {
        int number;
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
            int num1, num2;
            Scanner in = new Scanner(System.in);
            num1 = in.nextInt();
            num2 = in.nextInt();
            int sum = num1+num2;
            System.out.println("ผลลัพธ์ =" +sum);
            System.out.println("____________________");
            break;
            
            case 2:
            System.out.println("____________________");
            System.out.println("คำนวณการคูณเลข");
            System.out.println("ใส่ตัวเลขที่คุณต้องการบวกกัน");
            System.out.println("____________________");
            int x, y;
            Scanner z = new Scanner(System.in);
            x = z.nextInt();
            y = z.nextInt();
            int a = x*y;
            System.out.println("ผลลัพธ์ =" +a);
            System.out.println("____________________");
            break;


            case 3:
            System.out.println("____________________");
            System.out.println("คำนวณการหารเลข");
            System.out.println("ใส่ตัวเลขที่คุณต้องการบวกกัน");
            System.out.println("____________________");
            int b, c;
            Scanner d = new Scanner(System.in);
            b = d.nextInt();
            c = d.nextInt();
            int s = b/c;
            System.out.println("ผลลัพธ์ =" +s);
            System.out.println("____________________");
            break;

            case 4:
            System.out.println("____________________");
            System.out.println("คำนวณการหารเลข");
            System.out.println("ใส่ตัวเลขที่คุณต้องการบวกกัน");
            System.out.println("____________________");
            int o, u;
            Scanner p = new Scanner(System.in);
            o = p.nextInt();
            u = p.nextInt();
            int k = o-u;
            System.out.println("ผลลัพธ์ =" +k);
            System.out.println("____________________");
            break;


            default:
            System.out.println("That not good!! please select choose 1, 2, 3, or 4");
            break;
        }
    }
}
