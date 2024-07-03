import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Interlace Vowels and Consonants
		String str=new String(new Scanner(System.in).next());
		StringBuilder v=new StringBuilder();
		StringBuilder c=new StringBuilder();
		String vow="AEIOUaeiou";
		for(char i:str.toCharArray()){
		    if(vow.contains(""+i)){
		        v.append(i);
		    }
		    else{
		        c.append(i);
		    }
		}
		c.reverse();
		int vi,ci;
		vi=ci=0;
		int vl=v.length();
		int cl=c.length();
		while(vi<vl||ci<cl){
		    if(vi<vl)
		    System.out.print(v.charAt(vi));
		    if(ci<cl)
		    System.out.print(c.charAt(ci));
		    vi++;
		    ci++;
		}

	}
}
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Shift Digits & Double
		String s=new Scanner(System.in).next();
		
		StringBuilder ev=new StringBuilder();
		int le=s.length();
		
		
		
		for(int i=1;i<le;i+=2){
		    ev.append(s.charAt(i));
		}
		String even=ev.charAt(ev.length()-1)+ev.substring(0,ev.length()-1);
		
		long ans=0;
		int pi=0;
		for(int i=0;i<le;i+=2){
		    ans=ans*10+(s.charAt(i)-'0');
		    if(pi<even.length())
		    ans=ans*10+(even.charAt(pi)-'0');
		    pi++;
		}
		System.out.print(ans*2);

	}
}
