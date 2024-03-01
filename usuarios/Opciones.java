package usuarios;

import com.mongodb.BasicDBObject;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Accumulators;
import com.mongodb.client.model.Aggregates;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.UpdateOptions;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import conexion.ConexionBD;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;

public class Opciones {

    static ConexionBD cc = new ConexionBD();
    static MongoClient mongoClient = cc.obtenerConexion();
    static MongoDatabase database = mongoClient.getDatabase("historia_clinica");

    public static boolean registrar(Sentencias uc) {
        MongoCollection<Document> collection = database.getCollection("usuarios");
        Document document = new Document("id", uc.getId())
                .append("nombre", uc.getNombre())
                .append("usuario", uc.getUsuario())
                .append("password", uc.getPassword())
                .append("tipo_us", uc.getTipo_usuario());
        try {
            collection.insertOne(document);
            return true;
        } catch (Exception ex) {
            Logger.getLogger(Opciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static boolean actualizar(Sentencias uc) {
        MongoCollection<Document> collection = database.getCollection("usuarios");
        Document filter = new Document("id", uc.getId());
        Document update = new Document("$set", new Document("nombre", uc.getNombre())
                .append("usuario", uc.getUsuario())
                .append("password", uc.getPassword())
                .append("tipo_us", uc.getTipo_usuario()));
        UpdateResult result = collection.updateOne(filter, update);
        return result.getModifiedCount() > 0;
    }

    public static boolean eliminar(Sentencias uc) {
        MongoCollection<Document> collection = database.getCollection("usuarios");
        DeleteResult result = collection.deleteOne(Filters.eq("id", uc.getId()));
        return result.getDeletedCount() > 0;
    }

    public static boolean eliminarTodo() {
        MongoCollection<Document> collection = database.getCollection("usuarios");
        DeleteResult result = collection.deleteMany(new Document());
        return result.getDeletedCount() > 0;
    }

    public static int extraerIDMax() {
        MongoCollection<Document> collection = database.getCollection("usuarios");
        Document result = collection.aggregate(Arrays.asList(
                Aggregates.group(null, Accumulators.max("max_id", "$id"))
        )).first();
        if (result != null) {
            int maxID = result.getInteger("max_id", 0);
            return maxID + 1;
        }
        return 1; // Si no hay documentos en la colección, se devuelve 1 como el nuevo ID máximo.
    }

    public static int verificarUsuarios() {
        MongoCollection<Document> collection = database.getCollection("usuarios");
        return (int) collection.countDocuments();
    }

    public static String verificaUsuario(String usuario) {
        MongoCollection<Document> collection = database.getCollection("usuarios");
        Document query = new Document("usuario", usuario);
        Document result = collection.find(query).first();
        if (result != null) {
            return result.getString("usuario");
        }
        return "";
    }

    public static String extraerNombre(String id) {
        MongoCollection<Document> collection = database.getCollection("usuarios");
        Document query = new Document("id", Integer.parseInt(id));
        Document result = collection.find(query).first();
        if (result != null) {
            return result.getString("nombre");
        }
        return "";
    }

    public static String extraerPassword(String id) {
        MongoCollection<Document> collection = database.getCollection("usuarios");
        Document query = new Document("id", Integer.parseInt(id));
        Document result = collection.find(query).first();
        if (result != null) {
            return result.getString("password");
        }
        return "";
    }

    public static void listar(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) principal.Principal.tablaUsuarios.getModel();
        modelo.setRowCount(0); // Limpiar el modelo de la tabla

        MongoCollection<Document> collection = database.getCollection("usuarios");
        BasicDBObject regexQuery = new BasicDBObject();
        regexQuery.put("$regex", ".*" + busca + ".*");
        regexQuery.put("$options", "i"); // Hacer la búsqueda insensible a mayúsculas y minúsculas

        BasicDBObject searchQuery = new BasicDBObject();
        searchQuery.put("$or", Arrays.asList(
                new BasicDBObject("id", regexQuery),
                new BasicDBObject("nombre", regexQuery),
                new BasicDBObject("usuario", regexQuery),
                new BasicDBObject("tipo_us", regexQuery)
        ));
        searchQuery.put("tipo_us", new BasicDBObject("$ne", "SUPER ADMIN")); // No incluir a los usuarios 'SUPER ADMIN'

        FindIterable<Document> cursor = collection.find(searchQuery);

        int contador = 0;
        for (Document doc : cursor) {
            contador++;
            modelo.addRow(new Object[]{
                doc.getInteger("id"),
                doc.getString("nombre"),
                doc.getString("usuario"),
                doc.getString("tipo_us")
            });
        }

        if (contador == 0 && !busca.isEmpty()) {
            modelo.addRow(new Object[]{"", "Sin resultados...", "", ""});
        }
    }

    public static void selecionaFila(String id) {
        DefaultTableModel modelo = (DefaultTableModel) principal.Principal.tablaUsuarios.getModel();
        for (int i = 0; i < modelo.getRowCount(); i++) {
            if (id.equals(modelo.getValueAt(i, 0).toString())) {
                principal.Principal.tablaUsuarios.setRowSelectionInterval(i, i);
                break;
            }
        }
    }

    public static void extraerDatos(principal.Principal principal, String id) {
        MongoCollection<Document> collection = database.getCollection("usuarios");
        Document query = new Document("id", Integer.parseInt(id));
        Document result = collection.find(query).first();
        if (result != null) {
            principal.txtNombre.setText(result.getString("nombre"));
            principal.txtUser.setText(result.getString("usuario"));
            principal.txtPass.setText(result.getString("password"));
            principal.comboTipo.setSelectedItem(result.getString("tipo_us"));
            principal.btnRegistrar.setText("GUARDAR");
        }
    }

}
