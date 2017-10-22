/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import globant.Image;
import java.awt.Graphics;
import java.io.File;
import javax.swing.ImageIcon;

/**
 * Objeto sobre el cual se hace una reserva
 * @author hhade
 */
public class Mesa extends Image{
    
    private final String locationImage;
    
    private int capacidad;
    
    
    
    public Mesa(int capacidad){
        super();
        locationImage = new File("src/Resources/mesa.png").getPath();
        this.capacidad = capacidad;
    }
    
    
    
    @Override
    public void paint(Graphics g){
        ImageIcon Img = new ImageIcon(locationImage);
        g.drawImage(Img.getImage(), 0, 0, 50, 50, null);
        g.drawString(String.valueOf(getCapacidad()), 10, 10);
    }

    /**
     * @return the capacidad
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad the capacidad to set
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
