package alquiler;

public final class Sedan extends Vehiculo implements SRI,AMT,CCQ{
//el sedan se caracteriza por el espacio en cajuela unicamente, y de carroceria tradicionalmente
    //son de tres volumenes, por lo que no habrá más, generalmente solo cambian en dimensiones.
    //el auto de tipo hatchback es similar, pero su distribucion es distinta, por lo que podría entrar
    //tranquilamente en sedan sin que haya otra clase hatchback que se herede de la sedan.
    private double espacioCajuela;

    public Sedan(){
        super();
    }

    public Sedan(String matricula, String marca, String color, double tarifa, boolean disponible, int cilindraje, double espacioCajuela) {
        super(matricula, marca, color, tarifa, disponible, cilindraje);
        this.espacioCajuela = espacioCajuela;
    }

    public double getEspacioCajuela() {
        return espacioCajuela;
    }

    public void setEspacioCajuela(double espacioCajuela) {
        this.espacioCajuela = espacioCajuela;
    }

    @Override
    public String toString(){

        return super.toString() + " con tamaño de cajuela de " + this.espacioCajuela;
    }
    public String retornarPrecio(){
        return "";
    }

    @Override
    public double maxKms() {

        return cilindraje*100 - this.espacioCajuela*3;
    }

    @Override
    public double IR() {

        return super.tarifa*.05;
    }

    @Override
    public double impAduana() {

        return super.cilindraje*.05 + super.tarifa*.05;
    }


    @Override
    public double matricula(){
        return super.tarifa*super.cilindraje*.12;
    }
    @Override
    public double revision(){
        return super.cilindraje*.12;
    }
    @Override
    public double impuestoEmpresa(){
        return super.tarifa*.20;
    }
    @Override
    public double impuestoUsoNoPersonal(){
        return this.espacioCajuela*.05;
    }
    @Override
    public String formulario() {

        double a = this.IR()+this.impAduana() + this.matricula() + this.impuestoEmpresa() + this.impuestoUsoNoPersonal()+this.revision();
        return "Los valores pagados del vehiculo son: " + a;
    }
}
