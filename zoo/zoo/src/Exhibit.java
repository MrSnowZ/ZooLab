import java.util.ArrayList;

public class Exhibit {
    private String name;
    private ArrayList<Animal> animals = new ArrayList<Animal>();
    
    
    public Exhibit(String name) {
        this.name = name;
    }
    
    public void addAnimals(Animal animal) {
        animals.add(animal);
    }
    
    public void feedAnimals() {
        for (Animal animal : animals) {
            animal.eat();
        }
    }
    
    public void letAnimalsSleep() {
        for (Animal animal : animals) {
            animal.sleep();
        }
    }
    
    
    public void makeAnimalsNoise() {
        for (Animal animal : animals) {
            animal.makeNoise();
        }
    }
    

    public void makeAnimalsRoam() {
        for (Animal animal : animals) {
            animal.roam();
        }
    }

    
    /*public void makeAnimalsPlay() {
        for (Animal animal : animals) {
            animal.play();
        }
    }
    */
    
    
    public void makeAnimalsHunt() {
        for (Animal animal : animals) {
            animal.hunt();
        }
    }

    
    public void makeAnimalsSwim() {
        for (Animal animal : animals) {
            animal.swim();
        }
    }

    
    public void makeAnimalsFly() {
        for (Animal animal : animals) {
            animal.fly();
        }
    }
    
    
    public void makeAnimalsClimb() {
        for (Animal animal : animals) {
            animal.climb();
        }
    }
    
    public void makeAnimalsWalk() {
        for (Animal animal : animals) {
            animal.walk();
        }
    }
    
    public void makeAnimalsRun() {
        for (Animal animal : animals) {
            animal.run();
        }
    }
    
    public void makeAnimalsPurr() {
        for (Animal animal : animals) {
            animal.purr();
        }
    }
    
    public void makeAnimalsGrowl() {
        for (Animal animal : animals) {
            animal.growl();
        }
    }
    
    public void makeAnimalsBark() {
        for (Animal animal : animals) {
            animal.bark();
        }
    }
    


    public void listAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal.getName());
        }
    }
}
