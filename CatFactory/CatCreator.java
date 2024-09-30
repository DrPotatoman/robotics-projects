package CatFactory;

public class CatCreator {
    String name;
    String color;
    boolean smart;
    private int callories;

    public CatCreator(String name, boolean smart, String color){
        this.name = name;
        this.color = color;
        this.smart = smart;
        this.callories = 300;
    }
    public int getCallories(){
        return callories;
    }
    public void setCallories(int newCallories){
        if (newCallories<1) {
            newCallories = 1;
        }
            callories = newCallories;
            
        }

    public void cat(){
        System.out.println("------------------------------------------------------------");
        System.out.println("3");
        System.out.println("2");
        System.out.println("1");
        System.out.println("Cat factory is running, please step back from the machine.");
        System.out.println("Cat created.");
        System.out.println("Cat specifications:");
        System.out.println("The cat's name is " + name);
        System.out.println("the cat is " + color);

        if (smart==true) {
            System.out.println("the cat is smart");
        }
        if (smart==false) {
            System.out.println("this cat is stupid");
        }
    }
}