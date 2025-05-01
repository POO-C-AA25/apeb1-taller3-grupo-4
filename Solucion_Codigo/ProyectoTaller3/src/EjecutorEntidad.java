public class EjecutorEntidad {
    public static Entidad EntidadX = new Entidad();    
    public static void main(String[] args) {
        String nomEstudiante = null;
        double calificación1 = (Math.random() * 10) + 1;
        double calificación2 = (Math.random() * 10) + 1;
        double calificación3 = (Math.random() * 10) + 1;
        double promedio = 0;
        String estado = null;
        EntidadX.setNombre(nomEstudiante);
        EntidadX.setCalificación1(calificación1);
        EntidadX.setCalificación2(calificación2);
        EntidadX.setCalificación3(calificación3);
        EntidadX.setPromedio(promedio);
        EntidadX.setEstado(estado);
        Entidad Entidad = new Entidad();
        Entidad.Aprobó();
        System.out.println("Entidad: " + Entidad.toString());
    }
}
        class Entidad {
             String nomEstudiante = null;
             double calificación1 = (Math.random() * 10) + 1;
             double calificación2 = (Math.random() * 10) + 1;
             double calificación3 = (Math.random() * 10) + 1;
             double promedio = 0;
             String estado = null;
            public Entidad(){}
            public Entidad(String nomEstudiante, double calificación1, double calificación2, double calificación3, double promedio, String estado) {
                this.calificación1 = calificación1;
                this.calificación2 = calificación2;
                this.calificación3 = calificación3;
            }
                public void setCalificación1(double calificación1){
                this.calificación1 = calificación1;
                }
                public void setCalificación2(double calificación2){
                this.calificación2 = calificación2;
                }
                public void setCalificación3(double calificación3){
                this.calificación3 = calificación3;
                }
                public void setPromedio(double calificación2){
                this.calificación2 = calificación2;
                }
                public void setEstado(String estado){
                this.estado = estado;
                }
                public void setNombre(String nomEstudiante){
                this.nomEstudiante = nomEstudiante;
                }
                 public double getCalificación1(){
                    return this.calificación1;
                }
                public double getCalificación2(){
                    return this.calificación2;
                }
                public double getCalificación3(){
                return this.calificación3;
                }
                public double getPromedio(){
                    return this.promedio;
                }
                public String getEstado(){
                    return this.estado;
                }

                public String getNombre(){
                    return this.nomEstudiante;
                }

                public double CalcularProm(double calificación1, double calificación2, double calificación3){
                promedio = (calificación1 + calificación2 + calificación3) / 3;
                return promedio;
                } 
               public void Aprobó(){
                if (this.getPromedio() > 6.5)
                        this.estado = "Aprobado";
                    else
                        this.estado = "Reprobado";
                }
             @Override
                public String toString(){
                return "{Nombre: " + this.getNombre() + ", " +
                            "Calificación 1" + this.getCalificación1() + ", "  +
                            "Calificación 2: " + this.getCalificación2() + ", " +
                            "Calificación 3: " + this.getCalificación3() + ", " +
                            "Promedio:  " + this.CalcularProm(this.calificación1, this.calificación2, this.calificación3) + ", " +
                            "Estado: " + this.estado + "}";
                }
        }
