public class Frog {
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public int getPosition() {
        return position;
    }
    public void setPosition(int position) {
        this.position = position;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean isSex() {
        return sex;
    }
    public void setSex(boolean sex) {
        this.sex = sex;
    }

    private String colour; //Colour of frog
    private int position; //Where the frog is ig
    private boolean sex; //What sex the frog is
    private String name; //Name of frog

    public Frog(){} //For null initialisations

    public Frog(String colour, int position, String name, boolean sex){
        this.colour = colour;
        this.position = position;
        this.name = name;
        this.sex = sex;
    }

    public int copyFrogColour(Frog extFrog){
        try{
            this.colour = extFrog.getColour();
            return 200;
        }catch (Exception e){
            e.printStackTrace();
            return -1;
        }
    }
    public void moveLeft(){
        this.position --;
        if(this.position < 1){
            this.position = 1;
        }
    }
    public void moveRight(){
        this.position ++;
        if(this.position > 5){
            this.position = 5;
        }
    }
}
