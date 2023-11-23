import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Creare una classe Student che accenti nel costruttore il parametro name (String e age Int)
        //In questa classe avere i metodi pubblici per ottenere le informazioni.
        //Creare un ArrayList con 12 elementi e stamparlo in console.
        //mettere in ordine la collezione e stampare il risultato

        Student student1 = new Student("Valerio", 14);
        Student student2 = new Student("Marianna", 17);
        Student student3 = new Student("Vittorio", 14);
        Student student4 = new Student("Vanessa", 18);
        Student student5 = new Student("Gianni", 17);
        Student student6 = new Student("Angela", 15);
        Student student7 = new Student("Giovanni", 16);
        Student student8 = new Student("Francesco", 14);
        Student student9 = new Student("Roberta", 18);
        Student student10 = new Student("Gianna", 17);
        Student student11 = new Student("Angelo", 15);
        Student student12 = new Student("Dino", 16);

        List<Student> students = Arrays.asList(student1, student2, student3, student4, student5, student6, student7, student8, student9, student10, student11, student12);
        System.out.println("Lista iniziale: " + students);

        students.sort(Comparator.comparing(Student::getName));
        System.out.println("Lista ordinata: " + students);
    }
}