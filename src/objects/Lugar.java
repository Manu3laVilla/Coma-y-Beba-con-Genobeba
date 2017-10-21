/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import globant.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 * Espacios del restaurante que afectan el mapa pero no son relevantes para 
 * la aplicación
 * @author hhade
 */
public class Lugar extends Image{
    
    public Lugar(){
        super();
    }
    
    private final String locationImage = "";
    
    @Override
    public void paint(Graphics g){
        ImageIcon Img = new ImageIcon(locationImage);
        g.drawImage(Img.getImage(), 0, 0, 50, 50, null);
    }
}
