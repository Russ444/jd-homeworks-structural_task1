public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        System.out.println(calc.sum(3, 6));
        System.out.println(calc.mult(11, 10));
        System.out.println(calc.pow(3, 6));
    }
}