class Solution {
    public String reverseParentheses(String s) {
       Stack<Character> ans=new Stack<>();
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)==')'){
            String tmp="";
            while(ans.peek()!='('){
                tmp+=ans.pop();

 
            }
            ans.pop();
            for(int j=0;j<tmp.length();j++){
                ans.push(tmp.charAt(j));
            }

        }
        else{
            ans.push(s.charAt(i));
        }
       }
       String an="";
       while(!ans.isEmpty()){
        an=ans.pop()+an;
       }
       return an;
    }
}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        while(root!=null){
            if(root.val==val){
                return root;
            }
            else if(root.val>val){
                if(root.left!=null)
                root=root.left;
                else{
                    return null;
                }

            }
            else{
                if(root.right!=null)
                root=root.right;
                else{
                    return null;
                }
            }
        }
        return null;
    }
}
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int ec) {
        List<Boolean> ans=new ArrayList<>();
        int max=candies[0];
        for(int i=1;i<candies.length;i++) max=(max<candies[i])?candies[i]:max;
        for(int i=0;i<candies.length;i++){
            ans.add((candies[i]+ec)>=max);
        }
        return ans;
    }
}

class Solution {
    public String removeStars(String s) {
        Stack<Character> ans=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*') ans.pop();
            else ans.push(s.charAt(i));
        }
        String an="";
        while(!ans.isEmpty()){
            an=ans.pop()+an;

        }
        return an;
    }
}
class Solution {
    public String maximumOddBinaryNumber(String s) {
        int oc=0;
        int zc=0;
        for(char i:s.toCharArray()){
            if(i=='1') oc++;
            else zc++;

        }
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length()-1;i++){
            if(oc-1>0){oc--;
           str.append('1');}
           else
           str.append('0');
        }
        str.append('1');
        return str.toString();
    }
}
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Replace - Four Directions
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		String mat[][]=new String[a][b];
		for(int i=0;i<a;i++) for(int j=0;j<b;j++) mat[i][j]=sc.next();
		String c=sc.next();
		int iind=0;
		int jind=0;
		for(int i=0;i<a;i++) for(int j=0;j<b;j++) if(c.equals(mat[i][j])){ iind=i;jind=j;
		}
		int ii=iind;
		int ji=jind;
		while(ii>=0&&ji>=0){
		    mat[ii--][ji--]="*";
		    
		}
		ii=iind;
		ji=jind;
		while(ii>=0&&ji<b){
		    mat[ii--][ji++]="*";
		}
		ii=iind;
		ji=jind;
		while(ii<a&&ji>=0){
		    mat[ii++][ji--]="*";
		}
		ii=iind;
		ji=jind;
		while(ii<a&&ji<b){
		    mat[ii++][ji++]="*";
		}
		for(int i=0;i<a;i++){
		    for(int j=0;j<b;j++){
		      
		        System.out.print(mat[i][j]+" ");
		    }
		    System.out.println("");
		}
	}
}
