package org10.example.abstraction.interfaceExample.publicandabstractmethod;
interface A{
    void methodA();
}
interface B extends A{
    void methodB();
}
class C implements B{
    public void methodA(){
        System.out.println("A from methodA");
    }
    public void methodB(){
        System.out.println("B from methodB");
    }
}
public class InterfaceWithMultilevelInheritance {
    public static void main(String[] args) {
        C obj= new C();
        obj.methodA();
        obj.methodB();
    }
}
