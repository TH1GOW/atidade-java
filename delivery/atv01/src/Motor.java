public class Motor {

    private int cilindradas;

    public Motor(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void exibirMotor() {
        System.out.println("Motor: " + cilindradas + " cilindradas");
    }
}