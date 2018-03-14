import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number here: ");
        int num = in.nextInt();
        int sum = 0;
        for(;;) {
            sum = 0;
            while (num != 0) {
                sum = sum + (num % 10) * (num % 10);
                num = num / 10;
            }
            if (sum < 10)
                break;
            else {
                System.out.println("Intermediate sum: " + sum);
                num = sum;
            }
        }
            if(sum==1)
                System.out.println("Is HAPPY NUMBER ");
                else
                    System.out.println("Is not HAPPY NUMBER ");

    }
}
