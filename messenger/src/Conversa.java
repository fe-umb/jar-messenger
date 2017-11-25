import java.io.Serializable;
import java.util.ArrayList;

public class Conversa implements Serializable{

    public ArrayList<Mensagem> msg = new ArrayList();
    private String telefone;
    private String contato;

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }
    
    public ArrayList<Mensagem> busca(String palavra) {

        ArrayList<Mensagem> out = new ArrayList();

        for (Mensagem m : out) {
            if (m.getTexto().equalsIgnoreCase(palavra)) {
                out.add(m);
            }
        }
        return out;
    }
    
    public ArrayList<Mensagem> retornoMensagens() {
        return msg;
    }
}