public class MyStatistics {

    //TODO: лаба 2 пункта 1
    public static double autocorrelation_Rs(double[] y, int s) {
        return prodVarShift(y, s) / varianceShift(y, s);
    }

    public static double averageShift(double[] y, int shift, int pos) {
        double sum = 0;
        int div = 0;
        for (int i = pos; i < y.length - shift; i++) {
            sum = sum + y[i];
            div++;
        }
        return sum / div;
    }

    public static double varianceShift(double[] y, int shift) {
        double alpha = MyStatistics.averageShift(y, shift, 0);
        double beta = MyStatistics.averageShift(y, 0, shift);
        double sumAlpha = 0;
        double sumBeta = 0;
        int div = y.length - shift;

        for (int i = 0; i < y.length - shift; i++) {
            sumAlpha = sumAlpha + Math.pow(y[i] - alpha, 2);
            sumBeta = sumBeta + Math.pow(y[i + shift] - alpha, 2);
        }
        return Math.sqrt(sumAlpha / div) * Math.sqrt(sumBeta / div);
    }

    public static double prodVarShift(double[] y, int shift) {
        double alpha = MyStatistics.averageShift(y, shift, 0);
        double beta = MyStatistics.averageShift(y, 0, shift);
        double sum = 0;

        for (int i = 0; i < y.length - shift; i++) {
            sum = sum + ((y[i] - alpha) * (y[i + shift] - beta));
        }
        return sum / (y.length - shift);
    }
}
