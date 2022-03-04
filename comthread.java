package one;

public class comthread extends Thread{
    private Resource r;

    public comthread(Resource r){
        this.r = r;
    }

    public void run() {
        try{
            while(true){
                r.consume();
                Thread.sleep(2000);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
