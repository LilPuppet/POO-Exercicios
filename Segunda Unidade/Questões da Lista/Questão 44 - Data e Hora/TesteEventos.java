import java.time.LocalDateTime;
public class TesteEventos {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        EventoDelegacao delegado = new EventoDelegacao(dateTime, "Eu passando em POO");
        EventoHeranca herdado = new EventoHeranca(dateTime, "Eu me livrando da depressão");
        System.out.println ("Delegacao: " + delegado.getEvento() + " / " + delegado.getDateTime());
        System.out.println ("Heranca: " + herdado.getEvento() + " / " + herdado.getDateTime());
    }
}
