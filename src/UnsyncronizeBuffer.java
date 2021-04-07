public class UnsyncronizeBuffer implements Buffer {
    public int value = -1;

    @Override
    public int consume() throws InterruptedException {
       System.out.printf("%n Consumer read : %d %n",value);

        return value;
    }


    @Override
    public void produce(int value) throws InterruptedException {
        System.out.printf("%n Producer write : %d %n",value);
        this.value = value;

    }
}
