public class Main {
    public static void main(String[] args) {
        Frog newFrog = new Frog(); //Init Frog


        //Setting our attributes
        newFrog.setColour("Green");
        newFrog.setPosition(2);
        newFrog.setName("Bernie");

        //Outputting Frog Name
        System.out.println("Name of Frog: "+newFrog.getName());

        newFrog.setSex(true); //True = male, Boolean because it's more memory efficient

        Frog anotherFrog = new Frog();

        anotherFrog.setName("Herbert");
        anotherFrog.setPosition(1);
        anotherFrog.setColour("Red");
        anotherFrog.setSex(false);
    }
}
