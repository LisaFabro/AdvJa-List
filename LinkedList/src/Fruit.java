public class Fruit {
    public String name;

    public Fruit(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Fruit: {" +
                "name='" + name + '\'' +
                '}';
    }
}
