class Dog extends Animal {
    private String breed;

    public Dog(String typeOfFood, String name, int age, String breed) {
        super(typeOfFood, name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeNoise() {
        System.out.println("Woof woof!");
    }
}