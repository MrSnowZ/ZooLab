class Lion extends Animal {
    private String maneColor;

    public Lion(String typeOfFood, String name, int age, String maneColor) {
        super(typeOfFood, name, age);
        this.maneColor = maneColor;
    }

    public String getManeColor() {
        return maneColor;
    }

    public void setManeColor(String maneColor) {
        this.maneColor = maneColor;
    }

    @Override
    public void makeNoise() {
        System.out.println("Roar!");
    }
}