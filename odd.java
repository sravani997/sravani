import java.util.*;
class odd
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
int a[]=new int[5];
System.out.println("Enter 5 numbers");
for(int i=0;i<=4;i++)
{
 a[i]=sc.nextInt();                           
}

for(int j=0;j<=4;j++)
{
 if(j%2!=0)
 System.out.println(a[j]);
}
}
}