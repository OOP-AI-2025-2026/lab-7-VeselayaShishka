package ua.opnu;
import java.util.function.*;

public class Task7 {
    static void main(String[] args){

        Function func = o->{
          int i = (int)o;
          switch(i){
              case 0: return "zero";
              case 1: return "one";
              case 2: return "two";
              case 3: return "three";
              case 4: return "four";
              case 5: return "five";
              case 6: return "six";
              case 7: return "seven";
              case 8: return "eight";
              case 9: return "nine";
          }
          return i;
        };
        int[] arr = {0,1,2,3,4,5,6,7,8,9};

        String[] str = stringify(arr, func);

        for(String s: str){
            System.out.println(s);
        }
    }

    static String[] stringify(int[] arr, Function f){
        String[] str = new String[arr.length];

        for (int i =0; i < arr.length; i++){
            str[i] = (String) f.apply(i);
        }
        return str;
    }
}
