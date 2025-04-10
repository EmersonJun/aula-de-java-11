package model;

public enum DiaDaSemana {
    SEGUNDA(true, "nome"),
    TERCA(true, "nome"),
    QUARTA(true, "nome"),
    QUINTA(true, "nome"),
    SEXTA(true, "nome"),
    SABADO(true, "nome"),
    DOMINGO(true, "nome"); 

    private boolean ehUtil;
    private String dia;
    private DiaDaSemana(boolean ehUtil, String dia) {
        this.ehUtil = ehUtil;
        this.dia = dia;
    }
    public DiaDaSemana getDiaDaSemana(String dia){
        return DiaDaSemana.valueOf(dia.trim().toUpperCase().replace("feira ", ""));
    }

    public boolean isEhUtil() {
        return ehUtil;
    }
    public void setEhUtil(boolean ehUtil) {
        this.ehUtil = ehUtil;
    }
    public String getDia() {
        return dia;
    }
    public void setDia(String dia) {
        this.dia = dia;
    }
@Override
public String toString(){
    return dia;
}
    
}
