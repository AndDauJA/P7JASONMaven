package lt.daujotas.Uzduotis1;

import lt.daujotas.Person;

public class Payment {
    Sender sender;
    Receiver receiver;
    public Payment() {
    }

    public Payment(Sender sender, Receiver receiver) {
        this.sender = sender;
        this.receiver = receiver;
    }

    public Sender getSender() {
        return sender;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "sender=" + sender +
                ", receiver=" + receiver +
                '}';
    }
}
