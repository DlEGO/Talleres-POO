package Clock_Program;


public class TimeUnit {
    private int value;
    private int limit;

    public TimeUnit(int valor, int limit) {
        this.value = valor;
        this.limit = limit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        if(value <10){
            return "0"+ value;
        }else{
            return ""+ value;
        }
    }
}
