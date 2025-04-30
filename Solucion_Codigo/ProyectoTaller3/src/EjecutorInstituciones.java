public class EjecutorInstituciones {
    public static Instituciones institucionesX = new Instituciones();    
    public static void main(String[] args) {
        String nombre = null;
        String tipo = null;
        short numAlumnos = (Math.random() * 10) + 1;
        short numDocentes = (Math.random() * 10) + 1;
        short numSedes = (Math.random() * 10) + 1;
        short gastosXest = (Math.random() * 10) + 1;
        short presupuesto = (Math.random() * 10) + 1;
        InstitucionesX.setnumAlumnos(numAlumnos);
        InstitucionesX.setnumDocentes(numDocentes);
        InstitucionesX.setSedes(numSedes);
        InstitucionesX.calcularGastos();
        InstitucionesX.calcularPresupuesto();
        Instituciones Institución = new Instituciones();
        Institución.calcularGastos();
        Institución.calcularPresupuesto();
        System.out.println("Institución: " + Institución.toString());
    }
}
        class Instituciones {
            public short numAlumnos;
            public short numDocentes;
            public short numSedes;
            public short gastosXest;
            public short presupuesto;
            public Instituciones(){}
            public Instituciones(short numAlumnos, short numDocentes, short numSedes){
                this.numAlumnos = numAlumnos;
                this.numDocentes = numDocentes;
                this.numSedes = numSedes;
            }
                public void setnumAlumnos(short numAlumnos){
                this.numAlumnos = numAlumnos;
                }
                public void setnumDocentes(short numDocentes){
                this.numDocentes = numDocentes;
                }
                public void setValor(short numSedes){
                this.numSedes = numSedes;
                }
                 public short getnumAlumnos(){
                    return this.numAlumnos;
                }
                public short getnumDocentes(){
                    return this.numDocentes;
                }
                public short getSedes(){
                return this.numSedes;
    
                public double getGastos(){
                    return this.área;
                }
                public double getPresupuesto(){
                    return this.presupuesto;
                }
                public void calcularGastos(){
                this.gastosXest = this.numAlumnos * this.numSedes;
                }
                public void calcularPresupuesto(){
                this.presupuesto = 
                }
                public String toString(){
                return "{Cant. Alumnos: " + this.getnumAlumnos() + ", "  +
                            "Cant. Docentes: " + this.getnumDocentes() + ", " +
                            "Cant. Sedes: " + this.getSedes() + ", " +
                            "Gastos por estudiante:  " + this.getGastos() + ", " +
                            "Presupuesto: " + this.getPresupuesto() + "}";
                }
        }
