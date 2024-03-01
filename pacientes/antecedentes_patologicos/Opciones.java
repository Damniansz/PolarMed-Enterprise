package pacientes.antecedentes_patologicos;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import conexion.ConexionBD;

/**
 *
 * @author Rojeru San CL
 */
public class Opciones {

    static ConexionBD cc = new ConexionBD();
    static MongoClient mongoClient = cc.obtenerConexion();
    static MongoDatabase database = mongoClient.getDatabase("historia_clinica");
    static MongoCollection<Document> collection = database.getCollection("antecedentes_patologicos");

    public static boolean registrar(Sentencias uc) {
        try {
            Document document = new Document("id", uc.getId())
                    .append("enfermedades_infecto", uc.getEnfermedades_infecto())
                    .append("cronico_degenerativas", uc.getCronico_degenerativas())
                    .append("alergicos", uc.getAlergicos())
                    .append("quirurgicos", uc.getQuirurgicos())
                    .append("traumatologicos", uc.getTraumatologicos())
                    .append("transfuciones", uc.getTransfuciones())
                    .append("convulsiones", uc.getConvulsiones())
                    .append("adicciones", uc.getAdicciones())
                    .append("hospitalizaciones", uc.getHospitalizaciones());
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
            Document update = new Document("$set", new Document("enfermedades_infecto", uc.getEnfermedades_infecto())
                    .append("cronico_degenerativas", uc.getCronico_degenerativas())
                    .append("alergicos", uc.getAlergicos())
                    .append("quirurgicos", uc.getQuirurgicos())
                    .append("traumatologicos", uc.getTraumatologicos())
                    .append("transfuciones", uc.getTransfuciones())
                    .append("convulsiones", uc.getConvulsiones())
                    .append("adicciones", uc.getAdicciones())
                    .append("hospitalizaciones", uc.getHospitalizaciones()));
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
