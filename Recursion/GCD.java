// Greatest Common divisor
public class GCD{
	public static void main(String args[]){
		int a=100;
		int b=10;
		System.out.println(gcd(a,b));
	}
	
	public static int gcd(int a,int b){
		if(b==0){
			return a;
		}else{
			return gcd(b,a%b);
		}
	}
	
}