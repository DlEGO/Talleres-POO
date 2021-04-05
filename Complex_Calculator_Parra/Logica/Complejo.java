package Complex_Calculator_Parra.Logica;

import java.util.Scanner;
public class Complejo{
    private double real;
    private double imag;

    public Complejo(){
        this.real=1;
        this.imag=1;
    }

    public Complejo suma(Complejo c1){
        Complejo res=new Complejo();
        res.real=this.real+c1.real;
        res.imag=this.imag+c1.imag;
        return res;
    }

    public Complejo resta(Complejo c1){
        Complejo res=new Complejo();
        res.real=this.real-c1.real;
        res.imag=this.imag-c1.imag;
        return res;
    }

     public Complejo multiplicacion(Complejo c){
      Complejo res=new Complejo();
      res.real=this.real*c.real-this.imag*c.imag;
      res.imag=this.real*c.imag+this.imag*c.real;
      return res;
    }

     public Complejo conjugado(){
      Complejo res=new Complejo();
      res.real=this.real;
      res.imag=-this.imag;
      return res;
    }

     public Complejo division(Complejo c1){
      Complejo num,den,res=new Complejo();
      num = c1.conjugado().multiplicacion(this);
      den = c1.conjugado().multiplicacion(c1);
      res.real=num.real/den.real;
      res.imag=num.imag/den.real;
      return res;
    }
    public void leer(){
        System.out.println("ingrese la parte real seguida de la parte imaginaria");
        Scanner s = new Scanner(System.in);
        this.real=s.nextDouble();
        this.imag=s.nextDouble();
    }

    public void imprimir(){
        System.out.println(this.real+"+"+this.imag+"i");
    }
}
