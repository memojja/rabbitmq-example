package webapp.demo;

import java.util.concurrent.TimeUnit;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Runner {

    private final RabbitTemplate rabbitTemplate;
    private final Receiver receiver;
    static int count = 0;

    @Autowired
    public Runner(Receiver receiver, RabbitTemplate rabbitTemplate) {
        this.receiver = receiver;
        this.rabbitTemplate = rabbitTemplate;
    }

    @Scheduled(fixedDelay = 100)
    public void run() throws Exception {
       // System.out.println("Sending : " + (++count) );
        count++;
        rabbitTemplate.convertAndSend(DemoApplication.topicExchangeName, "jsa.routingkey1", String.valueOf(count));
    }

}