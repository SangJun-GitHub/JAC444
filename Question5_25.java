package practice;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by bobsang89@gmail.com on 2018-11-15
 * Project: JAC444
 * Github : http://github.com/SangJun-GitHub
 */
public class Question5_25 {
    public static void upPart(int rows){
        int asterisk = 1;
        int space = rows;
        for(int i = 0 ; i < rows; i++){
            space(space);
            asterisk(asterisk);
            space(space);
            System.out.print("\n");
            asterisk+=2;
            space-=1;
        }
    }
    public static void middlePark(int number){
        asterisk(number);
        System.out.print("\n");
    }

    public static void downPart(int number, int rows){
        int asterisk = number-2;
        int space = 1;
        for(int i = 0 ; i < rows; i++){
            space(space);
            asterisk(asterisk);
            space(space);
            System.out.print("\n");
            asterisk-=2;
            space+=1;
        }
    }
    public static void space(int space){
        for(int j =0; j < space; j ++)
            System.out.print(" ");
    }
    public static void asterisk(int asterisk){
        for(int k=0; k< asterisk; k++)
            System.out.print("*");
    }

    public static int findRow(int number){
        int rows =0;
        while(number != 1) {
            number -= 2;
            rows++;
        }
        return rows;
    }


    public static void main(String[] args){
        int number;
        System.out.println("Enter a odd number");
        Scanner s = new Scanner(System.in);
        while(true) {
            try {
                number = s.nextInt();
                if(number%2 !=0){
                    break;
                } else {
                    System.out.println("Enter odd number");
                    s = new Scanner(System.in);
                }
            } catch (InputMismatchException e) {
                System.out.println("Wrong type");
                s = new Scanner(System.in);
            }
        }
        upPart(findRow(number));
        middlePark(number);
        downPart(number, findRow(number));

    }
}
