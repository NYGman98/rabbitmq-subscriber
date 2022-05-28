package com.rabbitmq.subscriber.listener;

import com.rabbitmq.subscriber.model.Employee;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQListener {

  @RabbitListener(queues = "${nygman98.rabbitmq.queue}")
  public void processReceivedMessage(Employee emp) {
    System.out.println("Received Message: " + emp);
  }
}
