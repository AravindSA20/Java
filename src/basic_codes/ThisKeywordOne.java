package basic_codes;

public class ThisKeywordOne {
	public void amma() {
		System.out.println("Amma is calling..!");
	    this.appa();
	}
	
	public void appa() {
		System.out.println("Appa is calling..!");
	}
	
	public static void main(String[] args) {
		ThisKeywordOne sa=new ThisKeywordOne();
		sa.amma();
		
	}

}
