public class ArrayWriter implements Runnable {

    private int startValue;
    private SimpleArrayThread simpleArrayThread;

    public ArrayWriter(int startValue, SimpleArrayThread simpleArrayThread) {
        this.simpleArrayThread = simpleArrayThread;
        this.startValue = startValue;

    }


    @Override
    public void run() {
      for (int count = startValue ; count < startValue+3 ;count++ ){
          simpleArrayThread.add(count);
      }
    }
}
