package lab7.abstractsuperclassanimal;

public class BigDog extends Dog{
    public BigDog(String name) {
        super(name);
    }
    public void greets(){
        System.out.println("Wooow");
    }
    public void greets(Dog another){
        System.out.println("Wooooooooow");
    }
    public void greets(BigDog another){
        System.out.println("Wooooooooooooooooooooooow");
    }
}
