public class RunForYourLife implements Runnable {
    private String threadName;
    private int checkpoint;
    private Thread thread;
    private double condition;

    public RunForYourLife(String name, double condition){
        threadName = name;
        this.condition = condition;
        this.checkpoint = 1;

    }

    public void run(){
        //Start Running
        System.out.println(threadName + ", go!");

        while(getCheckpoint() <= 20){
            //Delay Running
            try {
                Thread.sleep((int) Math.round(LetsGo.getRandomNumber()*condition));
            } catch (InterruptedException e) {
                System.out.println(getThreadname() + " interrupted.");
            }
            System.out.println(getThreadname() + " has passed checkpoint " +  getCheckpoint());
            setCheckpoint(checkpoint);
        }

        //Finished Running
        System.out.println(threadName + " has finished!");
    }

    public void start() {
        if (thread == null) {
            //Creating the Thread
            System.out.println(threadName + ", ready.");
            thread = new Thread(this, threadName);
            //Starting the Thread
            System.out.println(threadName + ", set...");
            thread.start();
        }
    }

    public String getThreadname(){
        return threadName;
    }

    public int getCheckpoint() {
        return checkpoint;
    }

    public void setName(String name){
        this.threadName=name;
    }

    public void setCheckpoint(int checkpoint){
        this.checkpoint=checkpoint;
        this.checkpoint++;
    }
}
