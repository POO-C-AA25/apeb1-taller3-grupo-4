
import java.util.Random;
public class EjecutorCheque {
    public static Cheque chequeX = new Cheque();
    public static void main(String[] args) {
        Random random = new Random();
        String cliente, bancos;
        double valor;
        String [] clientesnombres = {"Jose", "Ana", "Matias", "Alberto", "Luis"};
        String[] nombreBancos = {"Banco Pichincha", "Banco Loja", "Banco Guayaquil", "Produbanco"};
        cliente = clientesnombres[random.nextInt(clientesnombres.length)];
        bancos = nombreBancos[random.nextInt(nombreBancos.length)];
        valor = 100 + random.nextInt(10000); 
        chequeX.setNombreCliente(cliente);
        chequeX.setNombreBanco(bancos);
        chequeX.setValorCheque(valor);
        chequeX.calcularComisionBanco();
        System.out.println("ChequeX: " + chequeX.toString());
    }
}
class Cheque{
    public String nombreCliente;
    public String nombreBanco;
    public double valorCheque;
    public double comisionBanco;
    public Cheque(){}
    public Cheque(String nombreCliente, String nombreBanco, double valorCheque){
        this.nombreCliente = nombreCliente;
        this.nombreBanco = nombreBanco;
        this.valorCheque = valorCheque;
    }
    public void calcularComisionBanco(){
        this.comisionBanco = valorCheque * 0.00003;
    }
    public void setNombreCliente(String nombreCliente){
        this.nombreCliente = nombreCliente;
    }
    public String getNombreCliente(){
        return this.nombreCliente;
    }
    public void setNombreBanco(String nombreBanco){
        this.nombreBanco = nombreBanco;
    }
    public String getNombreBanco(){
        return this.nombreBanco;
    }
    public void setValorCheque(double valorCheque){
        this.valorCheque= valorCheque;
    }
    public double getValorCheque(){
        return this.valorCheque;
    }
    public double getComisionCheque(){
        return this.comisionBanco;
    }
    public String toString(){
        return String.format("Nombre del cliente: %s\nNombre del banco: %s\nValor del cheque: %s\nComision del banco: %s\n", this.nombreCliente, this.nombreBanco, this.valorCheque, this.comisionBanco);
    }
}