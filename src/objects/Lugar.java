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
 * Espacios del restaurante que afectan el mapa pero no son relevantes para 
 * la aplicación
 * @author hhade
 */
public class Lugar extends Image{
    
    private final String locationImage;
    
    private String nombre;
    
    public Lugar(String nombre){
        super();
        locationImage = new File("src/Resources/general.png").getPath();
        this.nombre = nombre;
    }
    
    @Override
    public void paint(Graphics g){
        ImageIcon Img = new ImageIcon(locationImage);
        g.drawImage(Img.getImage(), 0, 0, 50, 50, null);
        g.drawString(getNombre(), 10, 10);
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
