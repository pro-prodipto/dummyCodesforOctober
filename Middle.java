import java.io.*;
class Middle{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("N = ");
        int num = Math.abs(Integer.parseInt(br.readLine()));
        int count = 0;
        for(int i = num; i != 0; i /= 10)
            count++;
            
        if(count % 2 == 1)//if contains odd no. of digits...middle number is one...
        {
            for(int i = 1; i <= count / 2; i++){
                num /= 10;
            }
            int mid = num % 10;
            System.out.println("Middle number = " + mid);
            //System.out.println("Square of the middle number = " + mid * mid);
            return(mid);
        }
        else
        {
            for(int i = 1; i < count / 2; i++){
                num /= 10;
            }
            int mid = num % 100;
            //System.out.println("Middle number = " + mid);
            int first = mid / 10;
            int second = mid % 10;
            int sum = first+second;
            return( sum);

        }
    }
}