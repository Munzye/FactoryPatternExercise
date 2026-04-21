package co.com.notificaciones.util;

import java.util.regex.Pattern;

public class Validator {

    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");

    //En formator +57 de 10 dígitos, escalable si se hubiera necesitado
    private static final Pattern COLOMBIA_PHONE_PATTERN =
            Pattern.compile("^\\+57\\d{10}$");

    private static final Pattern WHATSAPP_GROUP_LINK_PATTERN =
            Pattern.compile("^(https?://)?chat\\.whatsapp\\.com/[A-Za-z0-9]+$");

    private Validator() {
    }

    public static void validateName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del destinatario es obligatorio.");
        }
    }

    public static void validateMessage(String message) {
        if (message == null || message.trim().isEmpty()) {
            throw new IllegalArgumentException("El mensaje es obligatorio.");
        }
    }

    public static void validateEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("El correo electrónico es obligatorio.");
        }
        if (!EMAIL_PATTERN.matcher(email).matches()) {
            throw new IllegalArgumentException("El correo electrónico no tiene un formato válido.");
        }
    }

    public static void validateColombiaPhone(String phone) {
        if (phone == null || phone.trim().isEmpty()) {
            throw new IllegalArgumentException("El número de celular es obligatorio.");
        }
        if (!COLOMBIA_PHONE_PATTERN.matcher(phone).matches()) {
            throw new IllegalArgumentException(
                "El número debe tener formato colombiano +57 seguido de 10 dígitos. Ejemplo: +573001234567"
            );
        }
    }

    public static void validateWhatsappGroupLink(String link) {
        if (link == null || link.trim().isEmpty()) {
            throw new IllegalArgumentException("Si es un grupo de WhatsApp, el link del grupo es obligatorio.");
        }
        if (!WHATSAPP_GROUP_LINK_PATTERN.matcher(link).matches()) {
            throw new IllegalArgumentException(
                "El link del grupo de WhatsApp no es válido. Ejemplo: https://chat.whatsapp.com/ABC123xyz"
            );
        }
    }
}
