
public class Espacio {

    private String codigoEspacio;
    private TipoEspacio tipo;
    private String nombre;
    private int capacidad;
    private String estado;


    public Espacio(String codigoEspacio, TipoEspacio tipo, String nombre, int capacidad, String estado) {
        this.codigoEspacio = codigoEspacio;
        this.tipo = tipo;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.estado = estado;
    }


    public String getCodigoEspacio() {
        return codigoEspacio;
    }


    public TipoEspacio getTipo() {
        return tipo;
    }


    public String getNombre() {
        return nombre;
    }


    public int getCapacidad() {
        return capacidad;
    }


    public String getEstado() {
        return estado;
    }


    public void setCodigoEspacio(String codigoEspacio) {
        this.codigoEspacio = codigoEspacio;
    }


    public void setTipo(TipoEspacio tipo) {
        this.tipo = tipo;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }


    public void setEstado(String estado) {
        this.estado = estado;
    }


    
    
}