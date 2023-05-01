import java.util.*;
public class SQRT {

    public static int sqrt(int num)
    {
        int low=0;
        int high = num;
      
       while(low<=high) {
        int mid=low+(high-low)/2;
        long val=mid*mid;
        if(num==val)
        {
            return mid;
        }
        else if(num<val)
        {
            high=mid-1;
        }
        else{
            low = mid+1;
        }
    }
   return 0;
    }
    public static void main(String args[])
    {
        System.out.println("ENTER THE NUMBER");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = sqrt(num);
        if(result==0)
        {
            System.out.println("FALSE");
        }
        else{
            System.out.println("TRUE");
        }
        
        
    }
}
