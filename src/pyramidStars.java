import java.util.Scanner;

public class pyramidStars {
    public static  void  main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = 0;
        System.out.println("Enter the level here: ");
        num = in.nextInt();
        int i,j,mark;
        int key = num;
        for(i=0;i<=num;i++){
            for(j=0;j<key;j++){
                System.out.print(" "+" ");

            }
            for(mark=i;mark<=2*i-1;mark++)
                System.out.print(mark%10+" ");
            for(int p=2*i-2;p>=i;p--)
                System.out.print(p%10+" ");
            key--;
            System.out.println();
        }
    }
}
