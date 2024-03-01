package pacientes.atecedentes_familiares;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import conexion.ConexionBD;
import org.bson.Document;

/**
 *
 * @author Rojeru San CL
 */
public class Opciones {

    static ConexionBD cc = new ConexionBD();
    static MongoClient mongoClient = cc.obtenerConexion();
    static MongoDatabase database = mongoClient.getDatabase("historia_clinica");
    static MongoCollection<Document> collection = database.getCollection("antecedentes_familiares");

    public static boolean registrar(Sentencias uc) {
        try {
            Document document = new Document("id", uc.getId())
                    .append("heredo_familiar", uc.getHeredo_familiar());
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
            Document update = new Document("$set", new Document("heredo_familiar", uc.getHeredo_familiar()));
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
