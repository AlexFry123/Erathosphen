import java.util.ArrayList;
import java.util.List;

public class Algorithm {

	private static int[] algorithm(int n) {
		int[] tmp = new int[n+1];
		int p = 0;
		for(;p<=n; p++) {
			tmp[p] = p;
		}
		for(p=2; p<=n; p++) {
		int multiplier = 2;
		for(int num=0; num<tmp.length; num++) {
			if(num == multiplier*p) {
				tmp[num] = 0;
				multiplier+=1;
			}
		}
		}
		return tmp;	
	}
	
	public static void main(String[] args){
		int[] tmp =  algorithm(50);
		for(int num : tmp) {
			if(num!=0)
			System.out.println(num);
		}
	}
}
