import java.util.Arrays;

/**
 * @author prateek.bangre on 23/08/21.
 * @Project DataStructure_Algorithms
 */
public class Statistics {

    public static Stats statistics(double[] numbers) {



        double maximum = Arrays.stream(numbers).max().getAsDouble();
        double mean = Arrays.stream(numbers).sum()/maximum;
        double percentile = 1;
        return new Stats(maximum, mean, percentile);
    }

    public static void main(String[] args) {
        Stats stats = statistics(new double[]{ 1000, 100, 10, 5, 0.1, 1});
        System.out.println("Maximum: " + stats.getMaximum());
        System.out.println("Mean: " + stats.getMean());
        System.out.println("Percentile: " + stats.getPercentile());

    }

    static class Stats {

        private double maximum;
        private double mean;
        private double percentile;

        public Stats(double maximum, double mean, double percentile) {
            this.maximum = maximum;
            this.mean = mean;
            this.percentile = percentile;
        }

        public double getMaximum() { return maximum; }
        public double getMean() { return mean; }
        public double getPercentile() { return percentile; }
    }
}
