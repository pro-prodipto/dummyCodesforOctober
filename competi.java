// Java implementation of the above appraoch 
import java.util.*; 

class competi
{ 

    static int calculate_maximum_splits(int arr[], 
    int N) 
    { 

        // Prefix array storing right most 
        // index with prefix sums 0, 1, 2 
        int pre[] = { 0, -1, -1 };      

        // dp array 
        int[] dp = new int[N]; 
        Arrays.fill(dp, 0); 

        // Current prefix sum 
        int C = 0; 

        for(int i = 0; i < N; i++) 
        { 
            C = C + arr[i]; 

            // Calculating the prefix sum modulo 3 
            C = C % 3; 

            // We dont have a left pointer 
            // with prefix sum C 
            if (pre[C] == -1) 
            { 
                if(1 <= i) 
                    dp[i] = dp[i - 1]; 

                // We cannot consider i as 
                // a right pointer of any segment 
            } 
            else
            { 

                // We have a left pointer  
                // pre[C] with prefix sum C 
                dp[i] = Math.max(dp[i - 1],  
                    dp[pre[C]] + 1); 
            } 

            // i is the rightmost index of  
            // prefix sum C 
            pre[C] = i; 
        } 
        return dp[N - 1]; 
    } 

    // Driver code 
    public static void main(String[] args) 
    { 
        int arr[] = { 2, 36, 1, 9, 2, 0, 1, 8, 1 }; 
        int N = arr.length; 

        System.out.println(calculate_maximum_splits(arr, N)); 
    } 
} 

// This code is contributed by offbeat 