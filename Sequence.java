public class Sequence implements Sequence {

    private final double[] c;

    public Sequence(int maxN) {
        c = new double[maxN + 1];
        c[0] = 0;
        for (int N = 1; N <= maxN; N++) {
            c[N] = ((N + 1) * c[N - 1]) / N + 2;
        }
    }

    public double eval(int N) {
        return c[N];
    }

    public static void main(String[] args) {
        int maxN = 10; // Define your maximum value of N here
        Sequence seq = new Sequence(maxN);
        for (int i = 1; i <= maxN; i++) {
            System.out.println("c[" + i + "] = " + seq.eval(i));
        }
    }
}
