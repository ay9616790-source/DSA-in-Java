package opps;

public class MethodOverriding {
    public static void main(String[] args) {
        Sanjet sc=new Sanjet();
        sc.eats();
    }
}
class Humans{
    void eats(){
        System.out.println("Eats everything");

    }
}
class Sanjet extends Humans{
    void eats(){
        System.out.println("Eats only veg");
    }
}
