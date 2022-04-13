package chapter7.practice;

import java.util.Arrays;

public class Q3 {
    public static void main(String[] args){
        int[] array = new int[5];

        
        for(int i=1; i<11;i++){
            if(i%2 == 0){
                array[i/2-1]= i;
            }
        }

        System.out.println("배열의 합 : " + Arrays.stream(array).sum());
    }
}
