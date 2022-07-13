
// { Driver Code Starts
//Initial Template for Java

import java.util.*;
// import java.lang.*;
import java.io.*;

public class J32Recursion {
    public static long sumBetweenTwoKth(long A[], long N, long K1, long K2) {
        // Your code goes here
        Arrays.sort(A);
        long sum = 0;
        for (int i = (int) K1; i < (int) K2; i++) {
            sum += A[i];
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int) n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }

            StringTokenizer stt = new StringTokenizer(br.readLine());
            long k1 = Long.parseLong(stt.nextToken());
            long k2 = Long.parseLong(stt.nextToken());

            sumBetweenTwoKth(a, n, k1, k2);

        }
    }
}// } Driver Code Ends

// User function Template for Java
