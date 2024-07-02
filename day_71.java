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
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//String -Common Words
		Scanner sc=new Scanner(System.in);
		String[] fs=sc.nextLine().split(" ");
		String[] ls=sc.nextLine().split(" ");
		int k=sc.nextInt();
		LinkedHashSet<String> set=new LinkedHashSet<>();
	    for(String i:fs){
	        if(i.length()!=k) continue;
	        for(String j:ls){
	            if(j.length()!=k) continue;
	            if(i.equals(j)) {
	                set.add(i);
	                break;
	            }
	        }
	    }
	    if(set.isEmpty()){ System.out.print(-1);return;}
	    for(String i:set)System.out.print(i+" ");
	}
}
