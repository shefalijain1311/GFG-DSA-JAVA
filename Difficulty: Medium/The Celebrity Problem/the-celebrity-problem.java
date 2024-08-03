//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M));
            t--;
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to find if there is a celebrity in the party or not.
    public int celebrity(int mat[][]) {
        // code here
        int n = mat.length;
    int left = 0;
    int right = n - 1;

    while (left < right) {
        if (mat[left][right] == 1) {
            // `left` knows `right`, so `left` cannot be the celebrity
            left++;
        } else {
            // `right` cannot be the celebrity
            right--;
        }
    }

    // Check if `left` is a potential celebrity
    for (int i = 0; i < n; i++) {
        if (i != left && (mat[left][i] == 1 || mat[i][left] == 0)) {
            // Either `left` knows someone or someone doesn't know `left`
            return -1;
        }
    }

    return left;
    }
}