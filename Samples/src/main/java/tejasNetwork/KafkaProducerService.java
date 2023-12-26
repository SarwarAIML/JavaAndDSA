/*
package org.example.tejasNetwork;



@Service
public class KafkaProducerService {

    @Value("${kafka.topic}")
    private String topic;

    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaProducerService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message) {
        kafkaTemplate.send(topic, message);
        System.out.println("Produced message: " + message);
    }
}


*/
