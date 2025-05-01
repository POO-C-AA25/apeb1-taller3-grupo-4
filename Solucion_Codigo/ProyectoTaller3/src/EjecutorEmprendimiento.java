public class EjecutorEmprendimiento {
    public static Emprendimiento EmprendimientoX = new Emprendimiento();
    public static void main(String[] args) {
        String nombreEmp = null;
        int RUC = (int) ((Math.random() * 10) + 1);
        String propietario = null;
        String sector = null;
        String ubicación = null;
        String tipo = null;
        int año = 0;
        double capitalInicial = 0;
       
        EmprendimientoX.setNombreEmp(nombreEmp);
        EmprendimientoX.setPropietario(propietario);
        EmprendimientoX.setSector(sector);
        EmprendimientoX.setUbicación(ubicación);
        EmprendimientoX.setTipo(tipo);
        EmprendimientoX.setAño(año);
        EmprendimientoX.setCapitalInicial(capitalInicial);
        Emprendimiento Emprendimiento = new Emprendimiento();
        
    }
    
}

class Emprendimiento {
    public String nombreEmp;
    private int RUC;
    protected String propietario;
    public String sector;
    public String ubicación;
    public String tipo;
    public int año;
    public double capitalInicial;

        public Emprendimiento() {
    }
        
    public Emprendimiento(String nombreEmp, int RUC, String propietario, String sector, String ubicación, double capitalInicial) {
        this.nombreEmp = nombreEmp;
        this.RUC = RUC;
        this.propietario = propietario;
        this.sector = sector;
        this.ubicación = ubicación;
        this.capitalInicial = capitalInicial;
    }

    @Override
    public String toString() {
        return "Emprendimiento {" + "nombreEmp=" + nombreEmp + ", RUC=" + RUC + ", propietario=" + propietario + ", sector=" + sector + ", ubicación=" + ubicación + ", tipo=" + tipo + ", año=" + año + ", capitalInicial=" + capitalInicial + ", tamaño=" + CalcularTamaño(capitalInicial) + '}';
    }

    public String getNombreEmp() {
        return nombreEmp;
    }

    public void setNombreEmp(String nombreEmp) {
        this.nombreEmp = nombreEmp;
    }

    public int getRUC() {
        return RUC;
    }

    public void setRUC(int RUC) {
        this.RUC = RUC;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getUbicación() {
        return ubicación;
    }

    public void setUbicación(String ubicación) {
        this.ubicación = ubicación;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int firstYear) {
        this.año = firstYear;
    }

    public double getCapitalInicial() {
        return capitalInicial;
    }

    public void setCapitalInicial(double capitalInicial) {
        this.capitalInicial = capitalInicial;
    }
    public void ActualizarInformación(){
    
    }
    public int CalcularAntiguedad(){
        int añoActual = 2025;
        return añoActual - año;
    }
    public String CalcularTamaño(double capitalInicial){
        String tamaño;
        if (capitalInicial > 1000)
            tamaño = "grande";
        else
            if (capitalInicial > 500)
                tamaño = "mediano";
            else
                tamaño = "pequeño";
        return tamaño;
    }
}