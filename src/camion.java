public class camion  extends Vehiculo {
   private boolean remolque;
   private boolean dormitorio;

    public camion()
    {
        
    }
	public camion(String nroplaca, String marca, boolean estado, int valor, boolean remolque, boolean dormitorio) {
		super(nroplaca, marca, estado, valor);
		this.remolque = remolque;
		this.dormitorio = dormitorio;
    }
	public boolean getRemolque() {
		return remolque;
	}
	public void setRemolque(boolean remolque) {
		this.remolque = remolque;
	}
	public boolean getDormitorio() {
		return dormitorio;
	}
	public void setDormitorio(boolean dormitorio) {
        this.dormitorio = dormitorio;
    }
        public double pagarViaticos(String nroplaca, double valorviaticos)
        {
            double porcviaticos;
            if (valorviaticos > 200000)
            {
            porcviaticos = valorviaticos * 0.1;
            }
            else
            {
                porcviaticos = 0;
            }
            return porcviaticos;
        
	}


}
