class Solution {
    public int passThePillow(int n, int time) {
        int max=1;
        int c=0;
        boolean right,left;
        right=left=false;
        while(c<time){
            c++;
            if(max==n){
                right=false;
                left=true;
            }
            if(max==1){
                right=true;
                left=false;
            }
            if(left){
                max--;
            }
            if(right){
                max++;
            }

        }
        return max;
    }
}
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Average of Largest Integers;
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] matr=new int[r][c];
		int[] rowMax=new int[r];
		int[] columnMax=new int[c];
		for(int i=0;i<r;i++){
		    int max=0;
		    for(int j=0;j<c;j++){
		        matr[i][j]=sc.nextInt();
		        max=Math.max(max,matr[i][j]);
		    }
		    rowMax[i]=max;
		}
		for(int i=0;i<c;i++){
		    int max=0;
		    for(int j=0;j<r;j++){
		        max=Math.max(max,matr[j][i]);
		    }
		    columnMax[i]=max;
		}
		
		int s=0;
		for(int i:rowMax) s+=i;
		double rowAvg=(double)s/r;
		System.out.printf("%.2f\n",rowAvg);
		s=0;
		for(int i:columnMax) s+=i;
		double colAvg=(double)s/c;
		System.out.printf("%.2f",colAvg);

	}
}
