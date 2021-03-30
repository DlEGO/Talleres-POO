
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
        double negReal = -complejo2.real;
        return complejo1.real+negReal;
    }

    public static double restaImaginaria(Complejo complejo1,Complejo complejo2){
        double negImaginario = -complejo2.imaginario;
        return complejo1.imaginario+negImaginario;
    }

    public static String mostrarResta(Complejo complejo,Complejo complejo2){
        complejo = new Complejo(restaReal(complejo,complejo2),restaImaginaria(complejo,complejo2));
        return mostrarComplejo(complejo);
    }

        public static double multiplicacionReal(Complejo complejo1, Complejo complejo2){
        return (complejo1.real*complejo2.real)-(complejo1.imaginario*complejo2.imaginario);
    }

    public static double multiplicacionImaginaria(Complejo complejo1,Complejo complejo2){
        return (complejo1.real*complejo2.imaginario)+(complejo1.imaginario*complejo2.real);
    }

    public static String mostrarMultiplicacion(Complejo complejo,Complejo complejo2){
        complejo = new Complejo(multiplicacionReal(complejo, complejo2), multiplicacionImaginaria(complejo,complejo2));
        return mostrarComplejo(complejo);
    }

    public static double divisionReal(Complejo complejo1,Complejo complejo2){
        double numerador = ((complejo1.real*complejo2.real)+(complejo1.imaginario*complejo2.imaginario));
        double denominador = (Math.pow(complejo2.real,2)+(Math.pow(complejo2.imaginario,2)));
        return numerador/denominador;
    }

    public static double divisionImaginaria(Complejo complejo1,Complejo complejo2){
        return ((complejo1.imaginario*complejo2.real)-(complejo1.real*complejo2.imaginario))/(Math.pow(complejo2.real,2)+(Math.pow(complejo2.imaginario,2)));
    }

    public static String mostrarDivision(Complejo complejo,Complejo complejo2){
        complejo = new Complejo(divisionReal(complejo, complejo2), divisionImaginaria(complejo,complejo2));
        return mostrarComplejo(complejo);
    }

    public static double normaComplejos(Complejo complejo){
        return Math.sqrt(Math.pow(complejo.real,2)+(Math.pow(complejo.imaginario,2)));
    }


    public static double conjuncionReal(Complejo complejo1, Complejo complejo2){
      return sumarReal(complejo1,complejo2);
    }

    public static double conjucionesImaginaria(Complejo complejo1, Complejo complejo2){
        double negImaginario1 =- complejo1.imaginario;
        double negImaginario2 =- complejo2.imaginario;
        return negImaginario1+negImaginario2;
    }

    public static String mostrarConjucion(Complejo complejo,Complejo complejo2){
        complejo = new Complejo(conjuncionReal(complejo, complejo2), conjucionesImaginaria(complejo,complejo2));
        return mostrarComplejo(complejo);
    }

    public static String mostrarComplejo(Complejo complejo){
        String datosComplejo = "";
        if(complejo.imaginario < 0){
            datosComplejo = complejo.real+""+complejo.imaginario+"i";
        }else if(complejo.imaginario > 0){
            datosComplejo = complejo.real+" + "+complejo.imaginario+"i";
        }else{
            datosComplejo = complejo.real+"";
        }
        return datosComplejo;
    }
}
