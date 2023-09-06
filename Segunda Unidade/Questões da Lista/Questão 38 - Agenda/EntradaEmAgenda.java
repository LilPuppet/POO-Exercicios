import java.time.LocalDate;

public class EntradaEmAgenda{
    private int hora;
    private int dia;
    private int mes;
    private int ano;
    private String assunto;
    
    public EntradaEmAgenda(int hora, int dia, int mes, int ano, String assunto) {
        setHora(hora);
        setAno(ano);
        setMes(mes);
        setDia(dia);
        this.assunto = assunto;
    }

    //validadores de formatos adequados para as informações de data e hora

    private void setMes(int mes) {
        if(mes >= 1 && mes <= 12)
            this.mes = mes;
        else
            throw new IllegalArgumentException("\nMês inválido!\n");
    }

    private void setDia(int dia) {
        switch (mes) {
            case 2: //se for fevereiro
                if(dia > 0 && dia <= 27)
                    this.dia = dia;
                else if(dia == 28 && ano%4 == 0){//se for bissexto
                    this.dia = dia;
                }
                else{
                    throw new IllegalArgumentException("\nDia inválido!\n"); // IllegalArgument: para de execultar 
                }

            case 4,6,9,11: // meses com 30 dias
                if(dia > 0 && dia <= 30){
                    this.dia = dia;
                }
                else{
                    throw new IllegalArgumentException("\nDia inválido!\n");
                }
                    
            case 1,3,5,7,8,10,12: // meses com 31 dias
                if(dia > 0 && dia <= 31){
                    this.dia = dia;
                }
                else{
                    throw new IllegalArgumentException("\nDia inválido!\n");
                }
        }
    }

    private void setAno(int ano) {
        LocalDate dataPivor = LocalDate.now(); // LocalDate: Api do Java que salva uma variavel da classe Data, .now recebe a data atual
        int anoPivor = dataPivor.getYear(); // getYear retorna o ano atual
        if(ano <= anoPivor)
            this.ano = ano;
        else{
            throw new IllegalArgumentException("\nAno inválido!\n");
        }
    }

    private void setHora(int hora){
        if(hora >= 0 && hora <= 24)
            this.hora = hora;
        else{
            throw new IllegalArgumentException("\nHora inválida!\n");
        }
            
    }
    
    public String toString() {
        return "EntradaEmAgenda [hora=" + hora + ", dia=" + dia + ", mes=" + mes + ", ano=" + ano + ", assunto="
                + assunto + "]";
    }

    public boolean ehNoDia (int dia, int mes, int ano){
        if (this.dia==dia && this.mes==mes && this.ano==ano){
            return true;
        }
        else{
            return false;
        }
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
    
    



}