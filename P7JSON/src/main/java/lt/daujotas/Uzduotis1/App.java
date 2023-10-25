package lt.daujotas.Uzduotis1;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class App {



    public static void main(String[] args) throws IOException {

        final Sender sendPayment = new Sender("Jonas", "Jonaitis", 36);
        final Receiver receivePaiment = new Receiver("Kestas", "Kestutis", 65);
                final Payment payment=new Payment(sendPayment,receivePaiment);

        File paymentInfoFile = new File("paiment.json");
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(paymentInfoFile, payment);
        final Payment senderDeserialisation = objectMapper.readValue(paymentInfoFile, Payment.class);
        System.out.println(senderDeserialisation);
    }
public void Faker(){
        Faker();
}
}
