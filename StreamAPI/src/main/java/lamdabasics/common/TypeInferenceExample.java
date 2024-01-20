package lamdabasics.common;

public class TypeInferenceExample {

	public static void main(String[] args) 
	{
		// StringLengthLambda lambda = (String s) -> s.length();
		//type inference  gs
	//	StringLengthLambda lambda = (s) -> s.length();
		StringLengthLambda lambda = s -> s.length();
		System.out.println(lambda.getLengh("Ghulam sarwar"));
	}
}
interface StringLengthLambda {
	public int getLengh(String s);
}