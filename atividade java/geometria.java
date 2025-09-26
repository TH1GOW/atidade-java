public class geometria {
    public static double areaTriangulo(double base, double altura) {
        return (base * altura) / 2.0;
    }
    public static double areaCirculo(double raio) {
        return Math.PI * raio * raio;
    }
    public static double circunferencia(double raio) {
        return 2.0 * Math.PI * raio;
    }
    public static void main(String[] args) {
        double base = 3.0, altura = 2.0; // metros
        double raio = 0.12; // metros (prato de 24 cm de diâmetro)
        System.out.println("Área do triângulo: " + areaTriangulo(base, altura) + " m²");
        System.out.println("Área do círculo: " + areaCirculo(raio) + " m²");
        System.out.println("Perímetro do círculo: " + circunferencia(raio) + " m");
    }
}
