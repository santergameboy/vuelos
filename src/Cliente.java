public class Cliente {

    int idCliente;
    String nombre;
    String primerapellido;
    String segundoApellido;

    public Cliente(int idCliente, String nombre, String primerapellido, String segundoApellido) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.primerapellido = primerapellido;
        this.segundoApellido = segundoApellido;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerapellido() {
        return primerapellido;
    }

    public void setPrimerapellido(String primerapellido) {
        this.primerapellido = primerapellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
}
