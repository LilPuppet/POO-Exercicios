public class Agenda {
    private EntradaEmAgenda[] agenda = new EntradaEmAgenda[5];

    public void preencheAgenda(EntradaEmAgenda entrada) {
        for(int i = 0; i < agenda.length; i++){
            if(agenda[i] == null){
                //System.out.println(entrada);
                agenda[i] = entrada;
                break;
            }
        }
    }

    public String listaDia(int dia, int mes, int ano){
        String lista = null;
        for (int i = 0; i < agenda.length; i++) {
            if(agenda[i].getDia() == dia && agenda[i].getMes() == mes && agenda[i].getAno() == ano){
                System.out.println("Compromisso "+ i);
            }
        }
        return lista;
    }

}
