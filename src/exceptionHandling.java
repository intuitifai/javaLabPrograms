public class exceptionHandling {
    public static void main(String[] args){
        int[] arr = new int[4];
        int a=0;
        try {

           // int b = 100/a;
            arr[56]=55;
            System.out.println(arr[56]);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(a);

    }
}
