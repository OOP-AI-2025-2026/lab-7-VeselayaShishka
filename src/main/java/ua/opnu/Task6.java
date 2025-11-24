package ua.opnu;
import java.util.function.*;
import static java.lang.Math.pow;

public class Task6 {

    static void main(String[] args){

        Function func = o ->{
          int val = (int) o;
          return pow(2,val);
        };

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        for(int i: arr){
            System.out.println(func.apply(i));
        }
    }
}