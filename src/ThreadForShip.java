public class ThreadForShip implements Runnable{
    private int numberThread;
    private Port port;
    private int nameDok;

    public ThreadForShip(int numberThread, Port port, int nameDok) {
        this.numberThread = numberThread;
        this.port = port;
        this.nameDok = nameDok;
    }

    public ThreadForShip() {
    }

    @Override
    public void run() {
       for (int i=0;i<10;i++) {
           port.shipUnloading(this.numberThread, this.nameDok);
           /*  try {
               Thread.sleep(500);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }*/
       }
       if(this.nameDok==1){
       port.setStartDokOne(true);
       }
        if(this.nameDok==2){
            port.setStartDokTwo(true);
        }
    }
}
