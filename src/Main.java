public class Main {
    public static void main(String[] args) {
        Printable[] printables = {createObject("Juice"), createObject("Cola"),
                createObject("Fanta"),  createObject("Sprite")};
        for (Printable printable: printables){
            printable.print();
    }
    }//АРГЕН Я В ТЕБЯ ВЕРЮ
    public static Printable createObject(String className) {
        switch (className) {
            case "cola":
                Cola cola = new Cola("кола", 1886);
                return cola;
            case "fanta":
                Fanta fanta = new Fanta("Germany", "Yellow");
                return fanta;
            case "sprite":
                Sprite sprite = new Sprite(60, "sour taste");
                return sprite;

        }
        return null;
    }

}