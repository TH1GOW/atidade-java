public class soluçãoQuimica {
     public static double molaridade(double massa_g, double MM_g_mol, double volume_L) {
        double n = massa_g / MM_g_mol;
        return n / volume_L;
    }
    // Massa necessária para obter M mol/L em V litros: m = M * V * MM
    public static double massaNecessaria(double M_mol_L, double volume_L, double MM_g_mol) {
        return M_mol_L * volume_L * MM_g_mol;
    }
    public static void main(String[] args) {
        // Exemplo: 10 g de NaCl (MM≈58.44 g/mol) em 0,5 L
        System.out.println("Molaridade: " + molaridade(10.0, 58.44, 0.5) + " mol/L");
        // Exemplo: massa para 1,0 mol/L em 0,25 L
        System.out.println("Massa necessária: " + massaNecessaria(1.0, 0.25, 58.44) + " g");
    }
}
