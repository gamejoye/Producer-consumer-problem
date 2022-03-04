package one;

public class prothread extends Thread{
    private Resource r;

    public prothread(Resource r){
        this.r = r;
    }

    public void run(){
        try{
            while(true){
                r.product();
                Thread.sleep(2000);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
