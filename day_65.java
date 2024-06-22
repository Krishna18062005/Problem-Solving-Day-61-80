import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Reverse Equal Vowels and Consonants;
		Scanner sc=new Scanner(System.in);
		String ip=sc.nextLine();
		String[] k=ip.split("\\s");
		for(String i:k){
		    if(count(i)){
		        System.out.print(rv(i)+" ");
		    }
		    else{
		        System.out.print(i+" ");
		    }
		}

	}
	static boolean count(String a){
	    int c=0;
	    String v="aeiouAEIOU";
	    for(char j:a.toCharArray()){
	       
	        if(v.contains(""+j)) c++;
	    }
	    return c==a.length()-c;
	}
	static String rv(String a){
	    String ans="";
	    for(char i:a.toCharArray()){
	        ans=i+ans;
	    }
	    return ans;
	    
	}
}
