import java.util.*;

public class passstrengthcheck {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("ENTER PASSWORD TO CHECK\n");
        String aq = sc.nextLine();
        char[] a = aq.toCharArray();
        int sy = 0, up = 0, le = 0, nu = 0, lo = 0;
        for (int i = 0; i < aq.length(); i++) {
            // for check lowercase letters
            if (a[i] > 96 && a[i] <= 123) {
                lo += 1;
            }
            if (a[i] > 64 && a[i] <= 90) {
                // for check uppercase letters
                up += 1;
            }
            if (a[i] >= 33 && a[i] <= 47 || a[i] >= 58 && a[i] <= 64) {
                // for checking symbols
                sy += 1;
            }
            if (a[i] != ' ') {
                // for checking length
                le += 1;
            }
            if (a[i] >= 48 && a[i] <= 57) {
                // for checking numbers
                nu += 1;
            }
        }
        if (sy >= 1 && le >= 8 && up >= 1 && nu >= 1 && lo >= 1) {
            System.out.printf("----STRONG PASSWORD----");
        } else if (le < 8) {
            System.out.printf("----NOT ENOUGH LENGTH----");
        } else if (lo == 0) {
            System.out.printf("---DOESNOT CONTAINS LOWERCASE");
        } else if (up == 0) {
            System.out.printf("---DOESNOT CONTAINS UPPERCASE");
        } else if (nu == 0) {
            System.out.printf("---DOESNOT CONTAINS NUMERICVAL");
        } else if (sy == 0) {
            System.out.printf("---DOESNOT CONTAINS SYMBOLS");
        } else
            System.out.printf("----INVALID PASSWORD----");

    }
}

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//N columns Pattern
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int[] ar=new int[a];
		for(int i=0;i<a;i++){
		    ar[i]=sc.nextInt();
		}
		int cp=0;
		for(int i=0;i<a;i++){
		    int c=0;
		    while(c<ar[i]){
		        System.out.print(ar[i]+" ");
		        c++;
		        cp++;
		        if(cp==a){
		            cp=0;
		            System.out.println();
		        }
		    }
		}

	}
}
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Sort Factors;
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		ArrayList<Integer> fa=new ArrayList<>();
		ArrayList<Integer> fc=new ArrayList<>();
		Hello ello=new Hello();
		for(int i=1;i<=num;i++){
		    if(num%i==0){
		        fa.add(i);
		        fc.add(ello.co(i));
		    }
		}
		ello.sort(fa,fc);
		for(int i=0;i<fa.size();i++)
		System.out.print(fa.get(i)+" ");

	}
  int co(int a){
      int c=2;
      for(int i=2;i<a;i++) if(a%i==0) c++;
      return c;
  } 
  void sort(ArrayList<Integer> a,ArrayList<Integer> b){
      for(int i=0;i<a.size();i++){
          for(int j=i+1;j<a.size();j++){
              if(b.get(i)<=b.get(j)){
                  int tm=a.get(i);
                  a.set(i,a.get(j));
                  a.set((j),tm);
                  int tp=b.get(i);
                  b.set(i,b.get(j));
                  b.set(j,tp);
              }
          }
      }
  } 
}
