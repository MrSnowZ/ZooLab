public class ZooTest {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo();
        Zoo zoo2 = new Zoo();

        Exhibit exhibit1 = new Exhibit("African Savannah");
        exhibit1.addAnimals(new Lion("meat", "Simba", 6, "golden"));
        exhibit1.addAnimals(new Elephant("plants", "Dumbo", 12, 5));

        Exhibit exhibit2 = new Exhibit("Aquatic Life");
        exhibit2.addAnimals(new Shark("fish", "Jaws", 8));
        exhibit2.addAnimals(new Dolphin("fish", "Flipper", 10));

        zoo1.addExhibit(exhibit1);
        zoo1.addExhibit(exhibit2);

        Exhibit exhibit3 = new Exhibit("Jungle");
        exhibit3.addAnimals(new Tiger("meat", "Rajah", 7));
        exhibit3.addAnimals(new Gorilla("plants", "King Kong", 15));

        Exhibit exhibit4 = new Exhibit("Birds");

        zoo2.addExhibit(exhibit3);
        zoo2.addExhibit(exhibit4);
    
        System.out.println("Zoo 1 animal types: " + zoo1.getAnimals());
        System.out.println("Zoo 2 animal types: " + zoo2.getAnimals());
    
        // simulate a day in zoo1
        System.out.println("\nSimulating a day in zoo 1:");
        System.out.println("Feeding animals...");
        zoo1.feedAnimals();
        System.out.println("Animals making noise..."