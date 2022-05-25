import java.util.Scanner;
 class quick_sort {
    static void swap( int arr[],int a, int b)
    {
        int temp=0;
        temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static void print(int a[])
    {
        int i;
        for(i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
    static int partition ( int A[],int start ,int end) {
        int i = start + 1;
        int piv = A[start] ;           
        for(int j =start + 1; j <= end ; j++ )  
        {
              if ( A[ j ] < piv) {
                     swap (A,i , j);
                i += 1;
            }
       }
       swap ( A,start , i-1 ) ;  
       return i-1;                      //return the position of the pivot
    }
    static void Quick(int a[], int lb, int ub)
    {
        int loc=0;
        if(lb<ub)
        {
             loc=partition(a, lb, ub);
            Quick(a,  lb,loc-1);
            Quick(a, loc+1,  ub);
        }

    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n ,a[], i, lb=0, ub=0;
        n=sc.nextInt();
        a=new int[n];
        lb=0;
        ub=n-1;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Quick(a, lb, ub);
        print(a);

    }
    
}