import java.util.Scanner; // step 1 เรียกใช้คลาส Scanner
public class calnum {
    public static void main(String[] args) {
        int x,y;
        Scanner in = new Scanner(System.in); // step 2 สร้างออบเจ็กต์ in สำหรับรับข้อมูล
        System.out.print("input number1 : ");
        x = in.nextInt(); //step 3 รับตัวเลขเป็นจำนวนเต็มเก็บในตัวแปร x

        
        System.out.println("your number is :"+x);
        System.out.print("input number2 : ");


        y = in.nextInt();
        System.out.println("your number is "+y);
        System.out.println(x+" + "+y+ " = " +(x+y));
    }
}
