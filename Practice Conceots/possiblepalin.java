//  import java.util.Scanner;
//  class GFG {
//     // Returns total number of palindrome substring of
//     // length greater than equal to 2
//     static int CountPS(char str[], int n)
//     {
//         // create empty 2-D matrix that counts all
//         // palindrome substring. dp[i][j] stores counts of
//         // palindromic substrings in st[i..j]
//         int dp[][] = new int[n][n];
 
//         // P[i][j] = true if substring str[i..j] is
//         // palindrome, else false
//         boolean P[][] = new boolean[n][n];
 
//         // palindrome of single length
//         for (int i = 0; i < n; i++)

//             P[i][i] = true;
 
//         // palindrome of length 2
//         for (int i = 0; i < n - 1; i++) {
//             if (str[i] == str[i + 1]) {
//                 P[i][i + 1] = true;
//                 dp[i][i + 1] = 1;
//             }
//         }
 
//         // Palindromes of length more than 2. This loop is
//         // similar to Matrix Chain Multiplication. We start
//         // with a gap of length 2 and fill the DP table in a
//         // way that gap between starting and ending indexes
//         // increases one by one by outer loop.
//         for (int gap = 2; gap < n; gap++) {
//             // Pick starting point for current gap
//             for (int i = 0; i < n - gap; i++) {
//                 // Set ending point
//                 int j = gap + i;
 
//                 // If current string is palindrome
//                 if (str[i] == str[j] && P[i + 1][j - 1])
//                     P[i][j] = true;
 
//                 // Add current palindrome substring ( + 1)
//                 // and rest palindrome substring (dp[i][j-1]
//                 // + dp[i+1][j]) remove common palindrome
//                 // substrings (- dp[i+1][j-1])
//                 if (P[i][j] == true)
//                     dp[i][j] = dp[i][j - 1] + dp[i + 1][j]
//                                + 1 - dp[i + 1][j - 1];
//                 else
//                     dp[i][j] = dp[i][j - 1] + dp[i + 1][j]
//                                - dp[i + 1][j - 1];
//             }
//         }
 
//         // return total palindromic substrings
//         return dp[0][n - 1];
//     }
 
//     // Driver code
//     public static void main(String[] args)
//     {Scanner sc=new Scanner(System.in);
//     System.out.println("enter string");
//         String str = sc.nextLine();
//         System.out.println(
//             CountPS(str.toCharArray(), str.length()));
//     }
// }
// Java Program to count palindrome substring
// in a string
class Palin{
    static int countPS(String str){
        String temp = "";
        StringBuffer stf;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
           
            for (int j = i + 1; j <= str.length(); j++) {
             //   nitin
             
                temp = str.substring(i, j);
                
                if (temp.length() >= 2) {
                
                    stf = new StringBuffer(temp);
                    stf.reverse();
                    if (stf.toString().compareTo(temp) == 0)
                        count++;
                    }
            
                }
        }
        return count;
    }
    
    public static void main(String args[]) {
        String str = "hi naman nitin";
        // Call the method
        System.out.println(countPS(str));
         
    }
} // This code is contributes by hungundji
