import java.lang.reflect.Array;
import java.util.Arrays;

class SortThread extends Thread{
    private int[] array;
    private int start;
    private int end;

    public SortThread(int[] array ,int start,int end){
        this.array=array;
        this.start=start;
        this.end=end;

    }


    public void run(){
        Arrays.sort(array,start,end);
    }

    private static void merge(int[] array,int start,int mid,int end ){
        
    }


 }


public class SortingArrayMultiThreading {
    public static void main(String[] args) {
        int [] array={1,5,6,7,11,2,4,8,3};

        int numberOfThreads=3;

        int chunkSize=array.length/numberOfThreads;

        Thread[] thread=new Thread[numberOfThreads];

        for(int i=0;i<=numberOfThreads;i++){
            int start=i*chunkSize;
            int end=(i==numberOfThreads-1)?array.length:start+chunkSize;
            thread[i]= new SortThread(array,start,end);
            thread[i].start();
        }




    }
    
}
