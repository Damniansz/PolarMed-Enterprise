/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Rojeru San
 */
public class Ejecucion {

    public static void main(String[] args) {

        String s = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";
        try {
            javax.swing.UIManager.setLookAndFeel(s);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Ejecucion.class.getName()).log(Level.SEVERE, null, ex);
        }

//        Admin a = new Admin();
//        if (a.derechos()) {
//ejecutamos algo como administrador un llamado funcion etc
            if (new Control().comprobar()) {
                
                if(usuarios.Opciones.verificarUsuarios() == 0){
                    new configInicio.SplashScreen().setVisible(true);
                }else{
                    new splash.SplashScreen().setVisible(true);
                }
            } else {
                System.exit(0);
            }
//        } else {
////mandamos un mensaje al usuario nesesita previlegios de administrador
//            new Administrador().setVisible(true);
//        }
    }
}
