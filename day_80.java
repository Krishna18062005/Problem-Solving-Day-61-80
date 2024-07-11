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
