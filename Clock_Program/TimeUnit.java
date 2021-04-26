package Clock_Program;


public class TimeUnit {
    private int hour;
    private int minute;
    private int second;

    public TimeUnit(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void fixTime(){
        do{
            if(second>=60){
                second-=60;
                increaseMinute(1);
            }else if(second<0){
                second+=60;
                decreaseMinute(1);
            }
        }while(second>60 || second<0);

        do{
            if(minute>=60){
                minute-=60;
                increaseHour(1);
            }else if(minute<0){
                minute+=60;
                decreaseHour(1);
            }
        }while(minute>60 || minute<0);

        do{
            if(hour>=24){
                hour-=24;
            }else if(hour<0){
                hour+=24;
            }
        }while(hour>24);
    }

    public void increaseHour(int n){
        if(n<0){
            n*=-1;
        }
        hour += n;
    }

    public void increaseMinute(int n){
        if(n<0){
            n*=-1;
        }
        minute += n;
    }

    public void increaseSecond(int n){
        if(n<0){
            n*=-1;
        }
        second += n;
    }

    public void decreaseHour(int n){
        if(n<0){
            n*=-1;
        }
        hour -= n;
    }

    public void decreaseMinute(int n){
        if(n<0){
            n*=-1;
        }
        minute -= n;
    }

    public void decreaseSecond(int n){
        if(n<0){
            n*=-1;
        }
        second -= n;
    }


    public void showTime(){
        fixTime();
        if(hour<10){
            System.out.print("0"+hour);
        }else{
            System.out.print(hour);
        }
        if(minute<10){
            System.out.print(":0"+minute);
        }else{
            System.out.print(":"+minute);
        }
        if(second<10){
            System.out.print(":0"+second);
        }else{
            System.out.print(":"+second);
        }
        System.out.println();
    }

    public void restartTime(){
        hour = 0;
        minute = 0;
        second = 0;
    }
}
