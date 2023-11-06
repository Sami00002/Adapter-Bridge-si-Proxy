package org.example;

// LongMessage.java (Concrete Abstraction)
public class LongMessage extends Message {
    public LongMessage(MessageSender sender) {
        super(sender);
    }

    @Override
    public void send() {
        sender.sendMessage("This is a long message that might be split into multiple parts.");
    }
}