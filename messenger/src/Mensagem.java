
import java.io.Serializable;

public class Mensagem implements Serializable{
    
    private String emissor;
    private String texto;
    private Timecode timecode;
    private boolean isSend;
    private int status;

    public boolean isIsSend() {
        return isSend;
    }

    public Mensagem(String emissor, String texto, boolean isSend) {
        
        this.isSend = isSend;
        this.emissor = emissor;
        this.texto = texto;
        timecode = new Timecode();
    }
    
    @Override
    public String toString(){
        
        if(isSend){
        
            return "\n" + timecode.getTimecode().concat("Você: ").concat(texto);
        }else{
            
            return "\n" + timecode.getTimecode().concat("Contato: ").concat(texto);
        }
    }

    public String getEmissor() {
        return emissor;
    }

    public String getTexto() {
        return texto;
    }
    
    public Timecode getTimecode() {
        return timecode;
    }
    
    public int getStatus() {
        return status;
    }
}
