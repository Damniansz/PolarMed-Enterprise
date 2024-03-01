
package pacientes.atecedentes_general;

/**
 *
 * @author Rojeru San CL
 */
public class Sentencias {

    public static String LISTAR = "SELECT * FROM inspeccion_general";

    public static String REGISTRAR = "INSERT INTO inspeccion_general("
            + "id, "
            + "general  ) "
            + "VALUES(?,?)";

    public static String ACTUALIZAR = "UPDATE inspeccion_general SET "
            + "general = ?  "
            + "WHERE id        = ?  ";

    public static String ELIMINAR = "DELETE FROM inspeccion_general WHERE id = ?";

    public static String ELIMINAR_TODO = "TRUNCATE TABLE inspeccion_general";

    private int id;
    private String general;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGeneral() {
        return general;
    }

    public void setGeneral(String general) {
        this.general = general;
    }

}
