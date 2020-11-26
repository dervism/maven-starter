public class Kalkulator {
    public int pluss(int x, int y) {
        return x + y;
    }

    public double dele(double x, double y) {
        if (x == 0 || y == 0) throw new ArithmeticException("Kan ikke dele på 0.");
        return x / y;
    }
}
