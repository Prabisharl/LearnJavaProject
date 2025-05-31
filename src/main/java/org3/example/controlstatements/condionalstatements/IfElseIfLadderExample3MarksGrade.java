package org3.example.controlstatements.condionalstatements;

public class IfElseIfLadderExample3MarksGrade {
    public static void main(String[] args) {
        int marks=85;

        if(marks>=90){
            System.out.println("Grade A");
        }else if(marks>=75 && marks<=90){
            System.out.println("Grade B");
        }else if(marks>=50 && marks<=75){
            System.out.println("Grade C");
        }else{
            System.out.println("Fail");
        }
    }
}
