import java.time.LocalDateTime;

public class EventoHeranca extends DataHora{
    private String evento;

    public EventoHeranca(LocalDateTime dateTime, String evento){
        super(dateTime);
        this.evento = evento;
    }

    public String getEvento() {
        return evento;
    }

    public void SetNome (String evento){
        this.evento = evento;
    }
}
