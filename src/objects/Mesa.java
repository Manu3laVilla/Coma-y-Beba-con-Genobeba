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
    
    public Mesa(){
        super();
        locationImage = new File("src/Resources/mesa.png").getPath();
    }
    
    
    
    @Override
    public void paint(Graphics g){
        ImageIcon Img = new ImageIcon(locationImage);
        g.drawImage(Img.getImage(), 0, 0, 50, 50, null);
    }
}
