/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author RojeruSan
 */
public class Admin {

    public String ruta() {
        String dp = "";
        dp = System.getProperty("user.home");
        dp = dp.substring(0, 1);

        dp = dp + ":" + "/";

        return dp;
    }

    public boolean derechos() {
        boolean verdad = false;
        String dp = "";
        dp = System.getProperty("user.home");
        dp = dp.substring(0, 1);
        String sFichero = dp + ":/test.cmd";
        File fichero = new File(sFichero);

        if (fichero.exists()) {
            System.out.println("El fichero " + sFichero + " existe");

            if (fichero.delete()) {
                verdad = true;
                System.out.println("El fichero ha sido borrado satisfactoriamente");

            } else {
                System.out.println("El fichero no puede ser borrado");
            }

        } else {
            System.out.println("Pues va a ser que no");

            //
            try {
                // A partir del objeto File creamos el fichero físicamente
                if (fichero.createNewFile()) {
                    System.out.println("El fichero se ha creado correctamente");
                    verdad = true;

                    fichero.delete();

                } else {
                    System.out.println("No ha podido ser creado el fichero");
                }
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
            //
        }
        return verdad;

    }

}
