//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;
import java.lang.*;

class Main
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t  =Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String st[] = read.readLine().trim().split(" ");
            int N = Integer.parseInt(st[0]);
            int M = Integer.parseInt(st[1]);
            
            int arr1[] = new int[N];
            int arr2[] = new int[M];
            
            st = read.readLine().trim().split(" ");
            for(int i = 0; i < N; i++)
              arr1[i] = Integer.parseInt(st[i]);
            
            st = read.readLine().trim().split(" ");  
            for(int i = 0; i< M; i++)
              arr2[i] = Integer.parseInt(st[i]);
            
            Solution obj = new Solution();
            ArrayList<Integer> res = new ArrayList<Integer>();
            res = obj.findUnion(arr1, arr2, N, M);
            for(int i = 0;i<res.size();i++)
                System.out.print(res.get(i) + " ");
            System.out.println(); 
        }
    }
}



// } Driver Code Ends


//User function Template for Java

//arr1,arr2 : the arrays
// n, m: size of arrays
class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        ArrayList<Integer> arr = new ArrayList<>();
        
        int i = 0;
        
        int j = 0;

        while (i < n && j < m)
        {
            // Skip duplicates in arr1
            while (i > 0 && i < n && arr1[i] == arr1[i - 1]) {
                i++;
            }
            // Skip duplicates in arr2
            while (j > 0 && j < m && arr2[j] == arr2[j - 1]) {
                j++;
            }
            
            if (i < n && j < m) {
                if (arr1[i] < arr2[j])
                {
                    arr.add(arr1[i]);
                    i++;
                }
                else if (arr1[i] > arr2[j])
                {
                    arr.add(arr2[j]);
                    j++;
                }
                else
                {
                    arr.add(arr1[i]);
                    i++;
                    j++;
                }
            }
        }
        
        // Add remaining elements of arr1
        while (i < n)
        {
            if (i > 0 && arr1[i] != arr1[i - 1]) {
                arr.add(arr1[i]);
            } else if (i == 0) {
                arr.add(arr1[i]);
            }
            i++;
        }
        
        // Add remaining elements of arr2
        while (j < m)
        {
            if (j > 0 && arr2[j] != arr2[j - 1]) {
                arr.add(arr2[j]);
            } else if (j == 0) {
                arr.add(arr2[j]);
            }
            j++;
        }
        
        return arr;
        
    }   
}



