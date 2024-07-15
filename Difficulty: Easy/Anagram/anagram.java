//{ Driver Code Starts
import java.util.*;
import java.util.stream.*; 
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    
		    Solution obj = new Solution();
		    
		    if(obj.isAnagram(s1,s2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		         System.out.println("NO");
		    }
		    
		    
		    
		}
	}
}
// } Driver Code Ends


class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
   String lowerCase1 = a.toLowerCase();
            String lowerCase2 = b.toLowerCase();
        
        /*Convert both Strings to Character Arrays.*/ 
            char[] charArray1 = lowerCase1.toCharArray();
            char[] charArray2 = lowerCase2.toCharArray();
        
        /* Sort each arrays.*/
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
        
        /* return true if both arrays are equal. else false */
            return Arrays.equals(charArray1, charArray2);
}
}