package Clock_Program;

public class Clock {
    private Hour h;
    private Minute m;
    private Second s;

    public Clock(int h, int m, int s) {
        this.h = new Hour(h,24);
        this.m = new Minute(m,60);
        this.s = new Second(s,60);
        fixTime();
    }

    public void increaseSecond(int n){
//        int aux = 0;
//        aux=s.increase(n);
//        System.out.println(aux);
//        aux = m.increase(aux);
//        System.out.println(aux);
//        aux = h.increase(aux);
//        System.out.println(aux);
        h.increase(m.increase(s.increase(n)));
    }

    public void decreaseSecond(int n){
        h.decrease(m.decrease(s.decrease(n)));
    }

    public void increaseMinute(int n){
        h.increase(m.increase(n));
    }

    public void decreaseMinute(int n){
        h.decrease(m.decrease(n));
    }

    public void increaseHour(int n){
        h.increase(n);
    }

    public void decreaseHour(int n){
        h.decrease(n);
    }

    public void restartTime(){
        h.restart();
        m.restart();
        s.restart();
    }

    public void fixTime(){
        increaseSecond(0);
        increaseMinute(0);
        increaseHour(0);
    }



    @Override
    public String toString() {
        return h+":"+m+":"+s;
    }


}

