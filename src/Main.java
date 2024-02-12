import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int wristBandAge = 21;
        int age = 0;
        System.out.println("Enter your age");
        if(in.hasNextInt())
        {
            //ok, safe to read
            age = in.nextInt();
            if(age >= wristBandAge)
            {
                System.out.println("You get a wristband!");
            }
        }
    }
}