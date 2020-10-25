package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {

    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension tela = tk.getScreenSize();
        System.out.println("O Tamanho da sua tela é:");
        System.out.println(tela.width + " x " + tela.height);
    }
    
}
