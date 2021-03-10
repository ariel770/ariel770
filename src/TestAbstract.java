public class TestAbstract extends TestAbstractImplentation {
    public void sayHello3() {
        System.out.println("hello from test abstract ");
    }
    @Override
    public void seyHello() {
        System.out.println("=====");
    }

    @Override
    public void seyHello1() {
        super.seyHello1();
    }
}
