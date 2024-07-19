//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    String s=sc.nextLine();
		    
		    System.out.println(printNumber(s,s.length()));
		}
		
	}

// } Driver Code Ends
//User function Template for Java


//Function to find matching decimal representation of a string as on the keypad.
public static String printNumber(String s, int n) 
{
    //Your code here
StringBuilder str = new StringBuilder();

for(int i = 0; i < n; i++) {
    char ch = s.charAt(i);
    if(ch >= 'a' && ch <= 'c') {
        str.append(2);
    } else if(ch >= 'd' && ch <= 'f') {
        str.append(3);
    } else if(ch >= 'g' && ch <= 'i') {
        str.append(4);
    } else if(ch >= 'j' && ch <= 'l') {
        str.append(5);
    } else if(ch >= 'm' && ch <= 'o') {
        str.append(6);
    } else if(ch >= 'p' && ch <= 's') {
        str.append(7);
    } else if(ch >= 't' && ch <= 'v') {
        str.append(8);
    } else if(ch >= 'w' && ch <= 'z') {
        str.append(9);
    }
}

return str.toString();

}

//{ Driver Code Starts.

}

// } Driver Code Ends