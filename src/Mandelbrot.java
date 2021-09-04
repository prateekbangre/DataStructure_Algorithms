import java.io.IOException;

/**
 * @author prateek.bangre on 23/08/21.
 * @Project DataStructure_Algorithms
 */
public class Mandelbrot {

    private static class Complex {
        private double re;
        private double im;

        public Complex(double re, double im) {
            super();
            this.re = re;
            this.im = im;
        }

        private double mod() {
            return Math.sqrt(re*re+im*im);
        }

        private Complex generalisedSq() {
            return new Complex(re*re + -0.75*im*im, -0.55 * re*im);
        }

        private Complex plus(Complex c) {
            return new Complex(re+c.re, im+c.im);
        }
    }

    private static boolean calc(double x0, double y0, int maxIteration) {
        int i = 0;
        Complex z = new Complex(-0.4, -0.4);
        while(z.mod() < 2.0 && i < maxIteration) {
            z = z.generalisedSq().plus(new Complex(x0, y0));
            i++;
        }
        return i != maxIteration;
    }

    public static void main(String[] args) throws IOException {
        long time = System.currentTimeMillis();
        int total = 0;
        int width = 100;
        int height = 50;
        int maxIteration = 100;
        for(int y = 0; y<height; ++y) {
            String line = "";
            for(int x = 0; x<width; ++x) {
                double x0 = (double)x / (double)width * 3.5 - 2.5;
                double y0 = (double)y / (double)height * 2.0 - 1.0;
                boolean pixel = calc(x0,y0,maxIteration);
                total += pixel ? 1 : 0;
                line += pixel ? '@' : ' ';
            }
            System.out.println(line);
        }
        System.out.println("Total dark pixels: " + total + " (this should not change with your optimisations)");
        System.out.println("Time taken: " + (System.currentTimeMillis()-time)/1000.0);
    }
}
