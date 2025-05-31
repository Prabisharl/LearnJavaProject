package org12.example.exception.userDefined;
//
//
//public class BankAccount extends Exception {
//    private int accountNo[]={1001,1002,1003,1004,1005};
//    private String name[]={"Hena","Hama", "Hari","Veena","Vishnu"};
//    private double bal[]={99999,40000,50000,20000,400};
//
//
//    BankAccount(String str){
//        super(str);
//    }
//
//    public static void main(String[] args) {
//      BankAccount a=new BankAccount();
//      try{
//          for(int i=0;i<5;i++){
//              System.out.println(a.accountNo[i]+" "+a.name[i]);
//              if(a.bal[i]<1000){
//                  throw new BankAccount("This is custom Exception");
//              }
//          }
//      }
//      catch(BankAccount e){
//          System.out.println(e);
//      }
//    }
//}
