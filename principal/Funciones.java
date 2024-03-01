package principal;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.UpdateOptions;
import com.mongodb.client.result.UpdateResult;
import conexion.ConexionBD;
import necesario.RSScrollBar;
import org.bson.Document;

import java.awt.Color;
import java.awt.Cursor;

public class Funciones {

    static ConexionBD cc = new ConexionBD();
    static MongoClient mongoClient = cc.obtenerConexion();
    static MongoDatabase database = mongoClient.getDatabase("historia_clinica");

    public static void inicioEdicionTablas() {
        // La configuración de las tablas no requiere cambios para MongoDB
        principal.Principal.scrollPaciente.getViewport().setBackground(Color.white);
        principal.Principal.scrollPaciente.getHorizontalScrollBar().setUI(new RSScrollBar());
        principal.Principal.tablaPacientes.setCursor(new Cursor(12));

        principal.Principal.scrollConsultas.getViewport().setBackground(Color.white);
        principal.Principal.scrollConsultas.getHorizontalScrollBar().setUI(new RSScrollBar());
        principal.Principal.tablaConsultas.setCursor(new Cursor(12));

        principal.Principal.scrollUsuarios.getViewport().setBackground(Color.white);
        principal.Principal.scrollUsuarios.getHorizontalScrollBar().setUI(new RSScrollBar());
        principal.Principal.tablaUsuarios.setCursor(new Cursor(12));
    }

    public static String verificarUsuario(String usuario) {
        String existe = "";
        MongoCollection<Document> collection = database.getCollection("usuarios");
        Document query = new Document("usuario", usuario);
        Document result = collection.find(query).first();
        if (result != null) {
            existe = result.getString("usuario");
        }
        return existe;
    }

    public static String verificaPassword(String usuario) {
        String existe = "";
        MongoCollection<Document> collection = database.getCollection("usuarios");
        Document query = new Document("usuario", usuario);
        Document result = collection.find(query).first();
        if (result != null) {
            existe = result.getString("password");
        }
        return existe;
    }

    public static String obtenerTipoUsuario(String usuario) {
        String existe = "";
        MongoCollection<Document> collection = database.getCollection("usuarios");
        Document query = new Document("usuario", usuario);
        Document result = collection.find(query).first();
        if (result != null) {
            existe = result.getString("tipo_us");
        }
        return existe;
    }

    public static String obtenerNombre(String usuario) {
        String existe = "";
        MongoCollection<Document> collection = database.getCollection("usuarios");
        Document query = new Document("usuario", usuario);
        Document result = collection.find(query).first();
        if (result != null) {
            existe = result.getString("nombre");
        }
        return existe;
    }

    public static String obtenerID(String usuario) {
        String existe = "";
        MongoCollection<Document> collection = database.getCollection("usuarios");
        Document query = new Document("usuario", usuario);
        Document result = collection.find(query).first();
        if (result != null) {
            existe = result.getString("id");
        }
        return existe;
    }

    public static String obtenerUsuario(String id) {
        String existe = "";
        MongoCollection<Document> collection = database.getCollection("usuarios");
        Document query = new Document("id", id);
        Document result = collection.find(query).first();
        if (result != null) {
            existe = result.getString("usuario");
        }
        return existe;
    }

    public static boolean actualizarUs(String id, String usNu) {
        MongoCollection<Document> collection = database.getCollection("usuarios");
        Document filter = new Document("id", id);
        Document update = new Document("$set", new Document("usuario", usNu));
        UpdateResult result = collection.updateOne(filter, update);
        return result.getModifiedCount() > 0;
    }

    public static boolean actualizarPass(String id, String pass) {
        MongoCollection<Document> collection = database.getCollection("usuarios");
        Document filter = new Document("id", id);
        Document update = new Document("$set", new Document("password", pass));
        UpdateResult result = collection.updateOne(filter, update);
        return result.getModifiedCount() > 0;
    }
}
