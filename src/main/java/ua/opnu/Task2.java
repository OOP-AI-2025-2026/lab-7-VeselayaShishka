package ua.opnu;
import java.util.Arrays;
import java.util.function.Predicate;
public class Task2 {
    static class Student {
        private String name;
        private String group;
        private int[] marks;

        public Student(String name, String group, int[] marks) {
            this.name = name;
            this.group = group;
            this.marks = marks;
        }
        public String getName() {
            return name;
        }
        public int[] getMarks() {
            return marks;
        }
        public String getGroup() {
            return group;
        }
    }

    static void main(String[] args) {

        Predicate pr = o ->{
            Student st  = (Student)o;
            int[] marks = st.getMarks();
            for(int i : marks) {
                if(i<60) return false;
            }
            return true;
        };

        Student[] s = {new Student("Gosha","AS-224",new int[]{60,50,60})
                ,new Student("Kolya","AS-236",new int[]{70,100,80})
                , new Student("Nikita","AS-216",new int[]{60,76,65})
        };

        Student[] s2 = filter(s,pr);

        for(Student st : s2){
            System.out.println(st.getName());
        }
    }

    static Student[] filter(Student[] s, Predicate p){
        Student[] s2 = new  Student[s.length];

        int pos = 0;
        for(Student st : s ){
            if(p.test(st)){
                s2[pos] = st;
                pos++;
            }
        }

        return Arrays.copyOf(s2, pos);
    }
}