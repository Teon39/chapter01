package chapter01;

public class Arith {

	public static void main(String[] args) {
		int a = 3;
		int b = 7;
		int r1 = a+b;
		System.out.println(r1);
		int r2 = a-b;
		System.out.println(r2);
		int r3 = a*b;
		System.out.println(r3);
		int r4 = a/b;
		System.out.println(r4);
		int r5 = a%b;
		System.out.println(r5);
		
		//int끼리 하면 int
		System.out.println(10/3);
		System.out.println(10/3.);
		
		//증감연산자
		int n = 1;
		//후위
		n++;
		System.out.println(n);
		n--;
		System.out.println(n);
		//전위
		++n;
		System.out.println(n);
		--n;
		System.out.println(n);
		
		//축약형
		n += 10;
		System.out.println(n);
		n -= 10;
		System.out.println(n);
		n *= 10;
		System.out.println(n);

	}

}
