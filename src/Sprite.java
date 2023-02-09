public class Sprite extends Juice{
    private int price;
    private String taste;//вкус)

    public Sprite(int price, String taste) {
        this.price = price;
        this.taste = taste;
    }

    @Override
    public void print() {
        System.out.println("\uD83C\uDF79 Стоимость 70с" + price + " со вкусом лайма и лимона: " + taste);

    }
}
