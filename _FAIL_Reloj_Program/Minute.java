package _FAIL_Reloj_Program;



public class Minute{
    private int m;

    public Minute(int m) {
        do{
            if(m>=60){
                m-=60;
                Main.h++;
            }
        }while(m>60);
        this.m = m;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    @Override
    public String toString() {
        return m+"";
    }
}
