public class EjecutorTerreno {
    public static Terreno terrenoX = new Terreno();    
    public static void main(String[] args) {
        double ancho = (Math.random() * 10) + 1;
        double largo = (Math.random() * 10) + 1;
        double valor = (Math.random() * 10) + 1;
        terrenoX.setAncho(ancho);
        terrenoX.setLargo(largo);
        terrenoX.setValor(valor);
        terrenoX.calcularÁrea();
        terrenoX.calcularCosto();
        System.out.println("Forma larga");
        System.out.println("terrenoX: " + terrenoX.toString());
        System.out.println("Forma Eficiente");
        Terreno miTerreno = new Terreno(3, 4, 2);
        miTerreno.calcularÁrea();
        miTerreno.calcularCosto();
        System.out.println("Mi Terreno: " + miTerreno.toString());
    }
}
        class Terreno {
            public double ancho;
            public double largo;
            public double valor;
            public double costo;
            public double área;
            public Terreno(){}
            public Terreno(double ancho, double largo, double valor){
                this.ancho = ancho;
                this.largo = largo;
                this.valor = valor;
            }
                public void setAncho(double ancho){
                this.ancho = ancho;
                }
                public void setLargo(double largo){
                this.largo = largo;
                }
                public void setValor(double valor){
                this.valor = valor;
                }
                public double getAncho(){
                    return ancho;
                }
                public double getLargo(){
                    return this.largo;
                }
                public double getValor(){
                    return this.valor;
                }
                public double getÁrea(){
                    return this.área;
                }
                public double getCosto(){
                    return this.costo;
                }
                public void calcularÁrea(){
                this.área = this.ancho * this.largo;
                }
                public void calcularCosto(){
                this.costo = this.área * this.valor;
                }
                public String toString(){
                return "{Ancho: " + this.getAncho() + ", "  +
                            "Largo: " + this.getLargo() + ", " +
                            "Valor: " + this.getValor() + ", " +
                            "Área:  " + this.getÁrea() + ", " +
                            "Costo: " + this.getCosto() + "}";
                }
        }
