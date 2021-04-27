package Clock_Program;

public class Clock {
    Hour h;
    Minute m;
    Second s;

    public Clock(int h, int m, int s) {
        this.h = new Hour(h,24);
        this.m = new Minute(m,60);
        this.s = new Second(s,60);
    }

    public void increaseSecond(int n){
        if(n<0){
            n*=-1;
        }
        s.setValue(s.getValue()+n);
    }

    public void decreaseSecond(int n){
        if(n<0){
            n*=-1;
        }
        s.setValue(s.getValue()-n);
    }

    public void increaseMinute(int n){
        if(n<0){
            n*=-1;
        }
        m.setValue(m.getValue()+n);
    }

    public void decreaseMinute(int n){
        if(n<0){
            n*=-1;
        }
        m.setValue(m.getValue()-n);
    }

    public void increaseHour(int n){
        if(n<0){
            n*=-1;
        }
        h.setValue(h.getValue()+n);
    }

    public void decreaseHour(int n){
        if(n<0){
            n*=-1;
        }
        h.setValue(h.getValue()-n);
    }

    public void fixTime(){
        do{
            if(s.getValue()>=s.getLimit()){
                s.setValue(s.getValue()-s.getLimit());
                increaseMinute(1);
            }else if(s.getValue()<0){
                s.setValue(s.getValue()+s.getLimit());
                decreaseMinute(1);
            }
        }while(s.getValue()>60 || s.getValue()<0);

        do{
            if(m.getValue()>=m.getLimit()){
                m.setValue(m.getValue()-m.getLimit());
                increaseHour(1);
            }else if(m.getValue()<0){
                m.setValue(m.getValue()+m.getLimit());
                decreaseHour(1);
            }
        }while(m.getValue()>60 || m.getValue()<0);

        do{
            if(h.getValue()>=h.getLimit()){
                h.setValue(h.getValue()-h.getLimit());
            }else if(h.getValue()<0){
                h.setValue(h.getValue()+h.getLimit());
            }
        }while(h.getValue()>h.getLimit());
    }

    public void restartTime(){
        h.setValue(0);
        m.setValue(0);
        s.setValue(0);
    }


    @Override
    public String toString() {
        fixTime();
        return h+":"+m+":"+s;
    }
}

