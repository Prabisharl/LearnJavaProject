package exam.test.review;

public class Primenofind {
    public static void main(String[] args) {
        int num=9;

        int flag=0;
        if(num==1){
            System.out.println("Prime number");
        }else{
            if(num>1){

                for(int i=2;i<=num/2;i++){
                    if(num%i==0){
                       flag=1;
                        break;
                    }

                }
                if(flag==0){
                    System.out.println("number is prime number");
                }else{
                    System.out.println("Number is not prime number");
                }

            }
        }
    }
}
