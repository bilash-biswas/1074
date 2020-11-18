import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int N=input.nextInt();
    int[] a=new int[10001];
    int i;
    for(i=0;i<N;i++)
    {
        a[i]=input.nextInt();
    }
    for(i=0;i<N;i++)
    {
        if(a[i]>0 && a[i]%2==0)
        {
            System.out.println("EVEN POSITIVE");
        }
        else if(a[i]<0 && a[i]%2==0)
        {
            System.out.println("EVEN NEGATIVE");
        }
        else if(a[i]>0 && a[i]%2!=0)
        {
            System.out.println("ODD POSITIVE");
        }
        else if(a[i]<0 && a[i]%2!=0)
        {
            System.out.println("ODD NEGATIVE");
        }
        else
        {
            System.out.println("NULL");
        }
    }
}
}
