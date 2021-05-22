package Car_Program;

public class Carro {
        private String marca;
        private String serie;
        private int modelo;
        private Motor motor;

    public Carro(String marca, String serie, int modelo, Motor motor) {
        this.marca = marca;
        this.serie = serie;
        this.modelo = modelo;
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "marca: "+marca+" serie: "+serie+" modelo: "+modelo+motor.toString();
    }
}
