import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Nth-Character Binary String;
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		sc.nextLine();
		int a=sc.nextInt();
		int b=sc.nextInt();
        String ans="";
        int c=-1;
        for(char i:str.toCharArray()){
            c++;
            if(c<=a-1){
                if(i=='0'){
                    
                    ans+="01";
                   
                }
                else{
                    ans+="10";
                }
                
            }
            else{
                ans+=i;
            }
        }
        System.out.print(ans.charAt(b-1));
	}
}
