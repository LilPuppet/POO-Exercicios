import java.time.LocalDateTime;

public class EventoDelegacao {
    private DataHora dataHora;
    private String evento;

    public EventoDelegacao(LocalDateTime dateTime, String evento){
        super();
        this.dataHora = new DataHora(dateTime);
        this.evento = evento;
    }

    public LocalDateTime getDateTime() {
        return dataHora.getDateTime();
    }

    public void setDateTime(LocalDateTime dateTime) {
        dataHora.setDateTime(dateTime);
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

}