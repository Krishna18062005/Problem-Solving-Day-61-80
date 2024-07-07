// 100339. Find the Encrypted String
// Solved
// Easy
// You are given a string s and an integer k. Encrypt the string using the following algorithm:

// For each character c in s, replace c with the kth character after c in the string (in a cyclic manner).
// Return the encrypted string.

 

// Example 1:

// Input: s = "dart", k = 3

// Output: "tdar"

// Explanation:

// For i = 0, the 3rd character after 'd' is 't'.
// For i = 1, the 3rd character after 'a' is 'd'.
// For i = 2, the 3rd character after 'r' is 'a'.
// For i = 3, the 3rd character after 't' is 'r'.
// Example 2:

// Input: s = "aaa", k = 1

// Output: "aaa"

// Explanation:

// As all the characters are the same, the encrypted string will also be the same.

 

// Constraints:

// 1 <= s.length <= 100
// 1 <= k <= 104
// s consists only of lowercase English letters.
class Solution {
    public String getEncryptedString(String s, int k) {
        char[] ans=s.toCharArray();
        String an="";
        for(int i=0;i<ans.length;i++){
            int l;
            if(i+k<ans.length)
            l=i+k;
            else{
                int c=k;
                l=i;
                while(c>0){
                    l++;
                    if(l==ans.length){
                        l=0;
                    }
                  c--;               }
            }
            an+=ans[l];           
        }
       // System.out.print(ans);
        return an;
    }
}

// 100328. Generate Binary Strings Without Adjacent Zeros
// Solved
// Medium
// You are given a positive integer n.

// A binary string x is valid if all 
// substrings
//  of x of length 2 contain at least one "1".

// Return all valid strings with length n, in any order.

 

// Example 1:

// Input: n = 3

// Output: ["010","011","101","110","111"]

// Explanation:

// The valid strings of length 3 are: "010", "011", "101", "110", and "111".

// Example 2:

// Input: n = 1

// Output: ["0","1"]

// Explanation:

// The valid strings of length 1 are: "0" and "1".

 

// Constraints:

// 1 <= n <= 18

class Solution {
    public List<String> validStrings(int n) {
        List<String> ans=new ArrayList<>();
        int max=(int)Math.pow(2,n)-1;
        System.out.print(max);
        for(int i=0;i<=max;i++){
            if(adjaZero(bin(Integer.toBinaryString(i),n))){
                ans.add(bin(Integer.toBinaryString(i),n));
            }
        }
        return ans;
    }
    static String bin(String a,int n){
        
        String as="";
        int c=n-a.length();
        
        for(int i=0;i<c;i++){
            as+='0';
        }
        return as+a;
        
    }
    static boolean adjaZero(String st){
        for(int i=0;i<st.length()-1;i++){
            if(st.charAt(i)=='0'&&st.charAt(i+1)=='0') return false;
        }
        return true;
    }
}
