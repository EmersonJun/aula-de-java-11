package model;

public enum DiaDaSemana {
    SEGUNDA(true, "segunda"),
    TERCA(true, "terca"),
    QUARTA(true, "quarta"),
    QUINTA(true, "quinta"),
    SEXTA(true, "sexta"),
    SABADO(true, "sabado"),
    DOMINGO(true, "domingo"); 

    private boolean ehUtil;
    private String dia;
    private DiaDaSemana(boolean ehUtil, String dia) {
        this.ehUtil = ehUtil;
        this.dia = dia;
    }
    public DiaDaSemana getDiaDaSemana(String dia){
        return DiaDaSemana.valueOf(dia.trim().toUpperCase().replace("-feira ", ""));
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
