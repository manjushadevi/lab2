import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
/** name:Manjusha
* Description : accept an array of string objects and sort in alphabetic order
* Date : 16/03/2021
*/
public class SortStrings
{
public static void main(String[] args)
{
int length;
Scanner s = new Scanner(System.in);
System.out.println("Enter the no.of names : ");
length = s.nextInt();
System.out.println(length);
String str[] = new String[length];
System.out.println("Enter the names : ");
for(int i=0;i<length;i++)
{
str[i]=s.next();
System.out.println(str[i]);
}
Arrays.sort(str);
System.out.println("modified array "+Arrays.toString(str));
if(str.length%2==0)
{
    int i;
    String str2[];
    String str1[];
    String str3[];
   for(i=0;i<str.length/2;i++)
{
    str[i]=str[i].toUpperCase();
System.out.println(str[i]);
} 
for(i=str.length/2;i<str.length;i++)
{
   str[i]=str[i].toLowerCase();
   System.out.println(str[i]);
}
System.out.println("even array "+Arrays.toString(str));
}
if(str.length%2==1)
{
    int i;
    String str2[];
    String str1[];
    String str3[];
   for(i=0;i<=str.length/2;i++)
{
    str[i]=str[i].toUpperCase();
System.out.println(str[i]);
} 
for(i=str.length/2+1;i<str.length;i++)
{
   str[i]=str[i].toLowerCase();
   System.out.println(str[i]);
}
System.out.println("odd array "+Arrays.toString(str));
}
}
}
