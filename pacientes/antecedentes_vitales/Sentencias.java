
package pacientes.antecedentes_vitales;

/**
 *
 * @author Rojeru San CL
 */
public class Sentencias {

    public static String LISTAR = "SELECT * FROM signos_vitales_somatometria";

    public static String REGISTRAR = "INSERT INTO signos_vitales_somatometria("
            + "id , "
            + "pulso , "
            + "presion , "
            + "temperatura           , "
            + "frecuencia_respiratoria       , "
            + "peso         , "
            + "talla          , "
            + "indice_masa_corporal            , "
            + "tipo_sangre     ) "
            + "VALUES(?,?,?,?,?,?,?,?,?)";

    public static String ACTUALIZAR = "UPDATE signos_vitales_somatometria SET "
            + "pulso         = ?, "
            + "presion         = ?, "
            + "temperatura           = ?, "
            + "frecuencia_respiratoria         = ?, "
            + "peso     = ?, "
            + "talla       = ?, "
            + "indice_masa_corporal        = ?, "
            + "tipo_sangre          = ? "
            + "WHERE id            = ?  ";

    public static String ELIMINAR = "DELETE FROM signos_vitales_somatometria WHERE id = ?";

    public static String ELIMINAR_TODO = "TRUNCATE TABLE signos_vitales_somatometria";

    private int id;
    private String pulso;
    private String presion;
    private String temperatura;
    private String frecuencia_respiratoria;
    private String peso;
    private String talla;
    private String indice_masa_corporal;
    private String tipo_sangre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPulso() {
        return pulso;
    }

    public void setPulso(String pulso) {
        this.pulso = pulso;
    }

    public String getPresion() {
        return presion;
    }

    public void setPresion(String presion) {
        this.presion = presion;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getFrecuencia_respiratoria() {
        return frecuencia_respiratoria;
    }

    public void setFrecuencia_respiratoria(String frecuencia_respiratoria) {
        this.frecuencia_respiratoria = frecuencia_respiratoria;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getIndice_masa_corporal() {
        return indice_masa_corporal;
    }

    public void setIndice_masa_corporal(String indice_masa_corporal) {
        this.indice_masa_corporal = indice_masa_corporal;
    }

    public String getTipo_sangre() {
        return tipo_sangre;
    }

    public void setTipo_sangre(String tipo_sangre) {
        this.tipo_sangre = tipo_sangre;
    }
    
    
}
