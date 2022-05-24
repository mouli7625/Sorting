#include<iostream>
using namespace std;
int main()
{
    int n , i, j,flag=0, temp=0;
    cin>>n;
    int a[n];
    for(i=0;i<n;i++)
    {
        cin>>a[i];
    }
    for(i=0;i<n-1;i++)
    {
        flag=0;
        for(j=0;j<n-i-1;j++)
        {
            if(a[j]> a[j+1])
            {
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
                flag=1;
            }
        }
        if(flag==0)
        {
            break;
        }
    }
    cout<<"Sorted array"<<endl;
    for(i=0;i<n;i++)
    {
        cout<<a[i]<<" ";
    }
return 0;
}