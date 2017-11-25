
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import javax.swing.JOptionPane;

public class Serializacao implements Serializable {

    File f;

    public Serializacao(String nome) {
        
        this.f = new File(nome);
    }

    public static void main(String args[]){
        
        new Serializacao("backup.wpp").lerBackup();
    }
    
    public void gravarBackup(WhatsApp whats) {
        
        try (FileOutputStream arquivoGravar = new FileOutputStream(f);
            ObjectOutputStream objetoGravar = new ObjectOutputStream(arquivoGravar);) {
            objetoGravar.writeObject(whats);
        
        } catch (Exception ex) {
            
            System.out.println(ex);
        }
    }

    public void lerBackup() {
        
        WhatsApp whats;
        
        if (f.exists()) {
            
            try (FileInputStream arquivoLeitura = new FileInputStream(f);
                ObjectInputStream objetoLeitura = new ObjectInputStream(arquivoLeitura);) {
                
                whats = (WhatsApp) objetoLeitura.readObject();
                JFGUI gui = new JFGUI();
                gui.setWhats(whats);
                gui.setVisible(true);
                gui.setFields();
            
            } catch (Exception ex) {
                
                System.out.println(ex);
                JFIdentificacao cadastro = new JFIdentificacao();
                cadastro.setVisible(true);
            }
        } else {
            
            JOptionPane.showMessageDialog(null, "Não foi encontrado um arquivo de backup", "Sem backup", JOptionPane.WARNING_MESSAGE);
            JFIdentificacao cadastro = new JFIdentificacao();
            cadastro.setVisible(true);
        }
    }
}