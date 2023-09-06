public class DemoAgenda {
    public static void main(String[] args) {
        EntradaEmAgenda data1 = new EntradaEmAgenda(05, 1, 10, 2001, "Meu Aniversário");
        EntradaEmAgenda data2 = new EntradaEmAgenda(05, 1, 10, 2001, "Meu Aniversário");
        EntradaEmAgenda data3 = new EntradaEmAgenda(05, 2, 11, 2002, "Evento Aleatório");
        EntradaEmAgenda data4 = new EntradaEmAgenda(05, 3, 11, 2002, "Evento Aleatório");
        EntradaEmAgenda data5 = new EntradaEmAgenda(05, 4, 11, 2023, "Evento Aleatório");
        
        Agenda agenda = new Agenda();

        agenda.preencheAgenda(data1);
        agenda.preencheAgenda(data2);
        agenda.preencheAgenda(data3);
        agenda.preencheAgenda(data4);
        agenda.preencheAgenda(data5);

        agenda.listaDia(1,10,2001);
}}
