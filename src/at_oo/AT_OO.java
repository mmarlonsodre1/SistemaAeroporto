package at_oo;

public class AT_OO {

    public static void main(String[] args) {
        Aeronave a1 = new Aviao(7000, "Marlon Voa Baixo", "GGO", "Grand O Objeto", "MarlonEnginner");
        Aeronave a2 = new Aviao(100, "Airlane", "AI", "Ar Ir", "MarlonEnginner");
        Aeronave a3 = new Aviao(5, "Gol", "CG", "Car Gol", "MarlonEnginner");
        Aeronave a4 = new Aviao(500, "Vivo", "AA", "Ar Airlane", "MarlonEnginner");
        Aeronave a5 = new Helicoptero(TipoHeli.GUARDA_COSTEIRA, "HO", "Helicoptero Objeto", "MarlonEnginner");
    }
    
}
