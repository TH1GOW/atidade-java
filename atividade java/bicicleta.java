public class bicicleta {
    
public static double aceleracao(double v0, double v, double t) {
        return (v - v0) / t;
    }
    // Movimento retilíneo uniformemente acelerado: s = s0 + v0*t + 0.5*a*t^2
    public static double deslocamento(double s0, double v0, double a, double t) {
        return s0 + v0 * t + 0.5 * a * t * t;
    }
    public static void main(String[] args) {
        double v0 = 0.0, v = 10.0, t = 5.0;
        double a = aceleracao(v0, v, t);
        System.out.println("Aceleração: " + a + " m/s²");
        System.out.println("Deslocamento em " + t + " s: " + deslocamento(0.0, v0, a, t) + " m");
    }
}
