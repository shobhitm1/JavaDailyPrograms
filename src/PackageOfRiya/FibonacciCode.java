package PackageOfRiya;

public class FibonacciCode {

	public static void main(String[] args) {
		//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
     int n1=0;
     int n2=1;
     int n =10;
     
     for ( int i=2;i<n ;i++) {
    	int next= n1+n2;
    	System.out.println(next);
        n1=n2;
        n2=next;
    	 
     }
	}

}
