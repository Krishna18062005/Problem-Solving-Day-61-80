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
