import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//L-Shaped Palindromic Matrix {
		   
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] st=new String[n];
		char[][] ip=new char[n][n];
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        ip[i][j]=sc.next().charAt(0);
		    }
		}
		for(int i=0;i<n;i++) st[i]="";
		for(int i=0;i<n;i++){
		    for(int j=0;j<n-i;j++){
		        
		        st[i]+=ip[j][i];
		    
		}
		    for(int k=i+1;k<n;k++){
		        st[i]+=ip[n-i-1][k];
		    }
		}
		for(int i=0;i<n;i++){
		    if(palin(st[i]))
		    System.out.print(st[i]+" ");
		}
	}
	static boolean palin(String a){
	    int i=0;
	    int j=a.length()-1;
	    while(i<=j){
	        if(a.charAt(i)!=a.charAt(j)) return false;
	        i++;
	        j--;
	    }
	    return true;
	}
}
