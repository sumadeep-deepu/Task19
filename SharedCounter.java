class Counter {
    int count=0;
    public synchronized void increment(){
        count++;
        System.out.println("Counter : "+count);

    }
}

class IncrementRun implements Runnable{
Counter cnt;
public IncrementRun(Counter cnt){
    this.cnt=cnt;
}
    public void run(){
        for(int i=0;i<5;i++){
            cnt.increment();
        }

    }

}

public class SharedCounter {

    public static void main(String[] args) {

        Counter sh=new Counter();

        int numOfThreads=3;

        for(int i=1;i<=numOfThreads;i++){  
        IncrementRun iR=new IncrementRun(sh);
        Thread incThread=new Thread(iR);
            incThread.start();

        }
       
    }
    
}
