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

    public int increase(int n){
        int turns = 0;
        if(n<0){
            n*=-1;
        }
        value +=n;
        do{
        if(value>=limit){
            turns++;
            value = value-limit;
        }
        }while(value<0 || value>=limit);
//        System.out.println("turns->"+turns+"value==="+value);
        return turns;
    }

    public int decrease(int n){
        int turns = 0;
        if(n<0){
            n*=-1;
        }
//        System.out.println("value--->"+value);
        value -=n;
//        System.out.println("value==="+value);

        do{
        if(value<0){
            turns++;
            value = limit + value;
        }else if(value==0){
            turns++;
        }
        }while (value<0);
//        System.out.println("turns->"+turns);
        return turns;
    }

    public void restart(){
        value = 0;
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
