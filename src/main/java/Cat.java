public class Cat {
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
