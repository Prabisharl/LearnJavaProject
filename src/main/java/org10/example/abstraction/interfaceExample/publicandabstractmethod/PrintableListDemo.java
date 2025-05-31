package org10.example.abstraction.interfaceExample.publicandabstractmethod;

interface PrintablePaper{
   void print();
}
class Documents implements PrintablePaper{
    public void print(){
        System.out.println("Printing a document");
    }
}
class Photo implements PrintablePaper{
    public void print(){
        System.out.println("Printing a photo");
    }
}
public class PrintableListDemo {
    public static void main(String[] args) {
        Documents documents = new Documents();
        documents.print();
        Photo photo = new Photo();
        photo.print();


    }
}
