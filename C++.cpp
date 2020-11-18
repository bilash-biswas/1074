#include<iostream>
#include<math.h>
#include<iomanip>
using namespace std;
int main()
{
    int N,i,a[10000];
    cin>>N;
    for(i=0;i<N;i++)
    {
        cin>>a[i];
    }
    for(i=0;i<N;i++)
    {
        if(a[i]>0 && a[i]%2==0)
        {
            cout<<"EVEN POSITIVE\n";
        }
        else if(a[i]<0 && a[i]%2==0)
        {
            cout<<"EVEN NEGATIVE\n";
        }
        else if(a[i]>0 && a[i]%2!=0)
        {
            cout<<"ODD POSITIVE\n";
        }
        else if(a[i]<0 && a[i]%2!=0)
        {
            cout<<"ODD NEGATIVE\n";
        }
        else
        {
            cout<<"NULL\n";
        }
    }
    return 0;
}
