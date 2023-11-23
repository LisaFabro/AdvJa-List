import java.util.ArrayList;
import java.util.List;

public class Main {
//Creare una classe Student che accenti nel costruttore il parametro name (String e age Int)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un ArrayList con n elementi e stamparlo in console.
//Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console
    public static void main(String[] args) {
        Student student1 = new Student("Giovanni", 16);
        Student student2 = new Student("Marianna", 17);
        Student student3 = new Student("Vittorio", 14);
        Student student4 = new Student("Vanessa", 18);
        Student student5 = new Student("Gianni", 17);
        Student student6 = new Student("Angela", 15);

      //  List<Student> students = Array.asList(student1,student2);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);

        System.out.println("Lista iniziale: " + students);

         students.add(student3);
         students.add(student4);
        students.add(student5);
        students.add(student6);

        System.out.println("Lista con l'aggiunta dei nuovi elementi: " + students);
    }
}