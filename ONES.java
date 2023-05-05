//Q3. Given a sorted binary array, efficiently count the total number of 1’s in it
import java.util.Scanner;

import java.util.*;
public class ONESCOUNT {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENETR THE NUMBERS OF ELEMENT OF ARRAY");
        int n = sc.nextInt();
        int arr[]=new int[n];
   System.out.println("ENTER THE ELEMENTS(ONLY 0/1) OF ARRAY ");
   for(int i = 0 ; i<n ;i++)
   {
    arr[i]=sc.nextInt();
   }

   int count =0;
   for(int i =0; i<n ; i++)
   {
    if(arr[i]==1)
    {
        count++;
    }
   }
System.out.println(count);
    }
}
