package org11.example.collections.listInterface.arraylist;

import java.util.ArrayList;
/* In array, If we give no values for the string array it defaultly set as null and for the integer array set as 0 */

public class ExampleArraylist {
    public static void main(String[] args) {
        //array
//        String[] fishArr=new String[10];
//        fishArr[2]="trout";
//        fishArr[0]="salmon";
//        fishArr[1]="tuna";
//        fishArr[1]="bass"; //overwriting//
//        System.out.println(fishArr[0]);//get
//       for(int i=0;i<fishArr.length;i++){
//           System.out.println(fishArr[i]);
//       }
//       int[] fishArr2=new int[5];
//       fishArr2[0]=1;
//       fishArr2[2]=3;
//       for(int i=0;i<fishArr2.length;i++){
//           System.out.println(fishArr2[i]);
//       }



        //arraylist
        ArrayList<String> fishArrList=new ArrayList<String>();/*create empty arraylist with size 0*/
        fishArrList.add("salmon");

        //add(Object o)
        fishArrList.add("tuna1");
        //add(int index, Object element)
        fishArrList.add(1,"tuna2");
        //set(int index, E element)
        fishArrList.set(1,"bass");//overwriting- set method
        //remove(int index)
        fishArrList.remove(1);//remove method
        //get(int index)
        System.out.println(fishArrList.get(0));//get method
        System.out.println(fishArrList); //print all values without loop is possible in arraylist


    }

}
