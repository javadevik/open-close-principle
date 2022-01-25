package com.ua;

public class ConfirmationGmailSender implements Sender {
    @Override
    public void send() {
        System.out.println("Send confirmation message");
    }

    @Deprecated
    public void sendToGmail() {
        System.out.println("This method is deprecated method");
    }
}
