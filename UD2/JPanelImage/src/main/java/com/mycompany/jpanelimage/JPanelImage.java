package com.mycompany.jpanelimage;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class JPanelImage extends JPanel implements Serializable {

    private ImaxeFondo imaxeFondo;
    private boolean ratonPresionado = false;
    private Point puntoPresion;
    private ArrastreListener arrastreListener;

    public JPanelImage() {
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if (ratonPresionado) {
                    Point posicionActual = e.getPoint();
                    if (Math.abs(puntoPresion.x - posicionActual.x) >= 50) {
                        if (arrastreListener != null) {
                            arrastreListener.arrastre();
                        }
                    }
                }
                ratonPresionado = false;
            }

            @Override
            public void mousePressed(MouseEvent e) {
                ratonPresionado = true;
                puntoPresion = e.getPoint();
            }
        });
    }

    public ImaxeFondo getImaxeFondo() {
        return imaxeFondo;
    }

    public void setBackgroundImage(ImaxeFondo imaxeFondo) {
        this.imaxeFondo = imaxeFondo;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
// Para evitar un NullPointerException antes de iniciar a propiedade
        if (imaxeFondo != null) {
            if (imaxeFondo.getFicheroImagen() != null && imaxeFondo.getFicheroImagen().exists()) {
                ImageIcon imageIcon = new ImageIcon(imaxeFondo.getFicheroImagen().getAbsolutePath());
                Graphics2D g2d = (Graphics2D) g;
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,
                        imaxeFondo.getOpacidad()));
                g.drawImage(imageIcon.getImage(), 0, 0, null);
// Unha vez cambiada a opacidade, hai que volver a poñela en 1
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1));
            }
        }
    }
}
