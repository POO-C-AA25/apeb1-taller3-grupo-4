public class EjecutorAutomotor {
    public static Automotor AutomotorX = new Automotor();    
    public static void main(String[] args) {
        int cédula = (int) ((Math.random() * 10) + 1);
        String marcaVehicular = null;
        int año = (int) ((Math.random() * 10) + 1);
        int valorVehículo = (int) ((Math.random() * 10) + 1);
        int valorMatrícula = (int) ((Math.random() * 10) + 1);
        AutomotorX.setCédula(cédula);
        AutomotorX.setMarca(marcaVehicular);
        AutomotorX.setAño(año);
        AutomotorX.setValorVehículo(valorVehículo);
        AutomotorX.setValorMatrícula(valorMatrícula);
        Automotor Automotor = new Automotor();
        Automotor.CalcularValorMatrícula(valorVehículo, valorMatrícula, año);
        Automotor.ValorFinal(valorVehículo, valorMatrícula);
        System.out.println("Automotor: " + Automotor.toString());
    }
}
        class Automotor {
             int cédula = (int) ((Math.random() * 10) + 1);
             String marcaVehicular = null;
             int año = (int) ((Math.random() * 10) + 1);
             int valorVehículo = (int) ((Math.random() * 10) + 1);
             int valorMatrícula = (int) ((Math.random() * 10) + 1);
            public Automotor(){}
            public Automotor(int cédula, String marcaVehicular, int año, int valorVehículo, int valorMatrícula) {
                this.cédula = cédula;
                this.marcaVehicular = marcaVehicular;
                this.año = año;
            }
                public void setCédula(int cédula){
                this.cédula = cédula;
                }
                public void setMarca(String marcaVehicular){
                this.marcaVehicular = marcaVehicular;
                }
                public void setAño(int año){
                this.año = año;
                }
                public void setValorVehículo(int valorVehículo){
                this.valorVehículo = valorVehículo;
                }
                public void setValorMatrícula(int valorMatrícula){
                this.valorMatrícula = valorMatrícula;
                }
                 public int getCédula(){
                    return this.cédula;
                }
                public String getMarca(){
                    return this.marcaVehicular;
                }
                public int getAño(){
                return this.año;
                }
                public int getValorVehículo(){
                    return this.valorVehículo;
                }
                public int getValorMatrícula(){
                    return this.valorMatrícula;
                }
                public int CalcularValorMatrícula(int valorVehículo, int valorMatrícula, int año){
                    valorMatrícula = (int) ((valorVehículo * 0.002) * (2025 - año));
                    return valorMatrícula;
                }
                public double ValorFinal(int valorVehículo, int valorMatrícula){
                    double valorFinal = valorVehículo + valorMatrícula;
                    return valorFinal;
                } 
         @Override
            public String toString() {
                return "Automotor{" + "c\u00e9dula=" + cédula + ", marcaVehicular=" + marcaVehicular + ", a\u00f1o=" + año + ", valorVeh\u00edculo=" + valorVehículo + ", valorMatr\u00edcula=" + valorMatrícula + '}';
            }    
        }
