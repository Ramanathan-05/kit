import java.util.Scanner;
public class hey {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Copies sell:");
        int x=sc.nextInt();
        System.out.println(" Selling price:");
        int y=sc.nextInt();
        int s=y*x;
        System.out.println(" price:"+s);
        System.out.println("Actual price:");
        int z=sc.nextInt();
        int t=z*x;
        System.out.println("profit:"+t);
        System.out.println("management fees:");
        int u=sc.nextInt();
        int r=t-u;
        System.out.println("with management fees:"+r);
    }
}
