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
