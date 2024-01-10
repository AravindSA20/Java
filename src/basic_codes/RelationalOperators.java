package basic_codes;

public class RelationalOperators {
	public static void main(String[] args) {
		
	int u=100;
	int v=100;
	int p=120;
	int q=120;
	int i=70;
	int r=87;
	int s=88;
	// u & v=100 -- p & q=120 -- i=70 -- r=87 -- s=88
	
	System.out.println("Less than < : "+(i<s)); //true
	System.out.println(s<r); //false because s is greater than r
	
	System.out.println("Greater than > : "+(q>v)); //true
	System.out.println(v>p); //false because p is greater than v

	System.out.println("Lesser than and Equal to <= :"+(u<=v)); //true
	System.out.println(i<=p); //true
	System.out.println(p<=u); //false
	
	System.out.println("Greater than and Equal to >= :"+(r>=i)); //true
	System.out.println(p>=q); //true
	System.out.println(i>=r); //false
	
	System.out.println("Equal to/Comparison Operator == :"+(p==q)); //true
	System.out.println(r==s); //false
	
	System.out.println("Not Equal to != :"+(r!=s)); //true
	System.out.println(p!=q); //false
	
	}
}
