
import java.util.Scanner;
public class EjecutorEquivalenteHora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       int horas;
        System.out.print("Ingrese el numero de horas: ");
        horas = teclado.nextInt();
        EquivalenteHora equivalencia = new EquivalenteHora(horas);
        System.out.println(equivalencia);
    }
}
class EquivalenteHora{
    public int horas;
    public int minutos;
    public int segundos;
    public int dias;
    public EquivalenteHora(){}
    public EquivalenteHora(int horas){
        this.horas = horas;
        this.minutos = horas *60;
        this.segundos = horas *3600;
        this.dias = horas / 24;
    }
    public String toString(){
        return String.format("Horas: %d\nMinutos: %d\nSegundos: %d\nDias: %d", horas, minutos, segundos, dias);
    }
}