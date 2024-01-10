package exceptionHandling;

public class ThrowKeywordDemo 
{

	public static void main(String[] args) throws StringNullException {
		String s1=null;
		if(s1==null) {
			throw new StringNullException("String Object is Null"); //add throws declaration
		}
	}
}
