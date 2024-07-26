import java.util.*;
public class Age {
    public static void main(String[] args) {
        final int AGE = 20;
        int inputAge ;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Age : ");
        inputAge = scan.nextInt();
        System.out.print("you entered : "+inputAge);
        if (inputAge < 20) 
            System.out.println("you are still young");
        System.out.println("Good bye");
    }
}
