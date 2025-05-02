
public class AppointmentBook {
    private boolean[][] schedule;

    public AppointmentBook(boolean[][] schedule)
    {
        this.schedule = schedule;
    }


    private boolean isMinuteFree(int period, int minute) 
       { 
        return schedule[period-1][minute];
       }
    
    public void printPeriod(int period)
    {
        for(int i = 0; i< schedule[period -1].length; i++)
        System.out.println(i+" "+schedule[period-1][i]);
    }


    private void reserveBlock(int period, int startMinute, int duration) {
        int end = startMinute+duration; 

        for(int x=startMinute; x<end; x++) schedule[period-1][x] = false;
    }

    public int findFreeBlock(int period, int duration) 
       {
        int block = 0;
        for(int x=0; x<60; x++)
        {
            if(isMinuteFree(period, x)) 
            {block++;
            if(block == duration) return x-duration+1; }

            else block = 0;
        }
            return -1;

       }


    public boolean makeAppointment(int startPeriod, int endPeriod, int duration){
    {
        int freeblock = 0;
        for(int i = startPeriod; i<=endPeriod; i++) 
        {
        freeblock = findFreeBlock(i, duration);
        if(freeblock != -1)
          {
                reserveBlock(i, freeblock, duration);
               return true;
          }
        }
return false;
    }
    }

    public void Clear(boolean[][] ds)
    {
        for(int i = 0; i<8; i++){
            for(int s = 0; s<60; s++){
                    ds[i][s] = false;
            
        }
    }
    }
}