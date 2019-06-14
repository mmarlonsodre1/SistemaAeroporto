package at_oo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Cidade {
    private String nome, dimensao;
    private ArrayList<Cidade> cFronteira = new ArrayList<Cidade>();
    private ArrayList<Aeroporto> aeroportos = new ArrayList<Aeroporto>();
    private ArrayList<Cidade> cComuns = new ArrayList<Cidade>();

    public Cidade() {
    }

    public Cidade(String nome, String dimensao) {
        this.nome = nome;
        this.dimensao = dimensao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cidade)) return false;
        Cidade cidade = (Cidade) o;
        return getNome().equals(cidade.getNome()) &&
                getDimensao().equals(cidade.getDimensao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getDimensao());
    }

    public boolean fronteira(Cidade c){
        Boolean x = false;
        if(cFronteira.contains(c)){
            x = true;
        }
        return x;
    }

    public ArrayList<Cidade> cidadesComuns(Cidade c){
        cComuns.clear();
        for (int i = 0; i < cFronteira.size(); i++) {
            if (c.getcFronteira().contains(cFronteira.get(i))){
                cComuns.add(cFronteira.get(i));
            }
        }
        Iterator<Cidade> iCidade = cComuns.iterator();
        return cComuns;
    }

    public void adicionarCidade(Cidade c){
        if (cFronteira.size() > 39){
            System.err.println("Numero  máximo alcançado");;
        } else {
            cFronteira.add(c);
        }
    }

    public int voos(String data){
        Integer contador = 0;
        for (int i = 0; i < aeroportos.size(); i++) {
            for (int j = 0; j < aeroportos.get(i).getVoo().size(); j++) {
                if (aeroportos.get(i).getVoo().get(j).getdPartida().equals(data)){
                    contador += 1;
                }
            }
        }
        return contador;
    }

    public void adicionarAeroporto(Aeroporto aeroporto){
        aeroportos.add(aeroporto);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDimensao() {
        return dimensao + " Km²";
    }

    public void setDimensao(String dimensao) {
        this.dimensao = dimensao;
    }

    public ArrayList<Cidade> getcFronteira() {
        return cFronteira;
    }

    public void setcFronteira(ArrayList<Cidade> cFronteira) {
        this.cFronteira = cFronteira;
    }

    public ArrayList<Aeroporto> getAeroportos() {
        return aeroportos;
    }

    public void setAeroportos(ArrayList<Aeroporto> aeroportos) {
        this.aeroportos = aeroportos;
    }

    public ArrayList<Cidade> getcComuns() {
        return cComuns;
    }

    public void setcComuns(ArrayList<Cidade> cComuns) {
        this.cComuns = cComuns;
    }
}
