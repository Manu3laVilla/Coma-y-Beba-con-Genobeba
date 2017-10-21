/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 * Representa algo que va en el mapa del restaurante
 * @author hhade
 */
public interface Space {
    
    /**
     * Permite mover el objeto del ugar
     * @param x Posición X a la que se moverá
     * @param y Posición Y a la que se moverá
     */
    public void mover(int x, int y);
            
    /**
     * Elimina el objeto del lienzo
     */
    public void eliminar();
}
