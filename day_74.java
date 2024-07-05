import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Pairs-Unit Digit Sum
		String[] str=new Scanner(System.in).next().split("");
		int und=Integer.parseInt(str[str.length-1]);
		List<Integer> ip=new ArrayList<>();
		for(String i : str){
		    ip.add(Integer.parseInt(i));
		}
		int c=0;
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<ip.size()-1;i++){int id=0;
		    for(int j=i+1;j<ip.size()-1;j++){
		        if((int)((int)ip.get(i)+(int)ip.get(j))==und&&(!set.contains(ip.get(i))&&!set.contains(ip.get(j)))){
		            id=j;
		            set.add(ip.get(i));
		            set.add(ip.get(j));
		           c++;
		          //  System.out.println(ip.get(i)+" "+ip.get(j));
		         
		           
		        }}}
		    
		
		System.out.print((c==0)?-1:c);

	}
}



