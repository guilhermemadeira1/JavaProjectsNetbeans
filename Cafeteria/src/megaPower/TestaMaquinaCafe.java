package megaPower;
import javax.swing.JOptionPane;

public class TestaMaquinaCafe {
    public static void main(String[] args) {
        MaquinaCafe mCafe = new MaquinaCafe();
        mCafe.acucarDisponivel = 30;
        JOptionPane.showInputDialog("-- Cafeteria Mega Power --\n\n\n"+"Escolha a quantidade de açúcar \ndo seu café (em gramas) :\n\n"+
                "Digite 1 para escolher a quantidade\n\nDigite 2 para quantidade padrão(10 gramas)\n\n");
        
        mCafe.fazerCafe();
    }
}
