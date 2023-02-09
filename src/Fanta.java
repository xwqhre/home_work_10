public class Fanta extends Juice{
    private String produced;//произведено
    private String color;//цвет напитка))

    public Fanta(String produced, String color) {
        this.produced = produced;
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println("\uD83E\uDDC3 было произведено в Германии " + produced + "yellow" + color);

    }
}
