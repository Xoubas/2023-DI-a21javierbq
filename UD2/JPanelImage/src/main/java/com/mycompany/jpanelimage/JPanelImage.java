package com.mycompany.jpanelimage;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class JPanelImage extends JPanel implements Serializable {

    private BackgroundImage backgroundImage;

    public JPanelImage() {
    }

    public BackgroundImage getBackgroundImage() {
        return backgroundImage;
    }

    public void setBackgroundImage(BackgroundImage backgroundImage) {
        this.backgroundImage = backgroundImage;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
// Para evitar un NullPointerException antes de iniciar a propiedade
        if (backgroundImage != null) {
            if (backgroundImage.getFicheroImagen() != null && backgroundImage.getFicheroImagen().exists()) {
                ImageIcon imageIcon = new ImageIcon(backgroundImage.getFicheroImagen().getAbsolutePath());
                Graphics2D g2d = (Graphics2D) g;
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,
                        backgroundImage.getOpacidad()));
                g.drawImage(imageIcon.getImage(), 0, 0, null);
// Unha vez cambiada a opacidade, hai que volver a poñela en 1
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1));
            }
        }
    }
}
