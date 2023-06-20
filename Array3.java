import java.util.Scanner;
class Array3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size");
        int a[]=new int [sc.nextInt()];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();

        }
        int count=0;
        int sum=0;

        for(int i=0;i<a.length;i++)
        {
            if(a[i]>0)
            {
                sum=sum+a[i];
                count ++;
            }
        }
        System.out.println("An array="+count +Positive Number);
        System.out.println("Postive Number of an array=" + sum);

    
    }
}