//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
         int minLen = Integer.MAX_VALUE;
        
        StringBuilder check = new StringBuilder();
        
        for(String str : arr){
            
            if(str.length() < minLen){
                
                check = new StringBuilder(str);
                
                minLen = str.length();
                
            }    
        }
        
        for(int i = 0;i < arr.length ; i++){
            
            if(!arr[i].startsWith(check.toString()) && check.length() > 0){
                check.setLength(check.length() - 1);
                i--;
            }
            
            if(check.length() <= 0){
                return "-1";
            }
        }
       
        return check.toString();
    }
}