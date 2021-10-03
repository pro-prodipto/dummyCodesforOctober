import java.io.*;
import java.util.*;
import java.lang.Math; 
public class Solution 
{    
    public static int remove_zero(int k)
    {
        int intWithZeros = k; // for example
        String intAsString = String.valueOf(intWithZeros); // represent the int as a String
        String resultString= "";
        for (char digit : intAsString.toCharArray()) { // cycle through every char 
            if(digit!='0') { // if it is not a zero
                resultString+=digit; // append it to the resultString
            }
        }
        if (!resultString.equals("")) {
            return Integer.parseInt(resultString);
        }
        return 0;
    }
    //END
    public static int Primekina(int k) 
    {
        int num =k;
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }
        if (!flag)
            //ut.println(num + " is a prime number.");   
            return(1);
        else
            //System.out.println(num + " is not a prime number.");
            return(0);   
    }
    //END
    //
    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter");
        int inp=sc.nextInt();
        //input nilam:3
        if(inp>=1 && inp<=Math.pow(10,8))
        {
            
        String o=Integer.toBinaryString(inp);
        int nn=Integer.parseInt(o);    
        //binary banalam :3
        int qq=remove_zero(nn);
        //zero shoralam :3
        int isPrime=Primekina(qq);
        //PRIME KINA
        if(isPrime==1)
        {
            System.out.println("GOLD");
        }

        else
        {
            System.out.println("NOT GOLD");
        }    
        
        }
        
    }
}
