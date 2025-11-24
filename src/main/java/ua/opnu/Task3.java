package ua.opnu;
import java.util.Arrays;
import java.util.Objects;
import java.util.function.Predicate;

public class Task3 {

    static void main(String[] args) {

        Predicate pr = o ->{
            Task2.Student st  = (Task2.Student)o;
            int[] marks = st.getMarks();
            for(int i : marks) {
                if(i<60) return false;
            }
            return true;
        };
        Predicate pr1 = o->{
          Task2.Student s  = (Task2.Student)o;
            return Objects.equals(s.getGroup(), "AS-236");
        };

        Task2.Student[] s = {new Task2.Student("Gosha","AS-236",new int[]{60,50,60})
                ,new Task2.Student("Kolya","AS-236",new int[]{70,100,80})
                , new Task2.Student("Nikita","AS-216",new int[]{60,76,65})
                ,new Task2.Student("Nikolay","AS-236",new int[]{70,90,70})
        };

        Task2.Student[] s2 = filter(s,pr,pr1);

        for(Task2.Student st : s2){
            System.out.println(st.getName());
        }
    }

    static Task2.Student[] filter(Task2.Student[] s, Predicate p, Predicate p2){
        Task2.Student[] s2 = new Task2.Student[s.length];

        int pos = 0;
        for(Task2.Student st : s ){
            if(p.test(st)&&p2.test(st)){
                s2[pos] = st;
                pos++;
            }
        }

        return Arrays.copyOf(s2, pos);
    }
}
