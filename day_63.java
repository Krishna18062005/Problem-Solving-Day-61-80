import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Replace Rows or Columns:
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] ma=new int[r][c];
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        ma[i][j]=sc.nextInt();
		    }
		}
		char ip=sc.next().charAt(0);
		if(ip=='D'||ip=='d'){
		    for(int i=0;i<r;i++){
		        for(int j=0;j<c;j++){
		            System.out.print(ma[r-1][j]+" ");
		        }
		        System.out.println();
		    }
		}
		else if(ip=='U'||ip=='u'){
		    for(int i=0;i<r;i++){
		        for(int j=0;j<c;j++){
		            System.out.print(ma[0][j]+" ");
		        }
		        System.out.println();
		    }
		    
		}
		else if(ip=='R'||ip=='r'){
		    for(int i=0;i<r;i++){
		        for(int j=0;j<c;j++){
		            System.out.print(ma[i][c-1]+" ");
		        }
		        System.out.println();
		    }
		    
		}
		else if(ip=='L'||ip=='l'){
		    for(int i=0;i<r;i++){
		        for(int j=0;j<c;j++){
		            System.out.print(ma[i][0]+" ");
		        }
		        System.out.println();
		    }
		    
		}
		else{
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        System.out.print(ma[i][j]+" ");
		    }
		    System.out.println();
		}}

	}
}
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Binary Pattern
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=1;i<=a;i++){
		    int po=(int)Math.pow(2,i);
		    for(int j=0;j<po;j++){
		        System.out.println(form(Integer.toBinaryString(j),i));
		    }
		}

	}
	public static String form(String a,int i){
	    String ans="";
	    int n=i-a.length();
	    for(int j=0;j<n;j++){
	        ans+='0';
	    }
	    ans+=a;
	    return ans;
	}
}
