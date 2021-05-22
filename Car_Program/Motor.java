package Car_Program;

public class Motor {
    private int rpm;
    private int cilindraje;
    private String tipo;

    public Motor(int rpm, int cilindraje, String tipo) {
        this.rpm = rpm;
        this.cilindraje = cilindraje;
        this.tipo = tipo;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "\nrpm: "+rpm+" cilindraje: "+cilindraje+" tipo: "+tipo;
    }
}
