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
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Count N integers in M integers
		Scanner sc=new Scanner(System.in);
		int f=sc.nextInt();
		int s=sc.nextInt();
		int[] fa=new int[f];
		int[] sa=new int[s];
		for(int i=0;i<f;i++) fa[i]=sc.nextInt();
		for(int i=0;i<s;i++) sa[i]=sc.nextInt();
		
		Arrays.sort(sa);
		int i=0;
		int j=0;
		int c=0;
		while(j<s&&i<f){
		    if(fa[i]==sa[j]){
		        c++;
		        j++;
		    }
		    else if(fa[i]<sa[j]) i++;
		    else j++;
		}
		System.out.print(c);

	}
}
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Insert Word In Lexicographical order
		Scanner sc=new Scanner(System.in);
		ArrayList<String> ip=new ArrayList<>();
		while(sc.hasNext()){
		    ip.add(sc.next());
		}
		Collections.sort(ip);
		for(String i: ip){
		    System.out.print(i+" ");
		}
		

	}
}
