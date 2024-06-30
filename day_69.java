
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Matrix -String Border;
		Scanner sc=new Scanner(System.in);
		String[] ip=sc.nextLine().split(" ");
		int len=ip[0].length();
		char[][] ma=new char[len][len];
		for(int i=0;i<len;i++) for(int j=0;j<len;j++) ma[i][j]=sc.next().charAt(0);
		StringBuilder[] str=new StringBuilder[4];
		for(int i=0;i<4;i++) str[i]=new StringBuilder("");
		for(int i=0;i<len;i++) {
		   
		        str[0].append(ma[0][i]);
		    
		        str[1].append(ma[i][0]);
		    
		        str[2].append(ma[len-1][i]);
		        
		        str[3].append(ma[i][len-1]);
		}
		System.out.print(check(ip,str));

	}
	static String check(String[] a,StringBuilder[] b){
	    for(int i=0;i<a.length;i++){
	        int j=-1;
	        for(j=0;j<4;j++){
	            if(b[j].toString().equals(a[i])||b[j].reverse().toString().equals(a[i])){
	                b[j]=new StringBuilder("");
	                break;
	            }
	            
	        }
	        if(j==4) return "No";
	    }
	    return "Yes";
	}
}
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Pairs-Divisible by 5
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		ArrayList<Integer> se=new ArrayList<>();
		for(int i=1;i<=b;i++) se.add(i);
		int c=0;
		for(int i=1;i<=a;i++){
		    for(int j=0;j<se.size();j++){
		        if((i+se.get(j))%5==0){
		        c++;
		        se.remove(j);
				break;
		    }}
		}
		System.out.print(c);

	}
}
