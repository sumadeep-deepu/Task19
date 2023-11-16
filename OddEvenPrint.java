class OddThread extends Thread{
    @Override
    public void  run(){
        for(int i=1;i<=19;i+=2){
            System.out.println("Odd Thread : "+i);
        }

    }
}

class EvenThread extends Thread{
    @Override
    public void run(){
        for(int i=2;i<=20;i+=2){
            System.out.println("Even Thread : "+i);
        }

    }
}

public class OddEvenPrint {

    public static void main(String[] args) throws Exception{
        EvenThread et=new EvenThread();
        OddThread ot=new OddThread();

        et.start();
        ot.start();
    }

    
}
