package alquiler;

public abstract class Vehiculo{

    protected String matricula;
    protected String marca;
    protected String color;
    protected double tarifa;
    protected boolean disponible;
    protected int cilindraje;

    public Vehiculo(){}

    public Vehiculo(String matricula, String marca, String color, double tarifa, boolean disponible,
                    int cilindraje) {
        this.matricula = matricula;
        this.marca = marca;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = disponible;
        this.cilindraje = cilindraje;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public double valorDesgaste(double kilomentraje){

        return ((this.cilindraje*.10)*kilomentraje)/100;
    }

    public abstract double maxKms(); //Funcion abstracta, donde se define el que, pero no el como.
    public abstract String retornarPrecio();

    @Override
    public String toString() {

       return "El vehiculo de matricula " + this.matricula + " y marca: " + this.marca +
       " de color " + this.color + " y cilindraje: " + this.cilindraje + ". Su tarifa es: " + this.tarifa;
    }


}
