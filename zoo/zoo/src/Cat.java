class Cat extends Animal {
    private boolean isOutdoor;

    public Cat(String typeOfFood, String name, int age, boolean isOutdoor) {
        super(typeOfFood, name, age);
        this.isOutdoor = isOutdoor;
    }

    public boolean getIsOutdoor() {
        return isOutdoor;
    }

    public void setIsOutdoor(boolean isOutdoor) {
        this.isOutdoor = isOutdoor;
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow!");
    }
}