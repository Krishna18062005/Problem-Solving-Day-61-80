import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Tooggle Exactly One Bit
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String bi=Integer.toBinaryString(a);
		int max=0;
		int n=bi.length();
		for(int i=0;i<n;i++){
		    char c=(bi.charAt(i)=='1')?'0':'1';
		    if(i!=0&&i!=n-1){
		    String maxFind=bi.substring(0,i)+c+bi.substring(i+1);
		        max=Math.max(max,Integer.valueOf(maxFind,2));
		    }
		    else if(i==0) {
		        String maxF=c+bi.substring(1);
		        max=Math.max(max,Integer.valueOf(maxF,2));
		    }
		    else{
		        String maxFi=bi.substring(0,n-1)+c;
		        max=Math.max(max,Integer.valueOf(maxFi,2));
		    }
		}
		System.out.print(max+"");

	}
}
