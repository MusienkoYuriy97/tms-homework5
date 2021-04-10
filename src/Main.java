public class Main {
    public static void main(String[] args) throws InterruptedException {
        Rocket rocket1 = new Rocket("Лукашенко", 2);
        Cosmodrome cosmodrome = new Cosmodrome(rocket1);
        System.out.println(cosmodrome.getRocket().getName());
        cosmodrome.start();

    }
}
