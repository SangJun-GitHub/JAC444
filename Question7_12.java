package practice;

import java.util.*;

/**
 * Created by bobsang89@gmail.com on 2018-11-15
 * Project: JAC444
 * Github : http://github.com/SangJun-GitHub
 */
public class Question7_12 {
    public static void main(String[] args){
        Set fiveNumber = new HashSet(5);
        System.out.println("Enter numbers between 10 to 100");
        int count = 1;
        int number;
        while(count !=6) {
            System.out.println("Enter " + count + " number");
            Scanner s = new Scanner(System.in);
            while(true) {
                try {
                    number = s.nextInt();
                    if(number>=10 &&number<=100){
                        break;
                    } else {
                        System.out.println("Enter a number between 10 to 1000");
                        s = new Scanner(System.in);
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Wrong type");
                    s = new Scanner(System.in);
                }
            }
            fiveNumber.add(number);
            count++;
        }
        List result = new ArrayList(fiveNumber);
        Collections.sort(result);
        System.out.print("Result is : ");
        for(Object num: result)
            System.out.print(num+" ");
    }
}
