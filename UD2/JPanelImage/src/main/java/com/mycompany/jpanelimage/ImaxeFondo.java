/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jpanelimage;

import java.io.File;
import java.io.Serializable;

/**
 *
 * @author a21javierbq
 */
public class ImaxeFondo implements Serializable {

    private File ficheroImagen;
    private float opacidad;

    public ImaxeFondo() {
    }

    public ImaxeFondo(File ficheroImagen, float opacidad) {
        this.ficheroImagen = ficheroImagen;
        this.opacidad = opacidad;
    }

    public File getFicheroImagen() {
        return ficheroImagen;
    }

    public void setFicheroImagen(File ficheroImagen) {
        this.ficheroImagen = ficheroImagen;
    }

    public float getOpacidad() {
        return opacidad;
    }

    public void setOpacidad(float opacidad) {
        this.opacidad = opacidad;
    }
}
