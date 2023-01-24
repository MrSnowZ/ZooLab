import java.util.ArrayList;

class Zoo {
    private ArrayList<Exhibit> exhibits = new ArrayList<Exhibit>();
    
    public void addExhibit(Exhibit exhibit) {
        exhibits.add(exhibit);
    }
    
    public void feedAnimals() {
        for (Exhibit exhibit : exhibits) {
            exhibit.feedAnimals();
        }
    }
    
    public void letAnimalsSleep() {
        for (Exhibit exhibit : exhibits) {
            exhibit.letAnimalsSleep();
        }
    }
    
    public void makeAnimalsNoise() {
        for (Exhibit exhibit : exhibits) {
            exhibit.makeAnimalsNoise();
        }
    }
    
    public void makeAnimalsRoam() {
        for (Exhibit exhibit : exhibits) {
            exhibit.makeAnimalsRoam();
        }
    }
    
    public void makeAnimalsPlay() {
        for (Exhibit exhibit : exhibits) {
            exhibit.makeAnimalsPlay();
        }
    }
    
    public void makeAnimalsHunt() {
        for (Exhibit exhibit : exhibits) {
            exhibit.makeAnimalsHunt();
        }
    }
    
    public void makeAnimalsSwim() {
        for (Exhibit exhibit : exhibits) {
            exhibit.makeAnimalsSwim();
        }
    }
    
    public void makeAnimalsFly() {
        for (Exhibit exhibit : exhibits) {
            exhibit.makeAnimalsFly();
        }
    }
    
    public void listAnimals() {
        for (Exhibit exhibit : exhibits) {
            exhibit.listAnimals();
        }
    }
}