package _FAIL_Reloj_Program;

public class Hour{
    private int h;

    public Hour(int h) {
        do{
            if(h>=24){
                h-=24;
            }
        }while(h>24);
        this.h = h;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public String toString() {
        return h+"";
    }
}
