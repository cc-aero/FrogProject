public class Cat {
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public boolean isSex() {
        return sex;
    }
    public void setSex(boolean sex) {
        this.sex = sex;
    }

    private String name;
    private String breed;
    private String colour;
    private boolean sex;

    public Cat(){}
    public Cat(String name,String breed, String colour, boolean sex){
        this.name = name;
        this.breed = breed;
        this.colour = colour;
        this.sex = sex;
    }

    public String meow(){
        return (this.name+" says: meow!    "+
                this.name+" is a "+
                this.breed+" cat. Their colour is "+
                this.colour+" and their sex is "+
                (this.sex ? "Male" : "Female")+".");
    }
}
