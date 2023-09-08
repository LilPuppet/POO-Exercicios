import java.time.LocalDateTime;

public class DataHora {
    private LocalDateTime dateTime;

    public DataHora(LocalDateTime dateTime){
        this.dateTime = dateTime;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}

