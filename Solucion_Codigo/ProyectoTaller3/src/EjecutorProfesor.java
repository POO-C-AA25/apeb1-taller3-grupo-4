
public class EjecutorProfesor {
    public static void main(String[] args) {
        Profesor profesorX = new Profesor(
                "Juan",
                "Gonzales",
                450.0,
                "1950161703"
        );
        profesorX.calcularSueldoTotal();
        System.out.println(profesorX);
    }
}
class Profesor{
    public String nombre;
    public String apellido;
    public double sueldoBasico;
    public String cedula;
    public double sueldoTotal;
    public Profesor(){}
    public Profesor(String nombre, String apellido, double sueldoBasico, String cedula){
        this.nombre = nombre;
        this.apellido= apellido;
        this.sueldoBasico = sueldoBasico;
        this.cedula = cedula;
    }
    public void calcularSueldoTotal(){
        this.sueldoTotal = sueldoBasico + (sueldoBasico * 0.20);
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }
    public String getCedula(){
        return this.cedula;
    }
    public double getSueldoTotal(){
        return this.sueldoTotal;
    }
    public String toString(){
        return String.format("Nombre: %s\nApellido: %s\nSueldo Basico: %s\nCedula: %s\nSueldo Total: %s\n", this.nombre, this.apellido, this.sueldoBasico, this.cedula, this.sueldoTotal);
    }
}