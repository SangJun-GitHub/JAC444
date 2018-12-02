package practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by bobsang89@gmail.com on 2018-12-01
 * Project: JAC444
 * Github : http://github.com/SangJun-GitHub
 */
public class ArrayRead {
    public static void main(String[] args){
        System.out.println("Enter a number");
        int number = new Scanner(System.in).nextInt();
        arrayCreate a = new arrayCreate();
        a.createArray(number);
        System.out.println(a);
        System.out.println("Max: " + a.findMax());
        System.out.println("Min: " +a.findMin());
    }

    public static class arrayCreate{
        int[] array;
        final int MIN = 10;
        final int MAX = 2000;

        @Override
        public String toString() {
            return "array=" + Arrays.toString(array) +
                    '}';
        }

        public void createArray(int number){
            int[] tmp = new int[number*2];
            for(int i =0; i< tmp.length; i++){
                tmp[i] = (int)(Math.random()*(MAX-MIN)+1)+MIN;
            }
            array = tmp;
        }

        public int findMin(){
            int min = MIN;
            int max = MAX;
            int result = 0;
            for(int i = 0; i< array.length; i++){
                if(max > array[i] && array[i] > min) {
                    result = array[i];
                    max = array[i];
                }
            }
            return result;
        }

        public int findMax(){
            int min = MIN;
            int max = MAX;
            int result = 0;
            for(int i = 0; i< array.length; i++){
                if(max > array[i] && array[i] > min) {
                    result = array[i];
                    min = array[i];
                }
            }
            return result;
        }
    }
}
