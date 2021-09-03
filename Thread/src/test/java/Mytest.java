import org.junit.Test;

public class Mytest {
    @Test
    public void TestThread1(){
        TestThread T=new TestThread();
        T.test();
    }
    @Test
    public void testdownlaod(){
        TestThread T=new TestThread();
        T.testdownload();
    }
}
