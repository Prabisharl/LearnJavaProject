package org4.example.arrays.onedimensional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public double minimumAverage(int[] nums) {
        double avg=0;
        List<Integer> l= Arrays.stream(nums).boxed().collect(Collectors.toList());
        List<Double> l2=new ArrayList<Double>();
        Collections.sort(l);
        for(int i=0;i<nums.length;i++){
            if(l!=null && !l.isEmpty()){
                l2.add((double) ((l.get(0)+l.get(l.size()-1))/2));
                l.remove(0);
                l.remove(l.size()-1);

            }
        }
        avg=Collections.min(l2);

        return avg;
    }

}
public class SumElements {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4};
        double result = solution.minimumAverage(nums);
        System.out.println("Minimum average: " + result);

//        int array[]={1,2,3,4,5,6,7};
//
//        int sum=0;
//        for(int i=0;i<array.length;i++){
//            sum=sum+array[i];
//        }
//
//        System.out.println(sum);
//        int x=23;
//        String str=String.valueOf(x);
//        int l=str.length();
//        int sum=0;
//        for(int i=l;i>0;i--){
//            int n=x%10;
//            sum=sum+n;
//            x=x/10;
//        }
//        if(x%sum==0){
//            System.out.println(sum);
//        }
//        else{
//            System.out.println(-1);
//        }


    }
}
