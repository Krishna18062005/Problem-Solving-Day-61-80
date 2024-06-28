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
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Matrix -Row&Column Pattern
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] ar=new int[r][c];
		for(int i=0;i<r;i++) for(int j=0;j<c;j++) ar[i][j]=sc.nextInt();
		for(int i=0;i<Math.min(r,c);i++){
		    for(int j=i;j<r;j++){
		        System.out.print(ar[i][j]+" ");
		    }
		    System.out.println();
		    for(int k=i+1;k<Math.min(r,c);k++){
		        System.out.print(ar[k][i]+" ");
		    }
		    if(i!=r-1)
		    System.out.println();
		}
		

	}
}
