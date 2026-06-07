package UI;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PainelImagem extends JPanel {

    private ImageIcon imagem;

    public PainelImagem() {
        imagem = new ImageIcon(
            getClass().getResource("/imagens/fundotenis.png")
        );
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(
            imagem.getImage(),
            0,
            0,
            getWidth(),
            getHeight(),
            this
        );
    }
}