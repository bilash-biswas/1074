using System.IO;
using System;

class Program
{
    static void Main()
    {
    int N,i,a;
    N=Convert.ToInt32(Console.ReadLine());
    for(i=0;i<N;i++)
    {
        a=Convert.ToInt32(Console.ReadLine());
        if(a>0 && a%2==0)
        {
            Console.WriteLine("EVEN POSITIVE");
        }
        else if(a<0 && a%2==0)
        {
            Console.WriteLine("EVEN NEGATIVE");
        }
        else if(a>0 && a%2!=0)
        {
            Console.WriteLine("ODD POSITIVE");
        }
        else if(a<0 && a%2!=0)
        {
            Console.WriteLine("ODD NEGATIVE");
        }
        else
        {
            Console.WriteLine("NULL");
        }
    }
    }
}
