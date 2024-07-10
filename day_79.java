import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//N terms Double Series;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		int i=1;
		while(i<=n/2){
		    if(i%2==1)
		    System.out.print(i*x+1+" "+(i*y+1)+" ");
		    else
		    System.out.print(i*x-1+" "+(i*y-1)+" ");
		    i++;
		}
		if(n%2==1) System.out.print((i%2==0)?i*x-1:i*x+1);

	}
}
