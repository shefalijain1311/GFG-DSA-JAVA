//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String st = sc.next();
            
            char ans=new Solution().nonrepeatingCharacter(st);
            
            if(ans!='$')
            System.out.println(ans);
            else
            System.out.println(-1);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        //Your code here
     int CHAR = 26; // There are 26 lowercase Latin letters
        int[] count = new int[CHAR];

        // Count the frequency of each character
        for (int i = 0; i < S.length(); i++) {
            count[S.charAt(i) - 'a']++;
        }

        // Find the first non-repeating character
        for (int i = 0; i < S.length(); i++) {
            if (count[S.charAt(i) - 'a'] == 1) {
                return S.charAt(i);
            }
        }

        // If no non-repeating character is found, return '$'
        return '$';
    }
}

