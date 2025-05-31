package org13.example.functionalInterfaceAndLambdaExpression;
@FunctionalInterface
interface Test1{
    void print();
}


public class Type4PassingFunctionalInterfaceInNonParametrizedMethod {
    //static method for passing functional interface
    static void fun(Test1 t){
        t.print();
    }

    public static void main(String[] args) {
      fun(()-> System.out.println("I am print() method implementation of Functional Interface in lambda expression"));
    }
}

//Concrete class
//class Test2 implements Test1{
//public void print() {
//    System.out.println("Implementation of concrete Functional interface");
//}}
//class Test3{
//    static void fun(Test1 t){
//        t.print();
//    }
//    public static void main(String[] args) {
//       Test2 obj=new Test2();
//       fun(obj);
//    }
//}


//Anonymous class
//class Test2{
//    static void fun(Test1 t){
//        t.print();
//    }
//    public static void main(String[] args) {
//        fun(new Test1(){
//            public void print(){
//                System.out.println("I am anonymous class implementation");
//            }
//        });
//    }
//}