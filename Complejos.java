
public class Complejos {
    private double real;
    private double imaginario;

    public Complejos(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public double sumarComplejos(){
        return real+imaginario;
    }

    public double restarComplejos(){
      return real-imaginario;
    }

    public double multComplejos(){
        return -(real*imaginario);
    }

    public double divComplejos(){
        return real/imaginario;
    }

    public double normaComplejos(){
        return Math.sqrt(Math.pow(real,2)+(Math.pow(imaginario,2)));
    }

    public double conjucionComplejos(){
        return -(real+imaginario);
    }

}
