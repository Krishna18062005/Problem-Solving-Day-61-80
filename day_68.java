import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//largest Square Submatrix
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] ar=new int[r][c];
		for(int i=0;i<r;i++) for(int j=0;j<c;j++) ar[i][j]=sc.nextInt();
		int key=sc.nextInt();
		boolean f=true;
		int id1=0,id2=0;
		for(int i=0;i<r&&f;i++) for(int j=0;j<c;j++){
		    if(ar[i][j]==key){
		        id1=i;
		        id2=j;
		        f=false;
		        break;
		    }
		}
	
	if(id1==0||id2==0||id1==r-1||id2==c-1||(id1==r-1&&id2==c-1)){
	    System.out.print(key);return;
	}
		int st=Math.min(Math.min(r-id1,c),Math.min(c-id2,r));
		
		int end=id2+st;
		for(int i=id1-st+1;i<id1+st;i++){
		    for(int j=id2-st+1;j<end;j++){
		        System.out.print(ar[i][j]+" ");
		    }System.out.print("\n");
		}
		
		

	}
}
