import java.io.Serializable;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Timecode implements Serializable{
    String timecode;

    public String getTimecode() {
        return timecode;
    }
    
    public Timecode() {
        
        this.timecode = "[" + new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Timestamp(System.currentTimeMillis()).getTime()) + "]";
    }

}