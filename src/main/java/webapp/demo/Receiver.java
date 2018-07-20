package webapp.demo;

import org.springframework.stereotype.Component;

@Component
public class Receiver  {

    public void onMessage(String message) throws InterruptedException {
        System.out.println("Received <" + message + ">");
        Thread.sleep(5000);
    }
}