import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Difference-Two Time Periods
		Scanner sc=new Scanner(System.in);
		String[] a=sc.nextLine().split(":");
		String[] b=sc.nextLine().split(":");
		int f=0;
		int s=0;
		for(int i=0;i<3;i++){
		    f+=(Integer.parseInt(a[i])*(Math.pow(60,2-i)));
		    s+=(Integer.parseInt(b[i])*(Math.pow(60,(2-i))));
		    
		}
		int ans=Math.abs(s-f)/3600;
		int ans2=Math.abs(s-f)%3600;
		int min=ans2/60;
		int sec=ans2%60;
	
		System.out.print(format(ans,min,sec));

	}
	static String format(int a,int b,int c){
	    String ans="";
	    if(a<10) ans+='0';
	    ans+=a+":";
	    if(b<10) ans+='0';
	    ans+=b+":";
	    if(c<10) ans+='0';
	    ans+=c;
	    return ans;
	    
	}
}
