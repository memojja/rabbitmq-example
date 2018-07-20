//package webapp.demo.basic;
//
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//
//@Component
//public class Consumer {
//
//    @RabbitListener(queues = "jsa.queue")
//    public void recievedMessage(String message){
//        System.out.println(message);
//    }
//
//}
