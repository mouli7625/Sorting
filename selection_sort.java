import java.util.Scanner;
 class selection_sort {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n ,a[], i,j, min=0;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            min=i;
            for(j=i+1;j<n;j++)
            {
                if(a[j]<a[min])
                {
                    min=j;
                }
            }
            if(min!=i)
            {
                int temp=a[i];
                a[i]=a[min];
                a[min]=temp;
            }
        }
        for(i=0;i<n;i++)
        {
           System.out.println(a[i]);
        }  
    }
    
}