package at_oo;

public class Aviao extends Aeronave{
    private Integer qtAssentos;
    private String nomeEmpresa;

    public Aviao() {
    }

    public Aviao(Integer qtAssentos, String nomeEmpresa, String prefixo, String modelo, String fabricante) {
        super(prefixo, modelo, fabricante);
        this.qtAssentos = qtAssentos;
        this.nomeEmpresa = nomeEmpresa;
    }

    public Integer getQtAssentos() {
        return qtAssentos;
    }

    public void setQtAssentos(Integer qtAssentos) {
        this.qtAssentos = qtAssentos;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }
    
    
    
}
