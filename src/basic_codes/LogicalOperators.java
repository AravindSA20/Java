package basic_codes;

public class LogicalOperators {
	/*
	 * c1   c2    c1 && c2(AND)    c1 || c2(OR)    !c2(NOT)
	 *  T    T         T              T              F
	 *  T    F         F              T              T
	 *  F    T         F              T              F
	 *  F    F         F              F              T
	 */
	public static void main(String[] args) {
	    int u=100;
		int v=100;
		int p=120;
		int q=120;
		int i=70;
		int r=87;
		int s=88;
		// u & v=100 -- p & q=120 -- i=70 -- r=87 -- s=88
		
		//AND(&&)
		System.out.println((u==v) && (p==q)); //true
		System.out.println((u==v) && (i>=u)); //false
		System.out.println((r>s) && (p==q)); //false
		System.out.println((p!=q) && (s<i)); //false
		
		System.out.println("--------OR--------");
		
		//OR(||)
		System.out.println((u==v) || (p==q)); //true
		System.out.println((u==v) || (i>=u)); //true
		System.out.println((r>s) || (p==q)); //true
		System.out.println((p!=q) || (s<i)); //false
		
		System.out.println("--------NOT--------");
		
		//NOT(!_) --> To convert True to False and Vice versa
		System.out.println((p==q)); //true
		System.out.println(!(p==q)); //false
		System.out.println(!(i>s));  //true
		System.out.println(!(r>=i)); //false
		
		int sa=20;
		System.out.println(sa>20); //false
		System.out.println(!(sa>20)); //true
		
		System.out.println(true); //true
		System.out.println(!(true)); //false
		
		System.out.println("--------Assignment Operators--------");
		
		//Assignment (=)
		int a=15;
		System.out.println(a);
		
		//Compound Assignment (+=,-=,*=,/=,%=)
		a+=10; //a=a+10 
		System.out.println(a); //25
		
		a-=5; //a=25-5
		System.out.println(a); //20
		
		a*=2; //a=20*2
		System.out.println(a); //40
		
		a/=4; //a=40/4
		System.out.println(a); //10
		
		a%=3; //a=10%3
		System.out.println(a); //1 which is the reminder of 10%3
		//Value of a gets changed according to the updated result
	}

}
