//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.*;


public class Driver {
    
    public static void main(String[] args)throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0)
        {
            String s1 = br.readLine();
            String s2 = br.readLine();
            
            Solution obj = new Solution();
            
            boolean a = obj.areIsomorphic(s1,s2);
            if(a)
            System.out.println(1);
            else
            System.out.println(0);
        }
    }
    
}

// } Driver Code Ends


class Solution
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1,String str2)
    {
        // Your code here
        if (str1.length() != str2.length()) {
            return false;
        }

        // Arrays to store the last seen positions of characters
        int[] lastSeen1 = new int[256];
        int[] lastSeen2 = new int[256];

        // Iterate through characters of both strings
        for (int i = 0; i < str1.length(); i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);

            // Check if the last seen positions of the characters are the same
            if (lastSeen1[char1] != lastSeen2[char2]) {
                return false; // Inconsistent mapping
            }

            // Update the last seen positions
            lastSeen1[char1] = i + 1;
            lastSeen2[char2] = i + 1;
        }

        return true;
    }
    
}
