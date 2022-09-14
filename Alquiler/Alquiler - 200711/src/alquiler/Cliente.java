package alquiler;

public class Cliente {

    private String cedula;
    private String nombre;
    private String telefono;

    public Cliente(){}

    public Cliente(String cedula, String nombre, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() { /* La reescritura de metodos predefinidos esta ligada a la necesidad de la clase implementada y su solucion.
                                cuando se refedinen metodos de la clase Object, no es "tan" necesario definir el @override*/
        return this.nombre + " con CI: " + this.cedula + " y numero de contacto: " + this.telefono;
    }
}
