class Animal {
    private String typeOfFood;
    private String name;
    private int age;

    public Animal(String typeOfFood, String name, int age) {
        this.typeOfFood = typeOfFood;
        this.name = name;
        this.age = age;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void makeNoise() {
        System.out.println("Animal make noise.");
    }
}