
package pacientes.antecedentes_patologicos;

/**
 *
 * @author Rojeru San CL
 */
public class Sentencias {

    public static String LISTAR = "SELECT * FROM antecedentes_patologicos";

    public static String REGISTRAR = "INSERT INTO antecedentes_patologicos("
            + "id , "
            + "enfermedades_infecto , "
            + "cronico_degenerativas , "
            + "alergicos             , "
            + "quirurgicos           , "
            + "traumatologicos       , "
            + "transfuciones         , "
            + "convulsiones          , "
            + "adicciones            , "
            + "hospitalizaciones     ) "
            + "VALUES(?,?,?,?,?,?,?,?,?,?)";

    public static String ACTUALIZAR = "UPDATE antecedentes_patologicos SET "
            + "enfermedades_infecto         = ?, "
            + "cronico_degenerativas         = ?, "
            + "alergicos           = ?, "
            + "quirurgicos         = ?, "
            + "traumatologicos     = ?, "
            + "transfuciones       = ?, "
            + "convulsiones        = ?, "
            + "adicciones          = ?, "
            + "hospitalizaciones   = ?  "
            + "WHERE id            = ?  ";

    public static String ELIMINAR = "DELETE FROM antecedentes_patologicos WHERE id = ?";

    public static String ELIMINAR_TODO = "TRUNCATE TABLE antecedentes_patologicos";

    private int id;
    private String enfermedades_infecto;
    private String cronico_degenerativas;
    private String alergicos;
    private String quirurgicos;
    private String traumatologicos;
    private String transfuciones;
    private String convulsiones;
    private String adicciones;
    private String hospitalizaciones;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEnfermedades_infecto() {
        return enfermedades_infecto;
    }

    public void setEnfermedades_infecto(String enfermedades_infecto) {
        this.enfermedades_infecto = enfermedades_infecto;
    }
    
    public String getCronico_degenerativas() {
        return cronico_degenerativas;
    }

    public void setCronico_degenerativas(String cronico_degenerativas) {
        this.cronico_degenerativas = cronico_degenerativas;
    }

    public String getAlergicos() {
        return alergicos;
    }

    public void setAlergicos(String alergicos) {
        this.alergicos = alergicos;
    }

    public String getQuirurgicos() {
        return quirurgicos;
    }

    public void setQuirurgicos(String quirurgicos) {
        this.quirurgicos = quirurgicos;
    }

    public String getTraumatologicos() { 
        return traumatologicos;
    }

    public void setTraumatologicos(String traumatologicos) {
        this.traumatologicos = traumatologicos;
    }
    
     public String getTransfuciones() { 
        return transfuciones;
    }

    public void setTransfuciones(String transfuciones) {
        this.transfuciones = transfuciones;
    }
    
         public String getAdicciones() { 
        return adicciones;
    }
             public void setConvulsiones(String convulsiones) {
        this.convulsiones = convulsiones;
    }
    
         public String getConvulsiones() { 
        return convulsiones;
    }

         

    public void setAdicciones(String adicciones) {
        this.adicciones = adicciones;
    }
   
          public String getHospitalizaciones() { 
        return hospitalizaciones;
    }

    public void setHospitalizaciones(String hospitalizaciones) {
        this.hospitalizaciones = hospitalizaciones;
    }

    
   
}
