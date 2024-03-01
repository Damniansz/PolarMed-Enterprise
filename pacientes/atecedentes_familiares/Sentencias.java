
package pacientes.atecedentes_familiares;

/**
 *
 * @author Rojeru San CL
 */
public class Sentencias {

    public static String LISTAR = "SELECT * FROM atecedentes_familiares";

    public static String REGISTRAR = "INSERT INTO atecedentes_familiares("
            + "id, "
            + "heredo_familiar  ) "
            + "VALUES(?,?)";

    public static String ACTUALIZAR = "UPDATE atecedentes_familiares SET "
            + "heredo_familiar = ?  "
            + "WHERE id        = ?  ";

    public static String ELIMINAR = "DELETE FROM atecedentes_familiares WHERE id = ?";

    public static String ELIMINAR_TODO = "TRUNCATE TABLE atecedentes_familiares";

    private int id;
    private String heredo_familiar;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHeredo_familiar() {
        return heredo_familiar;
    }

    public void setHeredo_familiar(String heredo_familiar) {
        this.heredo_familiar = heredo_familiar;
    }
    
}
