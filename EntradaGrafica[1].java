import javax.swing.JOptionPane;

public class EntradaGrafica {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        String idadeStr = JOptionPane.showInputDialog("Digite sua idade:");
        int idade = Integer.parseInt(idadeStr);
        
        JOptionPane.showMessageDialog(null, 
            "Nome: " + nome + "\nIdade: " + idade,
            "Dados Informados",
            JOptionPane.INFORMATION_MESSAGE);
    }
}
