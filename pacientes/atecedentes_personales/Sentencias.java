
package pacientes.atecedentes_personales;


/**
 *
 * @author Rojeru San CL
 */
public class Sentencias {

    public static String LISTAR = "SELECT * FROM  atecedentes_no_patologicos ORDER";

    public static String REGISTRAR = "INSERT INTO  atecedentes_no_patologicos("
            + "id         , "
            + "alimentacion         , "
            + "habitacion           , "
            + "habitos_higienicos   ) "
            + "VALUES(?,?,?,?)";

    public static String ACTUALIZAR = "UPDATE atecedentes_no_patologicos SET "
            + "alimentacion         = ?, "
            + "habitacion           = ?, "
            + "habitos_higienicos   = ?  "
            + "WHERE id             = ?  ";

    public static String ELIMINAR = "DELETE FROM atecedentes_no_patologicos WHERE id = ?";

    public static String ELIMINAR_TODO = "TRUNCATE TABLE atecedentes_no_patologicos";

    private int id;
    private String alimentacion;
    private String habitacion;
    private String habitos_higienicos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

    public String getHabitos_higienicos() {
        return habitos_higienicos;
    }

    public void setHabitos_higienicos(String habitos_higienicos) {
        this.habitos_higienicos = habitos_higienicos;
    }
   
}
