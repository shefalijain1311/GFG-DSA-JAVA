//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    public static Scanner sc = new Scanner(System.in);
	public static void main (String[] args){
        int t;
    	t=sc.nextInt();
    	sc.nextLine();
    	while((t--)!=0){
    	    int n=sc.nextInt();
    	    sc.nextLine();
    	    String s = new String();
    	    s=sc.nextLine();
    	    Solution obj = new Solution();
    	    System.out.println(obj.binarySubstring(n, s));
    	}
	}
}
// } Driver Code Ends




class Solution
{
    //Function to count the number of substrings that start and end with 1.
    public static int binarySubstring(int a, String str)
    {
        // Your code here
       int countOfOnes = 0;
        for (char c : str.toCharArray()) {
            if (c == '1') {
                countOfOnes++;
            }
        }

        // Calculate the number of substrings that start and end with '1'
        if (countOfOnes < 2) {
            return 0;
        }
        return countOfOnes * (countOfOnes - 1) / 2;
    }
}