import java.util.LinkedList;

public class Main {
    //Creare una classe Fruit che accetti nel costruttore il parametro name (String)
    //In questa classe avere i metodi pubblici per ottenere le informazioni.
    //Creare un LinkedList con elementi e stamparlo in console.
    //Aggiungere un elemento al primo posto della lista e uno all'ultimo
    //Stampare la collezione aggiornata
    public static void main(String[] args) {
        Fruit fruit1= new Fruit("mela");
        Fruit fruit2= new Fruit("pera");

        LinkedList<Fruit> fruits = new LinkedList<>();
        fruits.add(fruit1);
        fruits.add(fruit2);

        System.out.println("LinkedList originale: " + fruits);

        Fruit fruit3= new Fruit("banana");
        Fruit fruit4= new Fruit("fragola");

        fruits.addFirst(fruit3);
        fruits.addLast(fruit4);

        System.out.println("LinkedList aggiornata: " + fruits);
    }
}