package exercises;

public class Smurf {

	private String name;
	private static String papa = "papa";
	private static String smurfet = "smurfet";
	private static int papaCount = 0;
	private static int smurfetCount = 0;

	public static Smurf createSmurf(String name) {
		if (name == papa) {
			if (papaCount > 0) {
				return null;
			}
			papaCount++;
		}
		
		if (name == smurfet) {
			if (smurfetCount > 0) {
				return null;
			}
			smurfetCount++;
		}
		
		System.out.println("Creating " + name + " Smurf");
		return new Smurf(name);
	}

	private Smurf(String name) {
		this.name = name;
	}

	public void printName() {
		System.out.println("My name is " + name + " Smurf.");
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

}
