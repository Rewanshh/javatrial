//Q1. Write a program to sort an array in descending order using bubble sort.

import java.util.*;
public class BUBBLESORT {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ELEMENT YOU WANT TO ADD ");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("ENTER THE ELEMENTS OF ARRAY");
        
        for (int i = 0 ; i<n ;i++)
        {
         arr[i]=sc.nextInt();
        } 
        for(int i =0; i<n ; i++)
        {
            for(int j =0 ;j<n-i-1;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("SORTED ARRAY IS "+Arrays.toString(arr));
    }
}
