package at_oo;

import java.util.ArrayList;

public class Voo {
    private Integer numero, vagas;
    String dPartida, hPartida, hChegada;
    Aeroporto parAeroporto, destAeroporto;
    Aeronave aeronave;

    public Voo() {
    }

    public Voo(Integer numero, Integer vagas, String dPartida, String hPartida, String hChegada, Aeroporto parAeroporto, Aeroporto destAeroporto, Aeronave aeronave) {
        this.numero = numero;
        this.vagas = vagas;
        this.dPartida = dPartida;
        this.hPartida = hPartida;
        this.hChegada = hChegada;
        this.parAeroporto = parAeroporto;
        this.destAeroporto = destAeroporto;
        this.aeronave = aeronave;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getVagas() {
        return vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }

    public String getdPartida() {
        return dPartida;
    }

    public void setdPartida(String dPartida) {
        this.dPartida = dPartida;
    }

    public String gethPartida() {
        return hPartida;
    }

    public void sethPartida(String hPartida) {
        this.hPartida = hPartida;
    }

    public String gethChegada() {
        return hChegada;
    }

    public void sethChegada(String hChegada) {
        this.hChegada = hChegada;
    }

    public Aeroporto getParAeroporto() {
        return parAeroporto;
    }

    public void setParAeroporto(Aeroporto parAeroporto) {
        this.parAeroporto = parAeroporto;
    }

    public Aeroporto getDestAeroporto() {
        return destAeroporto;
    }

    public void setDestAeroporto(Aeroporto destAeroporto) {
        this.destAeroporto = destAeroporto;
    }

    public Aeronave getAeronave() {
        return aeronave;
    }

    public void setAeronave(Aeronave aeronave) {
        this.aeronave = aeronave;
    }
}
