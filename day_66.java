import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Replace vowels With 1
		String sc=new Scanner(System.in).next();
		int C=0;//vowel count
		String ans="";
		String Vowel="AEIOUaeiou";
		for(char i : sc.toCharArray()){
		    if(!(i>='a'&&i<='z'||i>='A'&&i<='Z')) {System.out.print("Invalid");return;}
		    if(Vowel.contains(""+i)){
		        ans+='1';C++;
		    }else ans+=i;
		}
		System.out.print(ans+" "+C);

	}
}
