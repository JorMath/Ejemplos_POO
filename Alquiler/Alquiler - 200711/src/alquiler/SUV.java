package alquiler;

public class SUV extends Vehiculo implements SRI,CCQ{

    private double distanciaEjes;
    private String transmision;
    public SUV(){
        super();
    }

    public SUV(String matricula, String marca, String color, double tarifa, boolean disponible,
               int cilindraje, double distanciaEjes, String transmision){

        super(matricula,marca,color,tarifa,disponible,cilindraje);
        this.distanciaEjes = distanciaEjes;
        this.transmision = transmision;

    }

    public double getDistanciaEjes() {
        return distanciaEjes;
    }

    public void setDistanciaEjes(double distanciaEjes) {
        this.distanciaEjes = distanciaEjes;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    @Override
    public String toString(){

        return super.toString() + " con distancia entre ejes de " + this.distanciaEjes + " y transmision " + this.transmision;
    }

    @Override
    public double maxKms(){

        double trans = 0;

        if(this.transmision.equals("4x2")){

            trans = 100.5;
        }else{

            trans = 158.6;
        }

        return cilindraje*100 + this.distanciaEjes*0.15 - trans*46;
    }
    public String retornarPrecio(){
        return "";
    }
    @Override
    public double impAduana() {
        return this.distanciaEjes*.12;
    }
    @Override
    public double IR() {
        return super.tarifa*this.distanciaEjes*.12;
    }
    @Override
    public double impuestoEmpresa() {
        return super.tarifa*.05;
    }
    @Override
    public double impuestoUsoNoPersonal() {
        return this.distanciaEjes*.02;
    }
    @Override
    public String formulario() {
        double a = this.IR()+this.impAduana() + this.impuestoEmpresa() + this.impuestoUsoNoPersonal();
        return "Precio a pagar del SUV: "+a;
    }
}
