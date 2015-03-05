/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compi_01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author emmanuelsilvaxavier
 */
public class COMPI_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set hash = new HashSet();
        
        int i;
        for (i = 0; i <= 1000000;i++)
            hash.add(i);
   
        
        System.out.println("Iniciando a busca");
        if (hash.contains(-1))
            System.out.println("hash contem");
        else
            System.out.println("nao contem");
        
        
        
    }
}
