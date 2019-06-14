package at_oo;

import java.util.Arrays;
import java.util.Iterator;

public class AT_OO {

    public static void main(String[] args) {
        Aeronave a1 = new Aviao(7000, "Marlon Voa Baixo", "GGO", "Grand O Objeto", "MarlonEnginner");
        Aeronave a2 = new Aviao(100, "Airlane", "AI", "Ar Ir", "MarlonEnginner");
        Aeronave a3 = new Aviao(5, "Gol", "CG", "Car Gol", "MarlonEnginner");
        Aeronave a4 = new Aviao(500, "Vivo", "AA", "Ar Airlane", "MarlonEnginner");
        Aeronave a5 = new Helicoptero(TipoHeli.GUARDA_COSTEIRA, "HO", "Helicoptero Objeto", "MarlonEnginner");

        Aeroporto b1 = new Aeroporto("GIG", "Aeroporto Internacional Tom Jobim");
        Aeroporto b2 = new Aeroporto("GRU", "Aeroporto Internacional de Garulhos");
        Aeroporto b3 = new Aeroporto("CGH", "Aeroporto de São Paulo/Cegonhas");
        Aeroporto b4 = new Aeroporto("SDU", "Aeroporto do Rio de Janeiro");
        Aeroporto b5 = new Aeroporto("GRU", "Aeroporto Internacional de Garulhos");

        b1.setTipo(TipoAeroporto.INTERNACIONAL);
        b2.setTipo(TipoAeroporto.INTERNACIONAL);
        System.out.println(b2.status());
        b2.setTipo(TipoAeroporto.NACIONAL);
        System.out.println(b2.status());
        System.out.println("");

        b1.adicionarPartAeropoto(b2);
        b1.adicionarPartAeropoto(b3);
        b1.adicionarPartAeropoto(b4);
        b1.adicionarPartAeropoto(b5);

        b2.adicionarPartAeropoto(b1);
        b2.adicionarPartAeropoto(b4);
        b2.adicionarPartAeropoto(b5);

        b1.adicionarDestAeropoto(b2);
        b1.adicionarDestAeropoto(b3);
        b1.adicionarDestAeropoto(b4);
        b1.adicionarDestAeropoto(b5);

        b2.adicionarDestAeropoto(b1);
        b2.adicionarDestAeropoto(b4);
        b2.adicionarDestAeropoto(b5);

        b1.adicionarAeronave(a1);
        b1.adicionarAeronave(a2);

        b2.adicionarAeronave(a3);
        b2.adicionarAeronave(a4);

        Voo v1 = new Voo(1, 100, "22/01/2019", "10:50", "14:00", b1, b2, a1);
        Voo v2 = new Voo(2, 150, "21/01/2019", "11:50", "15:00", b4, b2, a2);

        b1.incluirVoo(v1);
        b1.removerVoo(v1);
        b1.incluirVoo(v1);
        b1.alterarVoo(v1, 1, 100, "21/01/2019", "10:50", "14:00", b1, b2, a1);
        b4.incluirVoo(v2);

        Cidade c1 = new Cidade("São Paulo", "2.000.000");
        Cidade c2 = new Cidade("Rio de Janeiro", "1.000.000");
        Cidade c3 = new Cidade("São Paulo", "2.000.000");
        Cidade c4 = new Cidade("Manaus", "3.000.000");

        c1.adicionarCidade(c3);
        c1.adicionarCidade(c4);
        c1.adicionarAeroporto(b2);

        c2.adicionarCidade(c4);
        c2.adicionarAeroporto(b1);
        c2.adicionarAeroporto(b4);


        System.out.println(b2.equals(b5));
        System.out.println(b2.equals(b1));
        System.out.println("");

        System.out.println(b2.garagem("CG"));
        System.out.println(b2.garagem("GGO"));
        System.out.println("");

        System.out.println(b1.possuiRota(b2));
        System.out.println(b2.possuiRota(b3));
        System.out.println("");

        System.out.println(b2.nomeAeroporto("GIG"));
        System.out.println(b2.nomeAeroporto("CGH"));
        System.out.println("");

        System.out.println(c2.voos("21/01/2019"));
        System.out.println(c2.voos("21/01/2018"));
        System.out.println("");

        System.out.println(c1.getDimensao());
        System.out.println("");

        System.out.println(c1.equals(c3));
        System.out.println(c1.equals(c2));
        System.out.println("");

        System.out.println(c1.fronteira(c2));
        System.out.println(c1.fronteira(c3));
        System.out.println("");

        for (Iterator<Cidade> i = c1.cidadesComuns(c2).iterator(); i.hasNext();){
            System.out.println(i.next());
        }
        for (Iterator<Cidade> i = c1.cidadesComuns(c3).iterator(); i.hasNext();){
            System.out.println(i.next());
        }

    }
    
}
