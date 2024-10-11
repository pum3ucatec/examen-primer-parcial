public class Moto extends Vehiculo {
    public int Cilindraje;
    public String Tipo;

    public Moto(String marca, String modelo, int ano, int cilindraje, String tipo) {
        super(marca, modelo, ano);
        this.Cilindraje = cilindraje;
        this.Tipo = tipo;
    }    

    public void mostrarDatos() {
        System.out.println("Marca: " + this.Marca); 
        System.out.println("Modelo: " + this.Modelo);
        System.out.println("Año: " + this.Ano);
        System.out.println("Cilindraje: " + this.Cilindraje);
        System.out.println("Tipo: " + this.Tipo);
    }

}