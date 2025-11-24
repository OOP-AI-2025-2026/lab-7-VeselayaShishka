package ua.opnu;
import java.util.function.*;

public class Task5 {
    static void main(String[] args) {
        Consumer consumer = (i) -> System.out.println(i);

        Predicate pr = o ->{
            int i = (int) o;

            return i%2==0;
        };
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        check(arr,pr,consumer);
    }

    static void check(int[] arr,Predicate pr, Consumer cs){
        for(int i:arr){
            if(pr.test(i)){
                cs.accept(i);
            }
        }
    }
}
