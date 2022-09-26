public class Main {
    public static void main(String[] args) {
        Flower f1 = new Flower();
        f1.setCountry("Голландия");
        f1.setCost(35.59f);
        Flower f2 = new Flower();
        f2.setCost(15f);
        f2.setLifeSpan(5);
        Flower f3 = new Flower();
        f3.setCountry("Англия");
        f3.setCost(69.9f);
        f3.setLifeSpan(1);
        Flower f4 = new Flower();
        f4.setCountry("Турция");
        f4.setCost(19.5f);
        f4.setLifeSpan(10);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
    }
}
