
import java.math.BigInteger;
import java.util.Scanner;
public class loop_5 {
	public static BigInteger factorial(long n){
		BigInteger gt = new BigInteger("1");
		for (long i = 2; i <= n; i++)
			gt = gt.multiply(BigInteger.valueOf(i));
		return gt;
	}
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
		BigInteger l = factorial(n);
		System.out.println("Factorial of "+ n +" is "+l);
		System.out.println("Factorial of "+l.abs());
		sc.close();
	}
}

