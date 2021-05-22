package Superheroes_Program;

public interface Velocidad {
    String correr();
    String vortice();
    String camaraLenta();
    String sobreAgua();

    abstract class abs_Velocidad implements Velocidad{

        protected String nombre;

        public abs_Velocidad() {
            nombre = null;
        }

        public abs_Velocidad(String nombre) {
            this.nombre = nombre;
        }

        @Override
        abstract public String correr();

        @Override
        abstract public String vortice();

        @Override
        abstract public String camaraLenta();

        @Override
        abstract public String sobreAgua();
    }
}
