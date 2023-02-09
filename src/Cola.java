public class Cola extends Juice{
    private String name;
    private int yearOfIssue;//Год выпуска

    public Cola(String name, int yearOfIssue) {
        this.name = name;
        this.yearOfIssue = yearOfIssue;
    }

    @Override
    public void print() {
        System.out.println("\uD83E\uDD64 кола вредна,вообще не пейте ее" + name );

    }
}
