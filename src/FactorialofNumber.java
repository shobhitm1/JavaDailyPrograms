
public class FactorialofNumber {

	public static void main(String[] args) {
		
		int num=4;
		int factorial=1;
		for(int i=1;i<=num;i++) {
			factorial=factorial*i; //1*1 //1*2 // 2*3 // 6*4
		}
		System.out.println(factorial);
	}

}
