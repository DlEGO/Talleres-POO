
public class Complejo {
    private double real;
    private double imaginario;

    public Complejo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }


    public static double sumarReal(Complejo complejo1,Complejo complejo2){
        return complejo1.real+complejo2.real;
    }

    public static double sumarImaginaria(Complejo complejo1,Complejo complejo2){
        return complejo1.imaginario+complejo2.imaginario;
    }

    public static String mostrarSuma(Complejo complejo,Complejo complejo2){
        complejo = new Complejo(sumarReal(complejo,complejo2),sumarImaginaria(complejo,complejo2));
        return mostrarComplejo(complejo);
    }

    public static double restaReal(Complejo complejo1,Complejo complejo2){
        complejo2.real*=-1;
        return complejo1.real+complejo2.real;
    }

    public static double restaImaginaria(Complejo complejo1,Complejo complejo2){
        complejo2.imaginario*=-1;
        return complejo1.imaginario+complejo2.imaginario;
    }

    public static String mostrarResta(Complejo complejo,Complejo complejo2){
        complejo = new Complejo(restaReal(complejo,complejo2),restaImaginaria(complejo,complejo2));
        return mostrarComplejo(complejo);
    }


    public static double multiplicacionReal(Complejo complejo1, Complejo complejo2){
        return -((complejo1.real*complejo2.real)-(complejo1.imaginario*complejo2.imaginario));
    }

    public static double multiplicacionImaginaria(Complejo complejo1,Complejo complejo2){
        return -((complejo1.real*complejo2.imaginario)+(complejo1.imaginario*complejo2.real));
    }

    public static String mostrarMultiplicacion(Complejo complejo,Complejo complejo2){
        complejo = new Complejo(multiplicacionReal(complejo, complejo2), multiplicacionImaginaria(complejo,complejo2));
        return mostrarComplejo(complejo);
    }

    public static double divisionReal(Complejo complejo1,Complejo complejo2){
        return (((complejo1.real*complejo2.real)+(complejo1.imaginario*complejo2.imaginario))/(Math.pow(complejo2.real,2)+(Math.pow(complejo2.imaginario,2))));
    }

    public static double divisionImaginaria(Complejo complejo1,Complejo complejo2){
        return (((complejo1.imaginario*complejo2.real)-(complejo1.real*complejo2.imaginario))/(Math.pow(complejo2.real,2)+(Math.pow(complejo2.imaginario,2))));
    }

    

    public double normaComplejos(){
        return Math.sqrt(Math.pow(real,2)+(Math.pow(imaginario,2)));
    }

    public double conjucionComplejos(){
        return -(real+imaginario);
    }

    public static String mostrarComplejo(Complejo complejo){
        String datosComplejo = "";
        if(complejo.imaginario < 0){
            complejo.imaginario*=-1;
            datosComplejo = complejo.real+" - "+complejo.imaginario+"i";
        }else if(complejo.imaginario > 0){
            datosComplejo = complejo.real+" + "+complejo.imaginario+"i";
        }else{
            datosComplejo = complejo.real+"";
        }
        return datosComplejo;
    }

}
