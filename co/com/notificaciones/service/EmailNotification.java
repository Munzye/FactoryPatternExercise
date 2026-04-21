package co.com.notificaciones.service;

import co.com.notificaciones.model.NotificationData;
import co.com.notificaciones.util.Validator;

public class EmailNotification implements Notification {

    private final NotificationData data;

    public EmailNotification(NotificationData data) {
        Validator.validateName(data.getRecipientName());
        Validator.validateMessage(data.getMessage());
        Validator.validateEmail(data.getEmail());
        this.data = data;
    }

    @Override
    public void send() {
        System.out.println("=== ENVÍO DE CORREO ELECTRÓNICO ===");
        System.out.println("Destinatario: " + data.getRecipientName());
        System.out.println("Correo: " + data.getEmail());
        System.out.println("Mensaje: " + data.getMessage());
        System.out.println("Correo enviado correctamente.\n");
    }
}
