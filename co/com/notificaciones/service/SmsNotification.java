package co.com.notificaciones.service;

import co.com.notificaciones.model.NotificationData;
import co.com.notificaciones.util.Validator;

public class SmsNotification implements Notification {

    private final NotificationData data;

    public SmsNotification(NotificationData data) {
        Validator.validateName(data.getRecipientName());
        Validator.validateMessage(data.getMessage());
        Validator.validateColombiaPhone(data.getPhoneNumber());
        this.data = data;
    }

    @Override
    public void send() {
        System.out.println("=== ENVÍO DE SMS ===");
        System.out.println("Destinatario: " + data.getRecipientName());
        System.out.println("Celular: " + data.getPhoneNumber());
        System.out.println("Mensaje: " + data.getMessage());
        System.out.println("SMS enviado correctamente.\n");
    }
}
