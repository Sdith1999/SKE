package opl;

public class you {
	static String bondString (String name,String surname){
		String fullname=name+" "+ surname;
		return fullname;
		
		
		
	}
	public static void main(String[] args){
		String myName = bondString("john","doe");
		System.out.println(myName);
	}

}
