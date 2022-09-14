package alquiler;

public class AppAlquiler {

    public static void main(String[] args) {

        //Vehiculo vh1 = new Vehiculo("matricula","marca","color","modelo",100.5, true, 150);
        //System.out.println(vh1.toString()); // la sobreescritura de una funcion mantieniento su nombre y propiedades para que haga lo que necesito univocamente se le llama Polimorfismo.

        //System.out.println(vh1.valorDesgaste(120.5));

        Cliente cl1 = new Cliente("1234567995","Juanito","02365987458");
        System.out.println(cl1.toString());

        Sedan sd1 = new Sedan("matricula","marca","color",100.5, true, 150,1500);
        System.out.println(sd1.toString());
        sd1.setMarca("Mazda");
        System.out.println(sd1.toString());

        Vehiculo sd2 = new Sedan(); // es lo mismo que escribir Sedan sd2 = new Sedan();

        //Sedan sd3 = new Vehiculo(); Ejemplo de conversion descendente, no funciona



        //Alquiler reg1 = new Alquiler(cl1,vh1,5,100, 0);
        //reg1.setSeguro();
        //System.out.println(reg1.toString());

        Alquiler reg2 = new Alquiler(cl1,sd1, 20, 10, 150);
        reg2.setSeguro();
        System.out.println(reg2.toString());

        Vehiculo suv1 = new SUV("xxx-000","Gato","Gris",120.5,true,158,1500,"4x2");
        System.out.println(suv1.maxKms());

        Vehiculo suv2 = new SUV("xxx-000","Gato","Gris",120.5,true,158,1500,"4x4");
        System.out.println(suv2.maxKms());
        System.out.println(sd1.formulario());
        Vehiculo furgo1 = new Furgoneta("xxx-000","Chevrolet","Azul",100,true,30,20,8,4);
        furgo1.valorDesgaste(300);
        System.out.println(furgo1.retornarPrecio());



    }


}
