package usuarios;

/**
 *
 * @author Rojeru San CL
 */
public class Sentencias {

    public static String LISTAR = "SELECT * FROM usuarios WHERE tipo_us != 'SUPER ADMIN'";

    public static String REGISTRAR = "INSERT INTO usuarios("
            + "id,"
            + "nombre,"
            + "usuario,"
            + "password,"
            + "tipo_us) "
            + "VALUES(?,?,?,?,?)";

    public static String ACTUALIZAR = "UPDATE usuarios SET "
            + "nombre         = ?, "
            + "usuario            = ?, "
            + "password         = ?, "
            + "tipo_us            = ? "
            + "WHERE id          = ?  ";

    public static String ELIMINAR = "DELETE FROM usuarios WHERE id = ?";

    public static String ELIMINAR_TODO = "TRUNCATE TABLE usuarios";

    private int id;
    private String nombre;
    private String usuario;
    private String password;
    private String tipo_usuario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

}
