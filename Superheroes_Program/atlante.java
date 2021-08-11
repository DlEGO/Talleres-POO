package Superheroes_Program;

public class atlante implements Acuatico{

    private String nombre;

    public atlante() {
        nombre = "atlante";
    }

    public atlante(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String sumergirse() {
        return nombre+" da un clavado y se sumerge bajo el agua";
    }

    @Override
    public String nadar() {
        return nombre+" sin mover los brazos o las piernas, se desplaza como si fuera una bala a traves del agua";
    }

    @Override
    public String crearTorbellino() {
        return nombre+" con utiliza su arma y crea torbellinos de agua a voluntad";
    }

    @Override
    public String llamarCriaturasMarinas() {
        return nombre+" usa sus habilidades telepaticcas para llamar a las criaturas del oceano";
    }
}
