public interface Buffer {
    public int consume ()throws InterruptedException;
    public  void produce (int value)throws InterruptedException;
}
