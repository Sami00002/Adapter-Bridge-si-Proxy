package org.example;

public class Main {
    public static void main(String[] args) {
        MessageSender smsSender = new SMSSender();
        MessageSender emailSender = new EmailSender();

        Message shortSMS = new ShortMessage(smsSender);
        Message longEmail = new LongMessage(emailSender);

        shortSMS.send(); 
        longEmail.send(); 
    }
}
