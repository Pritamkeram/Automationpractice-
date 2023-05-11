package Day2VariableExample1;

public class Variable1 {
	static int account;
	double sallary;
	public static void main(String[] args) {
		// Static and global variable
		int age= 30, empId;
		System.out.println("Program Starts");
		System.out.println("Local Variable age : "+age);
		System.out.println("Static global variable is:" +account);
		System.out.println("Std Static global variable is:" +Variable1.account);
		// Create an instance to load non-static global variable rollNum into the memory
		Variable1 N1= new Variable1();
		System.out.println("Static global variable salary : "+ N1.sallary);
		System.out.println("Program Ends");

	}

}
