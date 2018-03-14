import java.util.Scanner;

public class sumDigits {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the number here: ");
        int num = in.nextInt();
        for( ; ; ){
            sum =0;
            while(num!=0){
                int res;
                sum = sum+(num%10);
                num = num/10;
            }
            if(sum<10)
                break;
            else
                num = sum;
            System.out.println("Intermediate Sum : "+sum);

        }
        System.out.println("Final sum is : "+sum);
    }
}
