package one;

public class Resource{
    int[] arr = new int[10];
    int count=0;
    
    public synchronized void product() throws Exception{
       if(count==arr.length){
           wait();
       }else{
           arr[count] = (int)Math.floor(Math.random()*10+1);
           count++;
           System.out.println("生产:"+arr[count-1]);
           notify();
       }
    }

    public synchronized void consume() throws Exception{
        if(count==0){
            wait();
        }else{
            int m=arr[count-1];
            count--;
            System.out.println("取出:"+m);
            notify();
        }
    }
}
