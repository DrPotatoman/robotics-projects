package CatFactory;

public class Factory {
    
    public static void main(String[] args) {
        
        CatCreator y = new CatCreator("bobby", false, "Purple");
        y.cat();
        y.setCallories(635);
        System.out.println("This cat is " + y.getCallories() + " callories.");
        System.out.println("Cat Factory reset");

        CatCreator z = new CatCreator("fatso", true, "orange");
        z.cat();
        z.setCallories(120000);
        System.out.println("This cat is " + z.getCallories() + " callories.");
        System.out.println("Cat Factory reset");

        CatCreator x = new CatCreator("bones", false, "white");
        x.cat();
        x.setCallories(3);
        System.out.println("This cat is " + x.getCallories() + " callories.");
        System.out.println("Cat Factory reset");

    }
}