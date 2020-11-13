public class Port {
    private int streamNumber;
    private String infoAboutInDok="";
    private boolean startDokOne;
    private boolean startDokTwo;

    public Port(int streamNumber, String infoAboutInDok, boolean startDokOne, boolean isStartDokTwo) {
        this.streamNumber = streamNumber;
        this.infoAboutInDok = "";
        this.startDokOne = startDokOne;
        this.startDokTwo = isStartDokTwo;
    }

    public Port() {
    }

    public int getStreamNumber() {
        
        return streamNumber;
    }

    public void setStreamNumber(int streamNumber) {
        
        this.streamNumber = streamNumber;
    }

    public String getInfoAboutInDok() {
        
        return infoAboutInDok;
    }

    public void setInfoAboutInDok(String infoAboutInDok) {
        
        this.infoAboutInDok = infoAboutInDok;
    }

    public boolean isStartDokOne() {
        
        return startDokOne;
    }

    public void setStartDokOne(boolean startDokOne) {
        
        this.startDokOne = startDokOne;
    }

    public boolean isStartDokTwo() {
        
        return startDokTwo;
    }

    public void setStartDokTwo(boolean startDokTwo) {
        
        startDokTwo = startDokTwo;
    }

    public synchronized void shipUnloading(int streamNumber, int numberDok) {
        for (; streamNumber == 3 && startDokOne == false && startDokOne == false; ) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        infoAboutInDok = infoAboutInDok + " " + streamNumber + "Ship" + " " + numberDok + "Dok"+"\n";
        notifyAll();
    }
}