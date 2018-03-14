import java.util.Scanner;

public class LexographicalOrder {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int num, i;
        System.out.println("Enter the number of string here: ");
        num = in.nextInt();
        String[] str = new String[num];

        System.out.println("Enter the string values here: ");
        for(i=0;i<num;i++){
            System.out.print("\n"+(i+1)+" ");
            str[i] = in.next();
        }
        for(i=0;i<num;i++){
            for(int j=i+1;j<num;j++) {
                if (str[i].compareTo(str[j]) > 0) {
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }

        }


        for(i=0;i<num-1;i++){
            for(int j=i+1;j<num;j++) {
                if(str[i] == str[j] && i!=j)
                str[i]=null;

            }
            if(str[i]!=null)
                System.out.println(str[i]);
        }
    }
}
