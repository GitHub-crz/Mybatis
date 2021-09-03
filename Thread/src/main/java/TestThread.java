import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class TestThread {
    public void test(){
        Thread1 T1=new Thread1();
        T1.start();
        for (int i = 0; i < 500; i++) {
            System.out.println("主线程正在进行");
        }
    }
    void testdownload(){
        webdownload down1=new webdownload("https://img.iplaysoft.com/wp-content/uploads/2019/free-images/free_stock_photo.jpg","1.jpg");
        webdownload down2=new webdownload("https://img.iplaysoft.com/wp-content/uploads/2019/free-images/free_stock_photo.jpg","2.jpg");
        webdownload down3=new webdownload("https://img.iplaysoft.com/wp-content/uploads/2019/free-images/free_stock_photo.jpg","3.jpg");
        down1.start();
        down2.start();
        down3.start();
    }
}
class Thread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("副线程正在进行");
        }

    }
}
class webdownload extends Thread{
    private String url;
    private String filename;
    public webdownload(String urls,String filenames){
        this.url=urls;
        this.filename=filenames;
    }
    @Override

    public void run(){
        try {
            FileUtils.copyURLToFile(new URL(url),new File(filename));
            System.out.println("成功下载"+filename);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("下载失败");
        }

    }
}
