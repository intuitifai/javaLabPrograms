import java.util.Scanner;

public class calcForTwoInputs {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int op1,op2,choiceOperation;
        label1:
        for(;;) {
            System.out.println("Enter the value for Operand 1");
            op1 = in.nextInt();
            System.out.println("Enter the value for Operand 2");
            op2 = in.nextInt();
            System.out.println("Enter the operation here: \n1 -> Addition\n2 -> Subtraction \n3 -> Multiplication\n4 -> Division");
            choiceOperation = in.nextInt();
            switch (choiceOperation) {
                case 1:
                    System.out.println("The result is " + (op1 + op2));
                    break;
                case 2:
                    System.out.println("The result is " + (op1 - op2));
                    break;
                case 3:
                    System.out.println("The result is " + (op1 * op2));
                    break;
                case 4:
                    System.out.println("The result is " + (op1 / op2));
                    break;
            }
            System.out.println("Do you want to continue? Y/N");
            char ch =  in.next().charAt(0);
            if (ch == 'Y' || ch =='y')
                continue label1;
            else
                break label1;
        }
    }
}
