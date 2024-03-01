
package pacientes.atecedentes_guineco_obstetricos;

/**
 *
 * @author Rojeru San CL
 */
public class Sentencias {

    public static String LISTAR = "SELECT * FROM atecedentes_guineco_obstetricos";

    public static String REGISTRAR = "INSERT INTO atecedentes_guineco_obstetricos("
            + "id                 , "
            + "menarca                 , "
            + "ivsa                    , "
            + "numero_parejas          , "
            + "embarazos               , "
            + "metodo_anticonceptivo)    "
            + "VALUES(?,?,?,?,?,?)";
    
    /* */

    public static String ACTUALIZAR = "UPDATE atecedentes_guineco_obstetricos SET "
            + "menarca                = ?, "
            + "ivsa                   = ?, "
            + "numero_parejas         = ?, "
            + "embarazos              = ?, "
            + "metodo_anticonceptivo  = ?  "
            + "WHERE id               = ?  ";

    public static String ELIMINAR = "DELETE FROM atecedentes_guineco_obstetricos WHERE id = ?";

    public static String ELIMINAR_TODO = "TRUNCATE TABLE atecedentes_guineco_obstetricos";

    private int id;
    private String menarca;
    private String ivsa;
    private int numero_parejas;
    private int embarazos;
    private String metodo_anticonceptivo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMenarca() {
        return menarca;
    }

    public void setMenarca(String menarca) {
        this.menarca = menarca;
    }
    
    public String getIvsa() {
        return ivsa;
    }

    public void setIvsa(String ivsa) {
        this.ivsa = ivsa;
    }

    public int getNumero_parejas() {
        return numero_parejas;
    }

    public void setNumero_parejas(int numero_parejas) {
        this.numero_parejas = numero_parejas;
    }

    public int getEmbarazos() {
        return embarazos;
    }

    public void setEmbarazos(int embarazos) {
        this.embarazos = embarazos;
    }

    public String getMetodo_anticonceptivo() { 
        return metodo_anticonceptivo;
    }

    public void setMetodo_anticonceptivo(String metodo_anticonceptivo) {
        this.metodo_anticonceptivo = metodo_anticonceptivo;
    }
    
    
}
