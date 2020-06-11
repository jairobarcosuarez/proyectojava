public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        //instanciar un objecto de la clase vehiculo
        Vehiculo objVehiculo = new Vehiculo();
        //llenar la imformacion con los metodos gets
        objVehiculo.setNroplaca("wrz456");
        objVehiculo.setMarca("Mazda 3");
        objVehiculo.setEstado(true);
        objVehiculo.setValor(38);
        System.out.println("placa "+objVehiculo.getNroplaca());
        System.out.println("marca: "+objVehiculo.getMarca());
        System.out.println("valor: "+objVehiculo.getValor());
       if (!objVehiculo.getEstado())//false
    {
        System.out.println("el vehiculo no se puede vender");  
    }
    else
    {
        System.out.println("el vehiculo  se puede vender");  
    }
    //utilizar el metodo comprar
    objVehiculo.comprar("nmr478", 35);

    /*camion Camion = new camion("mns673","TRUCK";true,85000,true,false);
    Camion.setnroplaca("mns486");
    Camion.setmarca("TRUCK");
    Camion.setestado("true");
    Camion.setvalor(85000);
    Camion.setdormitorio(false);
    Camion.setremolque(truee);
    System.out.println("la marca es:" +Camion.getmarca())*/
}
}
