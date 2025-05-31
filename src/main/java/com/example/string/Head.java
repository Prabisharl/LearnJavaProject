package com.example.string;

public class Head {
    static void displayShape1(Object[] obj) {
        for(Object o : obj){
            if (o instanceof SubHead1) {
                SubHead1 subHead1 = (SubHead1) o;
                subHead1.sum();
            }else if (o instanceof SubHead2) {
                SubHead2 subHead2 = (SubHead2) o;
                subHead2.print();
            }else if (o instanceof SubHead3) {
                SubHead3 subHead3 = (SubHead3) o;
                subHead3.display(2,4);
            }
            else{
                System.out.println("unknown object");
            }
        }


    }

    public static void main(String[] args) {
        SubHead1 obj1 = new SubHead1();
        SubHead2 obj2 = new SubHead2();
        SubHead3 obj3 = new SubHead3();

        Object[] obj = {obj1, obj2, obj3};
        displayShape1(obj);

    }

}
