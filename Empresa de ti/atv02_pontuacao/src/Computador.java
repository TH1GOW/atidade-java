public class Computador {
    private String processador;
    private String memoriaRam;

    public Computador(String processador, String memoriaRam) {
        this.processador = processador;
        this.memoriaRam = memoriaRam;
    }
    public String getProcessador(){
        return  processador;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }
    public void exibirConfiguracao(){
            System.out.println("processador: " + processador);
            System.out.println("memoria ram: " + memoriaRam);
    }
}
