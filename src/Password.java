import java.util.Scanner;
public class Password {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int rno;
        char[] arr = {'!','@','#','$','^','&','*','(',')'};
        System.out.println("Enter the room number here [should be 3 digits only]: ");
        rno = in.nextInt();
        System.out.println("Enter the name of the user here: ");
        String name;
        name = in.next();
        System.out.println("Enter the phone number here: ");
        long phone;
        phone = in.nextLong();
        //1st character
        char[] str = name.toCharArray();
        char a = str[0];
        //2nd character
        String phnum = Long.toString(phone);
        char q = phnum.charAt(9);
        char b = q;
        //3rd character
        //String phnum = Long.toString(phone);
        char p = phnum.charAt(5);
        int o = Integer.parseInt(String.valueOf(p));
        char c = arr[o];
        //4th character
        int num = rno;
        int sum = 0;
        while(true){
            sum=0;
            while(num!=0){
                int res;
                res = num%10;
                sum = sum+res;
                num = num/10;
            }
            if(sum<10)
                break;
            else
                num = sum;
        }
        int d = sum;
        //5th character
        int r = rno/100;
        char e = arr[r];
        //6th character
        int len2 = name.length();
        char f = name.charAt(len2-1);
        System.out.println("Password is : "+a+""+b+""+c+""+d+""+e+""+f);

    }
}
