public class vans extends Vehiculo {
    boolean tipopuerta;  


public vans()
{

}

public vans(String nroplaca, String marca, boolean estado, int valor, boolean tipopuerta) {
	super(nroplaca, marca, estado, valor);
	this.tipopuerta = tipopuerta;
}

public boolean getTipopuerta() {
    return tipopuerta;
}

public void setTipopuerta(boolean tipopuerta) {
	this.tipopuerta = tipopuerta;
}
public void pagargasolina(String nroplaca, int preciogasolina)
{
    System.out.println("se ha pagado la gasolina de el numero de la placa "+nroplaca);
}
}