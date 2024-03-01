

package pacientes.ficha_identificacion;

import com.mongodb.client.MongoClient;
import org.bson.Document;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Sorts;
import conexion.ConexionBD;
import java.util.Arrays;
import java.util.regex.Pattern;
import javax.swing.table.DefaultTableModel;
import pacientes.ficha_identificacion.Sentencias;


public class Opciones {

    static ConexionBD cc = new ConexionBD();
    static MongoClient mongoClient = cc.obtenerConexion();
    static MongoDatabase database = mongoClient.getDatabase("historia_clinica");

    public static boolean registrar(Sentencias uc) {
        MongoCollection<Document> collection = database.getCollection("ficha_identificacion");
        Document doc = new Document("id_paciente", uc.getId_paciente())
                .append("n_control", uc.getN_control())
                .append("carrera", uc.getCarrera())
                .append("nombre", uc.getNombre())
                .append("genero", uc.getGenero())
                .append("edad", uc.getEdad())
                .append("fecha_nacimiento", uc.getFecha_nacimiento())
                .append("lugar_nacimiento", uc.getLugar_nacimiento())
                .append("lugar_origen", uc.getLugar_origen())
                .append("domicilio", uc.getDomicilio())
                .append("estado_civil", uc.getEstado_civil())
                .append("religion", uc.getReligion());
        collection.insertOne(doc);
        return true;
    }

    public static boolean actualizar(Sentencias uc) {
        MongoCollection<Document> collection = database.getCollection("ficha_identificacion");
        Document filter = new Document("id_paciente", uc.getId_paciente());
        Document update = new Document("$set", new Document("n_control", uc.getN_control())
                .append("carrera", uc.getCarrera())
                .append("nombre", uc.getNombre())
                .append("genero", uc.getGenero())
                .append("edad", uc.getEdad())
                .append("fecha_nacimiento", uc.getFecha_nacimiento())
                .append("lugar_nacimiento", uc.getLugar_nacimiento())
                .append("lugar_origen", uc.getLugar_origen())
                .append("domicilio", uc.getDomicilio())
                .append("estado_civil", uc.getEstado_civil())
                .append("religion", uc.getReligion()));
        collection.updateOne(filter, update);
        return true;
    }

    public static boolean eliminar(Sentencias uc) {
        MongoCollection<Document> collection = database.getCollection("ficha_identificacion");
        Document filter = new Document("id_paciente", uc.getId_paciente());
        collection.deleteOne(filter);
        return true;
    }

    public static boolean eliminarTodo() {
        MongoCollection<Document> collection = database.getCollection("ficha_identificacion");
        collection.deleteMany(new Document());
        return true;
    }

    public static int extraerID() {
        MongoCollection<Document> collection = database.getCollection("ficha_identificacion");
        Document sort = new Document("id_paciente", -1); // Orden descendente
        MongoCursor<Document> cursor = collection.find().sort(sort).limit(1).iterator();
        int maxID = 0;
        if (cursor.hasNext()) {
            Document doc = cursor.next();
            maxID = doc.getInteger("id_paciente");
        }
        return maxID + 1;
    }

    public static boolean verificaNumControl(String n_control) {
        MongoCollection<Document> collection = database.getCollection("ficha_identificacion");
        Document query = new Document("n_control", n_control);
        return collection.find(query).iterator().hasNext();
    }

    public static void listar(String busca) {
        MongoCollection<Document> collection = database.getCollection("ficha_identificacion");
        DefaultTableModel modelo = (DefaultTableModel) principal.Principal.tablaPacientes.getModel();

        int contador = 0;

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        Document query = new Document("$or", Arrays.asList(new Document("id", Pattern.compile("^" + busca)),
                new Document("n_control", Pattern.compile("^" + busca)),
                new Document("carrera", Pattern.compile("^" + busca)),
                new Document("nombre", Pattern.compile("^" + busca)),
                new Document("genero", Pattern.compile("^" + busca)),
                new Document("edad", Pattern.compile("^" + busca))));

        MongoCursor<Document> cursor = collection.find(query).iterator();
        while (cursor.hasNext()) {
            Document doc = cursor.next();
            modelo.addRow(new Object[]{doc.getInteger("id_paciente"), doc.getString("n_control"),
                    doc.getString("nombre"), doc.getString("genero"), doc.getString("edad"),
                    doc.getString("carrera")});
            contador++;
        }

        if (contador == 0 && !busca.equals("")) {
            modelo.addRow(new Object[]{"", "", "", "Sin resultados...", "", ""});
        }
    }

    public static void selecionaFila(String num_control) {
        DefaultTableModel modelo = (DefaultTableModel) principal.Principal.tablaPacientes.getModel();
        for (int i = 0; i < modelo.getRowCount(); i++) {
            if (num_control.equals(modelo.getValueAt(i, 0).toString())) {
                principal.Principal.tablaPacientes.setRowSelectionInterval(i, i);
                break;
            }
        }
    }

    public static void verDatos(pacientes.VerDatos ver, String n_control) {
        MongoCollection<Document> collection = database.getCollection("ficha_identificacion");
        Document query = new Document("n_control", n_control);
        Document result = collection.find(query).first();
        if (result != null) {
            pacientes.Variables.NO_CONTROL = result.getString("n_control");
            pacientes.Variables.CARRERA = result.getString("carrera");
            pacientes.Variables.NOMBRES = result.getString("nombre");
            pacientes.Variables.GENERO = result.getString("genero");
            pacientes.Variables.EDAD = result.getString("edad");
            pacientes.Variables.FECHA = result.getString("fecha_nacimiento");
            pacientes.Variables.LUGAR_NAC = result.getString("lugar_nacimiento");
            pacientes.Variables.LUGAR_ORIGEN = result.getString("lugar_origen");
            pacientes.Variables.DOMICILIO = result.getString("domicilio");
            pacientes.Variables.EST_CIVIL = result.getString("estado_civil");
            pacientes.Variables.RELIGION = result.getString("religion");
            ver.muestraDatos();
        }
    }
}
