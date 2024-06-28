import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Integer Atleast One Zero
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		boolean p=true;
		for(int i=x;i<=y;i++){
		    String r=Integer.toString(i);
		    if(r.contains("0")){
		        p=false;
		        System.out.print(i+" ");
		    }
		}
		if(p) System.out.print(-1);

	}
}
