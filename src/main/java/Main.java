
public final class Main {
    synchronized void main() {

    }

    public synchronized final static void main(String[] args) {
        System.out.println("he;;p");
        System.runFinalization();
        Main x = new Main();
        try {
            x.finalize();
            System.out.println("finalized");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

}
