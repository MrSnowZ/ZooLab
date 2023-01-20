class Elephant extends Animal {
    private int trunkLength;

    public Elephant(String typeOfFood, String name, int age, int trunkLength) {
        super(typeOfFood, name, age);
        this.trunkLength = trunkLength;
    }

    public int getTrunkLength() {
        return trunkLength;
    }

    public void setTrunkLength(int trunkLength) {
        this.trunkLength = trunkLength;
    }

    public void makeNoise() {
        System.out.println("Trumpet!");
    }
}