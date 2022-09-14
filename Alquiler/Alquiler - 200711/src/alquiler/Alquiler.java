package alquiler;

public class Alquiler {

    private Cliente aCliente;
    private Vehiculo aVehiculo;
    private int diasAlquiler;
    private double kmsDia;
    private double seguro;

    public Alquiler(){}

    public Alquiler(Cliente aCliente, Vehiculo aVehiculo, int diasAlquiler, double kmsDia, double seguro) { /*Paso de parametros: invocación de un objeto a traves de
    un identificador generico, que modifica al objeto final, y no al generico invocado*/
        this.aCliente = aCliente;
        this.aVehiculo = aVehiculo;
        this.diasAlquiler = diasAlquiler;
        this.kmsDia = kmsDia;
        this.seguro = seguro;
    }

    public Cliente getaCliente() {
        return aCliente;
    }

    public void setaCliente(Cliente aCliente) {
        this.aCliente = aCliente;
    }

    public Vehiculo getaVehiculo() {
        return aVehiculo;
    }

    public void setaVehiculo(Vehiculo aVehiculo) {
        this.aVehiculo = aVehiculo;
    }

    public int getDiasAlquiler() {
        return diasAlquiler;
    }

    public void setDiasAlquiler(int diasAlquiler) {
        this.diasAlquiler = diasAlquiler;
    }

    public double getKmsDia() {
        return kmsDia;
    }

    public void setKmsDia(double kmsDia) {
        this.kmsDia = kmsDia;
    }

    public double getSeguro() {

        return this.seguro;
    }

    public void setSeguro(){

        this.seguro = ((this.aVehiculo.valorDesgaste(this.kmsDia))*this.diasAlquiler)*(this.aVehiculo.getTarifa()*.08);
    }

    @Override
    public String toString(){

        return "El seguro de " + this.aVehiculo.toString() + " alquilado por " + this.aCliente.toString() + " es de " +
                this.seguro + " por los " + this.diasAlquiler + " dias que fue alquilado.";
    }
}
