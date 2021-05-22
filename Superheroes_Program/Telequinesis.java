package Superheroes_Program;

public interface Telequinesis {
    String hacerFlotar();
    String lanzar();
    String empujar();
    String destrozar();

    abstract class abs_Telequinesis implements Telequinesis{

        protected String nombre;

        public abs_Telequinesis() {
            nombre = null;
        }

        public abs_Telequinesis(String nombre) {
            this.nombre = nombre;
        }

        @Override
        public abstract String hacerFlotar();

        @Override
        public abstract String lanzar();

        @Override
        public abstract String empujar();

        @Override
        public abstract String destrozar();
    }
}
