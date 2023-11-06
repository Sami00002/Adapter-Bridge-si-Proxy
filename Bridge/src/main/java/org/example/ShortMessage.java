package org.example;

public class ShortMessage extends Message {
    public ShortMessage(MessageSender sender) {
        super(sender);
    }

    @Override
    public void send() {
        sender.sendMessage("This is a short message.");
    }
}