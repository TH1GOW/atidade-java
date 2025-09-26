public class lançamento {

private static final double G = 9.8; // m/s²

    public static double alcanceHorizontal(double velocidade, double anguloGraus) {
        double theta = Math.toRadians(anguloGraus);
        return (velocidade * velocidade * Math.sin(2 * theta)) / G;
    }

    public static double tempoDeVoo(double velocidade, double anguloGraus) {
        double theta = Math.toRadians(anguloGraus);
        return (2 * velocidade * Math.sin(theta)) / G;
    }

    public static double alturaMaxima(double velocidade, double anguloGraus) {
        double theta = Math.toRadians(anguloGraus);
        return (velocidade * velocidade * Math.sin(theta) * Math.sin(theta)) / (2 * G);
    }

    public static void main(String[] args) {
        double v = 20.0;     // m/s
        double ang = 45.0;   // graus
        System.out.println("Alcance: " + alcanceHorizontal(v, ang) + " m");
        System.out.println("Tempo de voo: " + tempoDeVoo(v, ang) + " s");
        System.out.println("Altura máxima: " + alturaMaxima(v, ang) + " m");
    }
}

