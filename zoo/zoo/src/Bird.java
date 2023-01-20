class Bird extends Animal {
    private boolean canFly;
    
    public Bird(String typeOfFood, String name, int age, boolean canFly) {
        super(typeOfFood, name, age);
        this.canFly = canFly;
    }
    
    public boolean getCanFly() {
        return canFly;
    }
    
    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
    
    @Override
    public void makeNoise() {
        System.out.println("Tweet!");
    }
    }