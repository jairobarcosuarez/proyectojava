public class Vehiculo {
    //definir atributos de vehiculo
    private String nroplaca;
    private String marca;
    private boolean estado;
    private int valor;

//generando metodo (s) construtores

    public Vehiculo() {
    }

    public Vehiculo(String nroplaca) {
        this.nroplaca = nroplaca;
    }

    public Vehiculo(String nroplaca, String marca) {
        this.nroplaca = nroplaca;
        this.marca = marca;
    }

    public Vehiculo(String nroplaca, String marca, boolean estado) {
        this.nroplaca = nroplaca;
        this.marca = marca;
        this.estado = estado;
    }

    public Vehiculo(String nroplaca, String marca, boolean estado, int valor) {
        this.nroplaca = nroplaca;
        this.marca = marca;
        this.estado = estado;
        this.valor = valor;
    }

    //meto sets (sirve para cambiar la iformacion de los actributos)
//y get (sirve para mostrar la imformacion de un actributos)

    public String getNroplaca() {
        return nroplaca;
    }

    public void setNroplaca(String nroplaca) {
        this.nroplaca = nroplaca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
public void comprar(String nroplaca, int valor)
   {
       System.out.println("se ha comprado el vehiculo con la placa y valor "+nroplaca+" , "+valor);
   }
   public String vender(String nroplaca)
   {
       return "Se ha vendido el vehiculo con placa "+nroplaca;
   }
}


