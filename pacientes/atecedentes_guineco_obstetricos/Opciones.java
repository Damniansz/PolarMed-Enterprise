package pacientes.atecedentes_guineco_obstetricos;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import conexion.ConexionBD;
import org.bson.Document;

import java.sql.SQLException;

/**
 *
 * @author Rojeru San CL
 */
public class Opciones {

    static ConexionBD cc = new ConexionBD();
    static MongoClient mongoClient = cc.obtenerConexion();
    static MongoDatabase database = mongoClient.getDatabase("historia_clinica");
    static MongoCollection<Document> collection = database.getCollection("antecedentes_guineco_obstetricos");

    public static boolean registrar(Sentencias uc) {
        try {
            Document document = new Document("id", uc.getId())
                    .append("menarca", uc.getMenarca())
                    .append("ivsa", uc.getIvsa())
                    .append("numero_parejas", uc.getNumero_parejas())
                    .append("embarazos", uc.getEmbarazos())
                    .append("metodo_anticonceptivo", uc.getMetodo_anticonceptivo());
            collection.insertOne(document);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public static boolean actualizar(Sentencias uc) {
        try {
            Document filter = new Document("id", uc.getId());
            Document update = new Document("$set", new Document("menarca", uc.getMenarca())
                    .append("ivsa", uc.getIvsa())
                    .append("numero_parejas", uc.getNumero_parejas())
                    .append("embarazos", uc.getEmbarazos())
                    .append("metodo_anticonceptivo", uc.getMetodo_anticonceptivo()));
            collection.updateOne(filter, update);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public static boolean eliminar(Sentencias uc) {
        try {
            Document filter = new Document("id", uc.getId());
            collection.deleteOne(filter);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public static boolean eliminarTodo() {
        try {
            collection.deleteMany(new Document());
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
