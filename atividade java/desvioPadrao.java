public class desvioPadrao {
    public static double media(double[] valores) {
        double soma = 0.0;
        for (double v : valores) soma += v;
        return soma / valores.length;
    }
    // Variância populacional
    public static double varianciaPop(double[] valores) {
        double m = media(valores);
        double soma = 0.0;
        for (double v : valores) soma += (v - m) * (v - m);
        return soma / valores.length;
    }
    // Variância amostral (n-1)
    public static double varianciaAmostral(double[] valores) {
        if (valores.length < 2) return Double.NaN;
        double m = media(valores);
        double soma = 0.0;
        for (double v : valores) soma += (v - m) * (v - m);
        return soma / (valores.length - 1);
    }
    public static double desvioPadraoPop(double[] valores) {
        return Math.sqrt(varianciaPop(valores));
    }
    public static void main(String[] args) {
        double[] dados = {2, 4, 6, 8, 10};
        System.out.println("Média: " + media(dados));
        System.out.println("Variância populacional: " + varianciaPop(dados));
        System.out.println("Variância amostral: " + varianciaAmostral(dados));
        System.out.println("Desvio padrão (pop.): " + desvioPadraoPop(dados));
    }
}
