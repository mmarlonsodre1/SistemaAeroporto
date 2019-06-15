package at_oo;

import java.util.ArrayList;
import java.util.Objects;

public class Aeroporto {
    private String codigo, nome;
    private TipoAeroporto tipo;
    ArrayList<Aeroporto> partAroportos = new ArrayList<Aeroporto>();
    ArrayList<Aeroporto> destAroportos = new ArrayList<Aeroporto>();
    ArrayList<Aeronave> aeronaves = new ArrayList<Aeronave>();
    ArrayList<Voo> voo = new ArrayList<Voo>();

    public Aeroporto() {
    }

    public Aeroporto(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public String status(){
        return String.valueOf(tipo);
    }


    public boolean equals(Aeroporto o) {
        if (this == o) return true;
        if (!(o instanceof Aeroporto)) return false;
        Aeroporto aeroporto = (Aeroporto) o;
        return getCodigo().equals(aeroporto.getCodigo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo());
    }

    public boolean garagem(String prefixo){
        Boolean x = false;
        for (int i = 0; i < aeronaves.size(); i++) {
            if(prefixo.equals(aeronaves.get(i).getPrefixo())){
                x = true;
            }
        }
        return x;
    }

    public boolean possuiRota(Aeroporto aeroporto){
        Boolean x = false;
        if (destAroportos.contains(aeroporto) || partAroportos.contains(aeroporto)){
            x = true;
        }
        return x;
    }

    public String nomeAeroporto(String codigo){
        if (codigo.equals(getCodigo())){
            return getNome();
        } else{
            for (int i = 0; i < destAroportos.size(); i++) {
                if (codigo.equals(destAroportos.get(i).codigo)){
                    return destAroportos.get(i).nome;
                }
            }
            for (int i = 0; i < partAroportos.size(); i++) {
                if (codigo.equals(partAroportos.get(i).codigo)){
                    return partAroportos.get(i).nome;
                }
            }
            return "Não existe Aeroporto com esse código registrado como partida ou destino";
        }
    }

    public void adicionarPartAeropoto(Aeroporto aeroporto){
        if (partAroportos.size() > 99){
            System.err.println("Numero  máximo alcançado");;
        } else {
            partAroportos.add(aeroporto);
        }
    }

    public void adicionarDestAeropoto(Aeroporto aeroporto){
        if (destAroportos.size() > 99){
            System.err.println("Numero  máximo alcançado");;
        } else {
            destAroportos.add(aeroporto);
        }
    }

    public void adicionarAeronave(Aeronave aeronave){
        if (aeronaves.size() > 99){
            System.err.println("Numero  máximo alcançado");;
        } else {
            aeronaves.add(aeronave);
        }
    }

    public void incluirVoo(Voo o){
        Boolean x = false;
        for (int i = 0; i < voo.size(); i++) {
            if (o.getdPartida().equals(voo.get(i).getdPartida())){
                System.out.println("Somente um voo por dia");
                x = true;
            }
        }
        if (x == false){
            voo.add(o);
        }
    }

    public void removerVoo(Voo o){
        Boolean x = false;
        if (voo.contains(o)) {
            voo.remove(o);
        } else {
            System.out.println("Voo Inexistente");
        }
    }

    public void alterarVoo(Voo o, Integer numero, Integer vagas, String dPartida, String hPartida, String hChegada, Aeroporto partAeroporto, Aeroporto destAeroporto, Aeronave aeronave){
        Boolean x = false;
        Voo v = new Voo(numero, vagas, dPartida, hPartida, hChegada, partAeroporto, destAeroporto, aeronave);
        for (int i = 0; i < voo.size(); i++) {
            if (o == voo.get(i)){
                voo.set(i, v);
                x = true;
            }
        }
        if (x == false){
            System.out.println("Voo Inexistente");
        }
    }

    public void detalheVoo(Integer numero){
        Boolean x = false;
        for (int i = 0; i < voo.size(); i++) {
            if (numero == voo.get(i).getNumero()){
                System.out.println(String.format("Vagas: %d / Data de Partida: %s / Horário de Partida: %s / Horário de Chegada: %s " +
                        "\nDescrição da Aeronave. Prefixo da Aeronave: %s  / Modelo: %s  / Fabricante: %s " +
                        "\n Aeroporto Partida. Código: %s  / Nome: %s" +
                        "\n Aeroporto Chegada. Código: %s  / Nome: %s",
                        voo.get(i).getVagas(), voo.get(i).getdPartida(), voo.get(i).gethPartida(), voo.get(i).gethChegada(),
                        voo.get(i).getAeronave().getPrefixo(), voo.get(i).getAeronave(), voo.get(i).getAeronave().getModelo(), voo.get(i).getAeronave().getFabricante(),
                        voo.get(i).getParAeroporto().getCodigo(), voo.get(i).getParAeroporto().getNome(),
                        voo.get(i).getDestAeroporto().getCodigo(), voo.get(i).getDestAeroporto().getNome()));
                x = true;
            }
        }
        if (x == false){
            System.out.println("Voo Inexistente");
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoAeroporto getTipo() {
        return tipo;
    }

    public void setTipo(TipoAeroporto tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Aeroporto> getPartAroportos() {
        return partAroportos;
    }

    public void setPartAroportos(ArrayList<Aeroporto> partAroportos) {
        this.partAroportos = partAroportos;
    }

    public ArrayList<Aeroporto> getDestAroportos() {
        return destAroportos;
    }

    public void setDestAroportos(ArrayList<Aeroporto> destAroportos) {
        this.destAroportos = destAroportos;
    }

    public ArrayList<Aeronave> getAeronaves() {
        return aeronaves;
    }

    public void setAeronaves(ArrayList<Aeronave> aeronaves) {
        this.aeronaves = aeronaves;
    }

    public ArrayList<Voo> getVoo() {
        return voo;
    }

    public void setVoo(ArrayList<Voo> voo) {
        this.voo = voo;
    }
}
