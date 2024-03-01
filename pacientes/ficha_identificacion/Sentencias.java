package pacientes.ficha_identificacion;

/**
 *
 * @author Rojeru San CL
 */
public class Sentencias {

    public static String LISTAR = "SELECT * FROM ficha_identificacion";

    public static String REGISTRAR = "INSERT INTO ficha_identificacion("
            + "id,"
            + "n_control,"
            + "carrera,"
            + "nombre,"
            + "genero,"
            + "edad,"
            + "fecha_nacimiento,"
            + "lugar_nacimiento,"
            + "lugar_origen,"
            + "domicilio,"
            + "estado_civil,"
            + "religion) "
            + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";

    public static String ACTUALIZAR = "UPDATE ficha_identificacion SET "
            + "n_control         = ?, "
            + "carrera         = ?, "
            + "nombre            = ?, "
            + "genero            = ?, "
            + "edad              = ?, "
            + "fecha_nacimiento  = ?, "
            + "lugar_nacimiento  = ?, "
            + "lugar_origen      = ?, "
            + "domicilio         = ?, "
            + "estado_civil      = ?, "
            + "religion      = ? "
            + "WHERE id          = ?  ";

    public static String ELIMINAR = "DELETE FROM ficha_identificacion WHERE id = ?";

    public static String ELIMINAR_TODO = "TRUNCATE TABLE ficha_identificacion";

    private int id_paciente;
    private String n_control;
     private String carrera;
    private String nombre;
    private String genero;
    private String edad;
    private String fecha_nacimiento;
    private String lugar_nacimiento;
    private String lugar_origen;
    private String domicilio;
    private String estado_civil;
    private String religion;

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public String getN_control() {
        return n_control;
    }

    public void setN_control(String n_control) {
        this.n_control = n_control;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getLugar_nacimiento() {
        return lugar_nacimiento;
    }

    public void setLugar_nacimiento(String lugar_nacimiento) {
        this.lugar_nacimiento = lugar_nacimiento;
    }

    public String getLugar_origen() {
        return lugar_origen;
    }

    public void setLugar_origen(String lugar_origen) {
        this.lugar_origen = lugar_origen;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

}
