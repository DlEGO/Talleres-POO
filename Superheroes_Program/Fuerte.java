package Superheroes_Program;

public interface Fuerte {

    String levantar();
    String defenderse();
    String saltar();
    String atacar();

    abstract class abs_Fuerte implements Fuerte{

        protected String nombre;

        public abs_Fuerte() {
            nombre = null;
        }

        public abs_Fuerte(String nombre) {
            this.nombre = nombre;
        }

        public abstract String levantar();

        public abstract String defenderse();

        public abstract String saltar();

        public abstract String atacar();
    }
}




