import java.math.BigInteger;
import java.util.Random;

class Calculate
{
	BigInteger p,q,phi,n,e;
	Random r = new Random();
	int bitLength = 1024;
	
	public Calculate() 
	{
		//generating random large prime numbers
		p=BigInteger.probablePrime(bitLength, r);
		q=BigInteger.probablePrime(bitLength, r);
		e=BigInteger.probablePrime(bitLength, r);
		n = BigInteger.probablePrime(bitLength / 2, r);
	}
	
	void calFn()
	{
		//f(n) = (p-1)(q-1)
		phi = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
	}
	
}


public class RSA 
{
	public static void main()
	{
		Calculate cal = new Calculate();
		cal.calFn();
		
		while(cal.phi.gcd(cal.e).compareTo(BigInteger.ONE) > 0 && cal.e.compareTo(cal.phi)<0 )
		{
			cal.e.add(BigInteger.ONE);
		}
		
		
		
	}
}
