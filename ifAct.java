import java.util.Scanner;

public class ifAct {
    public static void main(String[] args) {
        double score;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the score : ");
        score = in.nextInt();
        if(score >= 60)
            System.out.println("you are pass");
        else{
            System.out.println("you are not pass");
        }
    }
}
