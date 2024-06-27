import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Replace vowels With 1
		String sc=new Scanner(System.in).next();
		int C=0;//vowel count
		String ans="";
		String Vowel="AEIOUaeiou";
		for(char i : sc.toCharArray()){
		    if(!(i>='a'&&i<='z'||i>='A'&&i<='Z')) {System.out.print("Invalid");return;}
		    if(Vowel.contains(""+i)){
		        ans+='1';C++;
		    }else ans+=i;
		}
		System.out.print(ans+" "+C);

	}
}
// #include<stdio.h>
// #include<stdlib.h>

// int main()
// {
//     int a;
//     scanf("%d",&a);
//     int ar[a];
//     for(int i=0;i<a;i++) scanf("%d",&ar[i]);
//     for(int i=a-1;i>=0;i--){
//         int r=ar[i]%10;
//         if(r==0){
//         if(ar[i]!=0)
//         printf("%d ",ar[i]);
//         }
//         else if(ar[i]%r==0) 
//         printf("%d ",ar[i]);
//     }
// }-->divisible by its unit digit
