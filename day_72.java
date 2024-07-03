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
