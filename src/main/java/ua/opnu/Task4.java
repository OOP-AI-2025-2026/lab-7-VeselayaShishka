package ua.opnu;
import java.util.function.Consumer;
import ua.opnu.Task2.Student;

public class Task4 {

   static class Student4 extends Student{
        String surname;

        public Student4(String name,String surname, String group, int[] marks){
            super(name, group, marks);
            this.surname = surname;
        }

        String getSurname(){
            return surname;
        }
    }

    static void main(String[] args){
        Student4[] s = {new Student4("Gosha","Rubik","AS-236",new int[]{60,50,60})
                ,new Student4("Kolya","Heyter","AS-236",new int[]{70,100,80})
                , new Student4("Nikita","Mihalkov","AS-216",new int[]{60,76,65})
                ,new Student4("Nikolay","Baskov","AS-236",new int[]{70,90,70})
        };

        Consumer<Student4> consumer = st -> {
            System.out.println(st.getName()+" "+st.getSurname());
        };


        forEach(s, consumer);
    }

    static void forEach(Student[] input, Consumer action) {
        for (Student i : input) {
            action.accept(i);
        }
    }
}
