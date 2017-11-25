
import java.io.Serializable;
import java.util.ArrayList;

public class WhatsApp implements Serializable{

    ArrayList<Conversa> conv = new ArrayList();

    private String telUser;

    public String getTelUser() {
        return telUser;
    }

    public void setTelUser(String telUser) {
        this.telUser = telUser;
    }

    public String getNomeUser() {
        return nomeUser;
    }

    public void setNomeUser(String nomeUser) {
        this.nomeUser = nomeUser;
    }
    private String nomeUser;

    public void iniciarConversa() {
        
        // não faz nada, isso mesmo, nada
    }

    public void sendTo(int index, String Texto) {

        Mensagem sent = new Mensagem(telUser, Texto, true);
        
        conv.get(index).msg.add(sent);
    }

    public void receiveFrom(int index, String tel, String msg) {
        
        conv.get(index).msg.add(new Mensagem(tel, msg, false));
    }
}