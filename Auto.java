
public class Auto extends Vehiculo {
    public int NumeroPuertas;
    public Boolean EsAutomatico;

    public Auto(String marca, String modelo, int ano, int numeroPuertas, Boolean esAutomatico) {
        super(marca, modelo, ano);

        this.NumeroPuertas = numeroPuertas;
        this.EsAutomatico = esAutomatico;
    }

    public void mostrarDatos() {
        System.out.println("Marca: " + this.Marca); // Asumiendo que 'marca' está en la clase padre
        System.out.println("Modelo: " + this.Modelo); // Asumiendo que 'modelo' está en la clase padre
        System.out.println("Año: " + this.Ano); // Asumiendo que 'ano' está en la clase padre
        System.out.println("Número de Puertas: " + this.NumeroPuertas);
        System.out.println("¿Es Automático?: " + this.EsAutomatico);
    }

}