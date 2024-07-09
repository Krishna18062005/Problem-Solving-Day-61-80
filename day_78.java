import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Primorial Number
		int a=new Scanner(System.in).nextInt();
		long p=1;
		int n=2;
		while(a>0){
		    if(prime(n)){
		        a--;
		        p*=n;
		    }
		    n++;
		}
         System.out.print(p);
	}
	static boolean prime(int a){
	    if(a<=3) return true;
	    if(a%2==0||a%3==0) return false;
	    for(int i=4;i*i<=a;i++){
	        if(a%i==0) return false;
	    }return true;
	}
	
}
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Words Alternate Min&Max
		String[] str=new Scanner(System.in).nextLine().split(" ");
		int i=0;
		String rs="";
		int j=str.length-1;
		while(i<j){
		    String ans="";
		    if(str[i].length()==str[j].length()){
		        rs+=(str[i]+" "+str[j]+" ");
		        i++;j--;
		        continue;
		    }
		    else if(str[i].length()<str[j].length()){
		        if(i%2==0){
		            ans=str[i];
		        }
		        else ans=str[j];
		    }
		    else if(str[i].length()>str[j].length()){
		        if(i%2==0){
		            ans=str[j];
		        }
		        else ans=str[i];
		    }
		    rs+=(ans+" ");
		    j--;
		    i++;
		}
		System.out.print(rs.trim());

	}
}
