import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Reverse Equal Vowels and Consonants;
		Scanner sc=new Scanner(System.in);
		String ip=sc.nextLine();
		String[] k=ip.split("\\s");
		for(String i:k){
		    if(count(i)){
		        System.out.print(rv(i)+" ");
		    }
		    else{
		        System.out.print(i+" ");
		    }
		}
 
	}
	static boolean count(String a){
	    int c=0;
	    String v="aeiouAEIOU";
	    for(char j:a.toCharArray()){
	       
	        if(v.contains(""+j)) c++;
	    }
	    return c==a.length()-c;
	}
	static String rv(String a){
	    String ans="";
	    for(char i:a.toCharArray()){
	        ans=i+ans;
	    }
	    return ans;
	    
	}
}
//this code tells about the equalsIgnoreCase: it is in C programming
// #include<stdio.h>
// #include<stdlib.h>
// #include<string.h>
// int cmp(char* a,char* b){
//     if(strlen(a)!=strlen(b)) return 1;
//     else{
//         for(int i=0;i<strlen(a);i++){
//             if(a[i]!=b[i]) return 1;
//         }
//     }
//     return 0;
// }
// int main()
// {

// char a[1001],b[1001];
// scanf("%s %s",a,b);
// for(int i=0;i<strlen(a);i++){
//     if(a[i]>=97){
//         a[i]-=32;
//     }
// }
// for(int i=0;i<strlen(b);i++){
//     if(b[i]>=97){
//         b[i]-=32;
//     }
// }
// if(cmp(a,b)==0)
// printf("YES");
// else
// printf("NO");
// }

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//U -Shaped Layers Matrix
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int ar[][]=new int[r][c];
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        ar[i][j]=sc.nextInt();
		    }
		}
		for(int i=0;i<Math.min(c/2,r);i++){
		    for(int j=0;j<r-i-1;j++){
		        System.out.print(ar[j][i]+" ");
		    }
		    
		    for(int k=i;k<c-i;k++){
		        System.out.print(ar[r-i-1][k]+" ");
		    }
		    for(int l=r-i-2;l>=0;l--){
		        System.out.print(ar[l][c-i-1]+" ");
		    }
		    
		    System.out.println();
		}
		
    
	}
}
import java.util.*;
public class Hello {

    public static void main(String[] args) {
        //longest prefix divisible by D;
		Scanner sc=new Scanner(System.in);
		String ip=sc.next();
		int d=sc.nextInt();
		for(int i=ip.length()-1;i>=0;i--){
		    int num=Integer.parseInt(ip.substring(0,i+1));
		    if(num%d==0){
		        System.out.print(num);
		        return;
		    }
		}
		System.out.print(-1);

	}
}
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Order by Integers;
		Scanner sc=new Scanner(System.in);
		int as=sc.nextInt();
		int is=sc.nextInt();
		ArrayList<Integer> a=new ArrayList<>();
		ArrayList<Integer> I =new ArrayList<>();
		
		for(int i=0;i<as;i++) a.add(sc.nextInt());
		for(int i=0;i<is;i++) I.add(sc.nextInt());
	//	System.out.print(I);
		int ans[]=new int[as];
		int j=0;
		int id=0;
		while(j<is){
		    for(int i=0;i<a.size();i++){
		        if((int)a.get(i)==(int)I.get(j)){
		        ans[id++]=I.get(j);
		       
		        }
		    }
		    while(a.contains(I.get(j)))
		    a.remove(I.get(j));
		    j++;
		}
        Collections.sort(a);
		for(int i=0;i<a.size();i++)
		ans[id++]=a.get(i);
		for(int i:ans)
		System.out.print(i+" ");

	}
}
