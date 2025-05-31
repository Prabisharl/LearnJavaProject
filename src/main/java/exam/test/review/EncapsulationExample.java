package exam.test.review;
//need editing
import org.w3c.dom.ls.LSOutput;

class Example{
    private String name;
    private int age;

    public void setValues(String name, int age){
        this.name=name;
        this.age=age;
    }
    public Example getValues(){
        return this;
    }
}
public class EncapsulationExample {


    public static void main(String[] args) {
Example obj=new Example();
obj.setValues("Prabisha",67);
System.out.println(obj.getValues());
    }
}
