package util;

public class CurrencyConverter {
    public static double dollarPrice;
    public static double dollars;

    public static double conversor() {
        double reais = dollars * dollarPrice;
        double percent = (6 * reais) / 100;
        return reais += percent;
    }
}
