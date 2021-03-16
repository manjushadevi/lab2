import java.io.*;
import java.util.Scanner;
/** Name:Manjusha
* Description : get the Test and Print elements in an array
* Date:16/03/2021
*/
public class TestAndPrint
{
static int arr[];
public static void evenNum()
{
    int j=0;
for(int i=0;i<arr.length;i++)
{
if(arr[i]%2==0)
{
    j++;
}
}
System.out.println("the even numbers are :"+j);
}
public static void postiveNum()
{
    int k=0;
for(int i=0;i<arr.length;i++)
{
if(arr[i]>=0)
{
k++;
}
}
System.out.println("the positive numbers are :"+k);
}
public static void negativeNum()
{
    int m=0;
for(int i=0;i<arr.length;i++)
{
if(arr[i]<0)
{
m++;
}
}
System.out.println("the negative numbers are :"+m);
}
public static void oddNum()
{
    int o=0;
for(int i=0;i<arr.length;i++)
{
if(arr[i]%2==1)
{
o++;
}
}
System.out.println("the odd numbers are :"+o);
}
public static void zeroNum()
{
    int z=0;
for(int i=0;i<arr.length;i++)
{
if(arr[i]==0)
{
z++;
}
}
System.out.println("the zeores are :"+z);
}
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
arr=new int[20];
for(int i=0;i<arr.length;i++)
{
arr[i]=s.nextInt();
}
System.out.print("The values are : [");
for(int i=0;i<arr.length;i++)
{
if(i==0)
{
System.out.print(arr[0]);
}
else
{
System.out.print(","+arr[i]);
}
}
System.out.println("]");
evenNum();
postiveNum();
negativeNum();
oddNum();
zeroNum();
}
}
