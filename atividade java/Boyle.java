public class Boyle {
    public static double novaPressao(double P1, double V1, double V2) {
        return (P1 * V1) / V2;
    }
    public static double novoVolume(double P1, double V1, double P2) {
        return (P1 * V1) / P2;
    }
    public static void main(String[] args) {
        double P1 = 1.0; // atm
        double V1 = 2.0; // L
        double V2 = 1.0; // L
        System.out.println("Nova pressão: " + novaPressao(P1, V1, V2) + " atm");
        double P2 = 1.5; // atm
        System.out.println("Novo volume: " + novoVolume(P1, V1, P2) + " L");
    }
}
