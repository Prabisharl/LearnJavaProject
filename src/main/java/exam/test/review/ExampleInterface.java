package exam.test.review;
interface AnimalCat{
    void eat();
    void sleep();
}
interface AnimalDog{
    void bark();
    void noise();
}
class interfaceExecutes implements AnimalCat, AnimalDog {
    public void eat(){
        System.out.println("Cat will eat biscuits");
    }
    public void sleep(){
        System.out.println("Cat will sleep unneccessary");
    }
    public void bark(){
        System.out.println("Dog will always bark");
    }
    public void noise(){
        System.out.println("Dog will make noise unnecessary");
    }

}
public class ExampleInterface {
    public static void main(String[] args) {
        interfaceExecutes obj=new interfaceExecutes();
        obj.eat();
        obj.sleep();

    }
}
