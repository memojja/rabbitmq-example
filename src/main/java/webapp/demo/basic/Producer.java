//package webapp.demo.basic;
//
//
//import org.springframework.amqp.core.AmqpTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//@Component
//public class Producer {
//
//    @Autowired
//    private AmqpTemplate amqpTemplate;
//    static int count = 0;
//
//    @Value("${jsa.rabbitmq.exchange}")
//    private String exchange;
//
//    @Value("${jsa.rabbitmq.routingkey}")
//    private String routingKey;
//
//
//    @Scheduled(fixedDelay = 1)
//    public void produceMsg(){
//        count++;
//        amqpTemplate.convertAndSend(exchange, routingKey, count);
//        System.out.println("Send msg = " + count);
//    }
//}
