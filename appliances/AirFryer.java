package appliances;

public class AirFryer extends Toaster {

    public AirFryer(String name){
        super(name);

    }
    public void fry(){
        System.out.println("YUM-- It is Fried.");
        int x = 0;
        while(x<12){
            x++;
            System.out.println(x);

        }
        for(int y=11; y>1; y-- ){
            System.out.println(y);

        }
    }
    @Override public void toast(){
        super.toast();//Optional-does the parent class's version
        System.out.println("Are you sure that you want toast, fry is better.");

    }
}
