package ua.opnu;
import java.util.function.*;

import static java.lang.Math.sqrt;

public class Task1 {

    static void main(String[] args) {

        Predicate pr = o -> {
            int a = (int) o;
            for(int i = 2; i <= sqrt(a); i++) {
                if(a%i ==0) return false;
            }
            return true;
        };

        System.out.println(pr.test(11));
        System.out.println(pr.test(12));
    }
}
