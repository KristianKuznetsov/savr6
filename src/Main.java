public class Main {
    public static void main(String[] args) {

        double[] Y = {7.6, 7.5, 7.2, 7.4, 7.1, 7, 8, 8.1, 8, 7.7, 7.2, 7.7, 7.4, 7, 7.2, 6.8, 6.6, 7, 6.6, 5.7, 6, 5.1, 5.4, 7.1,
                6.6, 7.5, 6.5, 7.1, 7.5, 5.8, 6.5, 7.5, 6.9, 6, 5.9, 6.4, 6.6};

        System.out.println("Автокорреляционная функция:");
        for (int i = 1; i < 19; i++) {
            System.out.println("При s = " + i + ((i<10)? "  -> ":" -> ") +  MyStatistics.autocorrelation_Rs(Y, i));
        }
        System.out.println();

        for (int i = 1; i < 19; i++) {
            System.out.print(MyStatistics.autocorrelation_Rs(Y, i) + ", ");
        }
        System.out.println();
    }
}