public class LetsGo {

    public LetsGo() {

    }

    public static void main(String[] args) {
        double conditionMessi = 0.5;
        double conditionAndres = 0.8;
        double conditionLionel = 1;

        RunForYourLife lionel = new RunForYourLife("Lionel", conditionLionel);
        RunForYourLife andres = new RunForYourLife("Andres", conditionAndres);
        RunForYourLife messi = new RunForYourLife("Messi", conditionMessi);

        lionel.start();
        andres.start();
        messi.start();
    }

    public static int getRandomNumber(){
        //Random Number 100-500 ms
        return (int)(Math.random() * (400 + 1)) + 100;
    }
}
