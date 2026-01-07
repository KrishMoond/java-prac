public class VarShad {
	String name = "Alice";           // instance variable
	static String company = "Acme";  // static (class) variable

	public void demonstrate(String name) { // parameter shadows instance variable
		System.out.println("Inside demonstrate():");
		System.out.println("  parameter name = " + name);
		System.out.println("  instance name  = " + this.name);
		System.out.println();
	}

	public void localShadow() {
		String name = "Bob"; // local variable shadows instance variable
		System.out.println("Inside localShadow():");
		System.out.println("  local name    = " + name);
		System.out.println("  instance name = " + this.name);
		System.out.println();
	}

	public static void main(String[] args) {
		VarShad vs = new VarShad();

		// parameter shadowing
		vs.demonstrate("Charlie");

		// local variable shadowing
		vs.localShadow();

		// static vs local shadowing
		String company = "Globex"; // local shadows static `company` in this scope
		System.out.println("In main():");
		System.out.println("  local company  = " + company);
		System.out.println("  static company = " + VarShad.company);
		System.out.println();

		// showing how to assign parameter/local value to instance variable
		System.out.println("Before assignment, instance name = " + vs.name);
		vs.demonstrateAndAssign("Diana");
		System.out.println("After assignment, instance name  = " + vs.name);
	}

	// Helper to show assigning parameter to instance using `this`
	public void demonstrateAndAssign(String name) {
		System.out.println("demonstrateAndAssign: parameter name = " + name);
		this.name = name; // use `this` to refer to instance variable
	}
}
