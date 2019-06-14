package at_oo;

public class Helicoptero extends Aeronave{
    private TipoHeli tipo;

    public Helicoptero() {
    }

    public Helicoptero(TipoHeli tipo, String prefixo, String modelo, String fabricante) {
        super(prefixo, modelo, fabricante);
        this.tipo = tipo;
    }

    public TipoHeli getTipo() {
        return tipo;
    }

    public void setTipo(TipoHeli tipo) {
        this.tipo = tipo;
    }
}
