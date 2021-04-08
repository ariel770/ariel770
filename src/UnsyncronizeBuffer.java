import java.util.concurrent.ArrayBlockingQueue;

public class UnsyncronizeBuffer implements Buffer {
    public ArrayBlockingQueue <Integer> buffer ;

    public UnsyncronizeBuffer() {
        buffer = new ArrayBlockingQueue<>(1);
    }

    @Override
    public int consume() throws InterruptedException {
       int size = buffer.take();
        return size;
    }


    @Override
    public void produce(int records) throws InterruptedException {
        buffer.put(records);
    }
}
