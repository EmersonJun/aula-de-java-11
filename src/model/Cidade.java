package model;

public enum Cidade {
    CURITIBA(41, "curitiba"),
    PONTA_GROSSA(42, "ponta grossa"),
    SAO_JOSE_DOS_PINHAIS(42, "sao jose dos pinhais");

    private int ddd;
    private String nome;

    private Cidade(int ddd, String nome) {
        this.ddd = ddd;
        this.nome = nome;
    }

    public int getDdd() {
        return ddd;
    }

    private void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString(){
        return "("+ ddd + ") - " +nome;
    }
}
