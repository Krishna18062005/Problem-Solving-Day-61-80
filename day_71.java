import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Count -First Bit !
		int a=new Scanner(System.in).nextInt();
		int c=0;
		int si=Integer.toBinaryString(a).length();
		
 		for(int i=0;i<=a;i++) 
 		  if(bitstartwith1(i,si)) c++;
 		 System.out.print(c);

	}
	static boolean bitstartwith1(int a,int len){
	    String st=Integer.toBinaryString(a);
	    if(st.length()!=len) return false;
	    return st.charAt(0)=='1';
	}
}
