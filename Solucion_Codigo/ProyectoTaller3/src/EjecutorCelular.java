
public class EjecutorCelular {
    public static void main(String[] args) {
       EquipoCelular celularX = new EquipoCelular(
                "Android 13",
                6.7,
                450.00,
                12.0,
                "00:1B:44:11:3A:B7",
                "123456789012345"
        );
       celularX.calcularCostoFinal();
        System.out.println(celularX);
    }
}
class EquipoCelular{
    public String sistemaOperativo;
    public double tamañoPantalla;
    public double costoInicial;
    public double ivaPorcentaje;
    public double costoFinal;
    public String direccionMac;
    public String informacionImei;
    public EquipoCelular(){}
    public EquipoCelular(String sistemaOperativo, double tamañoPantalla, double costoIncial, double ivaPorcentaje, String direccionMac, String informacionImei){
        this.sistemaOperativo = sistemaOperativo;
        this.tamañoPantalla = tamañoPantalla;
        this.costoInicial = costoIncial;
        this.ivaPorcentaje = ivaPorcentaje;
        this.direccionMac = direccionMac;
        this.informacionImei = informacionImei;
    }
    public void calcularCostoFinal(){
        double iva;
        iva = (ivaPorcentaje / 100) * costoInicial;
        costoFinal = iva + costoInicial;
    }
    
    public String toString(){
        return String.format("Sistema Operativo: %s\nTamaño Pantalla: %s\nCosto Inicial: %s\nIva Porcentaje: %s\nCosto Final: %s\nDireccion Mac: %s\n Informacion Imei: %s\n", 
                sistemaOperativo, tamañoPantalla, costoInicial, ivaPorcentaje, costoFinal, direccionMac, informacionImei);
    }
}