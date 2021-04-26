package _FAIL_Reloj_Program;

public class Second{

    private int s;

    public Second(int s) {
        do{
            if(s>=60){
                s-=60;
                Main.m++;
            }
        }while(s>60);
        this.s = s;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return s+"";
    }
}
