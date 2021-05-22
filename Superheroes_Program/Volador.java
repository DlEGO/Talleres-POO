package Superheroes_Program;

public interface Volador {
    String despegar();
    String volar();
    String aterrizar();
    String levitar();

    abstract class abs_Volador implements Volador {

        protected String nombre;

        public abs_Volador() {
            nombre = null;
        }

        public abs_Volador(String nombre) {
            this.nombre = nombre;
        }

        public abstract String despegar();

        public abstract String volar();

        public abstract String aterrizar();

        public abstract String levitar();
    }
}
