package conexion;

import com.mongodb.client.*;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author RojeruSan
 */

public class ConexionBD {
    
     
   MongoClient mongo=null;
   String mongoLocal = "mongodb://localhost:27017";
   String mongoNube = "";
    //Método para obtener una instancia de la conexión
    public MongoClient obtenerConexion() {
        try {
            mongo=MongoClients.create(mongoLocal);
            System.out.println("Conectado a Mongo");
            return mongo;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    //Método para cerrar la conexión
    public void cerrarConexion() {
        if(mongo==null){
            mongo.close();
           System.out.println("Conexión cerrada con MongoDB");
        }
    }

}



//    
//     public Connection Desconectar() {
//        try {
//            conect.close();
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Error en la conexión" + e);
//        }
//        return conect;
//    }   