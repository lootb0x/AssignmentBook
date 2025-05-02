public class Main{
public static void main(String[] args){
    boolean[][] Schedule = new boolean[8][60];
    AppointmentBook a = new AppointmentBook(Schedule);
   
    
    for(int i =0; i<25; i++)Schedule[1][i]=true;
    System.out.println(a.findFreeBlock(2, 25));
    a.Clear(Schedule);
    for(int i =25; i<30; i++)Schedule[1][i]=true;
    System.out.println(a.findFreeBlock(2,5));
    a.Clear(Schedule);
    for(int i =30; i<60; i++) Schedule[1][i]=true;
    System.out.println(a.findFreeBlock(2, 30));
    a.Clear(Schedule);
    for(int i =0; i<15; i++) Schedule[2][i]=true;
    System.out.println(a.findFreeBlock(3, 15));
    a.Clear(Schedule);
    for(int i =15; i<41; i++) Schedule[2][i]=true;
    System.out.println(a.findFreeBlock(3, 26));
    a.Clear(Schedule);
    for(int i =41; i<60; i++) Schedule[2][i]=true;
    System.out.println(a.findFreeBlock(3, 19));
    a.Clear(Schedule);
    for(int i =0; i<5; i++) Schedule[3][i]=true;
    System.out.println(a.findFreeBlock(4, 5));
    a.Clear(Schedule);
    for(int i =5; i<30; i++) Schedule[3][i]=true;
    System.out.println(a.findFreeBlock(4, 25));
    a.Clear(Schedule);
    for(int i =30; i<44; i++) Schedule[3][i]=true;
    System.out.println(a.findFreeBlock(4, 14));
    a.Clear(Schedule);
    for(int i =44; i<60; i++) Schedule[3][i]=true;
    System.out.println(a.findFreeBlock(4, 16));
    a.Clear(Schedule);
    
    AppointmentBook b = new AppointmentBook(Schedule);
    for(int x=13; x<36; x++) Schedule[3][ x] = true;
    b.printPeriod(4);
    System.out.println(b.makeAppointment(2, 4, 22));
    b.printPeriod(4);
}
}