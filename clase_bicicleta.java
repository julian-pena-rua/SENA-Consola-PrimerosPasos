public class Bicicleta {
    
    public static void main(String[] args){
        Bicicleta bici1 = new Bicicleta();
        System.out.println(bici1.toString());
        
        Bicicleta bici2 = new Bicicleta(10, 10, 60, "Julian");
        System.out.println(bici2.toString());
        
    }

    /* || CLASE BICICLETA || */

    /* || ATRIBUTOS | CAMPOS | VARIABLES || */
    
    public int ritmo;           // Public: Puede ser accedido desde cualquier parte
    private int velocidad;      // Private: Accesible sólo desde esta clase
    protected int engranaje;    // Protected: Accesible desde esta clases y sus subclases
    String nombre;              // default: Sólo accesible desde este paquete

    // Constructores son la manera de agilizar la creación de clases
    // Este es un constructor por defecto
    public Bicicleta() {
        engranaje = 1;
        ritmo = 50;
        velocidad = 5;
        nombre = "Bontrager";
    }

    // Este es un constructor específico (contiene argumentos)
    public Bicicleta(int ritmoInicial, int velocidadInicial, int engranajeInicial, String nombre) {
        this.engranaje = engranajeInicial;
        this.ritmo = ritmoInicial;
        this.velocidad = velocidadInicial;
        this.nombre = nombre;
    }

    // Sintaxis de función:
    // <public/private/protected> <tipo_de_retorno> <nombre_funcion>(<argumentos>)

    // Las clases de Java usualmente implementan métodos 'get' (obtener) y 'set' (establecer) para sus campos

    // Sintaxis de declaración de métodos
    // <alcance> <tipo_de_retorno> <nombre_metodo>(<argumentos>)
    public int getRitmo() {
        return ritmo;
    }

    // Métodos void no requieren retornar
    public void setRitmo(int nuevoValor) {
        ritmo = nuevoValor;
    }

    public void setEngranaje(int nuevoValor) {
        engranaje = nuevoValor;
    }

    public void aumentarVelocidad(int incremento) {
        velocidad += incremento;
    }

    public void disminuirVelocidad(int reduccion) {
        velocidad -= reduccion;
    }

    public void setNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }

    public String getNombre() {
        return nombre;
    }

    //Método para mostrar los valores de los atributos de este objeto.
    @Override
    public String toString() {
        return "engranaje: " + engranaje +
                " ritmo: " + ritmo +
                " velocidad: " + velocidad +
                " nombre: " + nombre;
    }
} // fin clase Bicicleta