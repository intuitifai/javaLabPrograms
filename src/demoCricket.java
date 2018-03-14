import java.util.Scanner;

class cricket{
    float overs;
    int runs;
    String names;

    cricket(float overs,int runs,String names){
        this.overs = overs;
        this.runs = runs;
        this.names = names;
    }

    void display(){
        System.out.println("\nTeam is "+names);
        System.out.println("Runs made by "+names+" is "+ runs);
        System.out.println("Overs played by "+names+" is "+overs);
    }
}
public class demoCricket {
    public static void main(String[] args){
        int n,i,runs;
        float overs;
        String teams;
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter the number of teams: ");
        n = in.nextInt();
        cricket[] ckt = new cricket[n];
        for(i=0;i<n;i++){
            System.out.println("\nEnter the name of the team here: ");
            teams = in.next();
            System.out.println("Enter the runs here: ");
            runs = in.nextInt();
            System.out.println("Enter the overs here [0-20]: ");
            overs = in.nextFloat();
            ckt[i] = new cricket(overs,runs,teams);
        }
        int max = 0,pos=0;
        for(i=0;i<n;i++)
            {
            if(ckt[i].runs>max){
                max=ckt[i].runs;
                pos=i;
            }
            }
        for(i=0;i<n;i++)
            ckt[i].display();
        System.out.println("!!!Congratulations team!!! -->-->--> "+ckt[pos].names);
    }

}
