package exercises;

public class Ocean {
	public static void main(String[] args) {
		SeaCreature Spongebob = new SeaCreature("Spongebob");
		Spongebob.eat();
		Spongebob.laugh();
		
		SeaCreature Patrick = new SeaCreature("Patrick");
		SeaCreature Squidward = new SeaCreature("Squidward");
		
		System.out.println(Patrick.getName());
		System.out.println(Squidward.getName());
		
		Patrick.laugh();
		Squidward.laugh();
	}
}