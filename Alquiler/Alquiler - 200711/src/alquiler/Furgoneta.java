package alquiler;

public class Furgoneta extends Vehiculo implements AMT,CCQ{

    private double distanciaAsientos;
    private int numAsientos;
    private int numllantas;



    public Furgoneta(String matricula, String marca, String color, double tarifa, boolean disponible, int cilindraje, double distanciaAsientos, int numAsientos, int numllantas) {
        super(matricula, marca, color, tarifa, disponible, cilindraje);
        this.distanciaAsientos = distanciaAsientos;
        this.numAsientos = numAsientos;
        this.numllantas = numllantas;
    }



    public double getDistanciaAsientos() {
        return distanciaAsientos;
    }

    public void setDistanciaAsientos(double distanciaAsientos) {
        this.distanciaAsientos = distanciaAsientos;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    public int getNumllantas() {
        return numllantas;
    }

    public void setNumllantas(int numllantas) {
        this.numllantas = numllantas;
    }
    @Override
    public double maxKms() {
        return this.distanciaAsientos*.12*super.tarifa;
    }
    public String toString(){

        return super.toString() + " Furgoneta con distancia de asientos de " +this.distanciaAsientos+" Con numeros de asientos de:" +
                + this.numAsientos + "con numero de llantas de : "+this.numllantas;
    }
    @Override
    public double matricula(){
        return this.distanciaAsientos*super.cilindraje;
    }

    @Override
    public double revision(){
        return this.numAsientos*.12*super.tarifa;
    }
    @Override
    public double impuestoEmpresa(){
        return this.cilindraje*super.tarifa*.005;
    }
    @Override
    public double impuestoUsoNoPersonal(){
        return this.numllantas*super.cilindraje*.005;
    }


    @Override
    public String retornarPrecio(){
        double a = this.impuestoUsoNoPersonal()+this.impuestoEmpresa()+this.revision()+this.matricula();
        return "Precio a pagar: "+a;
    }


}
