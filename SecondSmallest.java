import java.util.*;
import java.io.*;
/** Name:Manjusha
* Description : get the second smallest element in an array
* Date:16/03/2021
*/
public class SecondSmallest
{
static int number;
static int arr[];
public static int getSecondSmallest()
{
for(int j=0;j<arr.length;j++)
{
for(int k=j+1;k<arr.length;k++)
{
if(arr[k]<arr[j])
{
int temp=arr[k];
arr[k]=arr[j];
arr[j]=temp;
}
}
}
for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
}
return 0;
}
public static void main(String[] args)
{
System.out.println("Enter no.of elements :");
Scanner s = new Scanner(System.in);
number=s.nextInt();
arr=new int[number];
if(arr.length>0)
{
System.out.println("Enter the values :");
for(int i=0;i<arr.length;i++)
{
arr[i]=s.nextInt();
}
}
getSecondSmallest();
System.out.println("the second smallest element in array is :"+arr[1]);
}
}
