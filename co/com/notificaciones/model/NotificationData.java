package co.com.notificaciones.model;

public class NotificationData {

    private String recipientName;
    private String email;
    private String phoneNumber;
    private String message;
    private boolean whatsappGroup;
    private String whatsappGroupLink;

    public NotificationData() {
    }

    public NotificationData(String recipientName, String email, String phoneNumber, String message,
                            boolean whatsappGroup, String whatsappGroupLink) {
        this.recipientName = recipientName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.message = message;
        this.whatsappGroup = whatsappGroup;
        this.whatsappGroupLink = whatsappGroupLink;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isWhatsappGroup() {
        return whatsappGroup;
    }

    public void setWhatsappGroup(boolean whatsappGroup) {
        this.whatsappGroup = whatsappGroup;
    }

    public String getWhatsappGroupLink() {
        return whatsappGroupLink;
    }

    public void setWhatsappGroupLink(String whatsappGroupLink) {
        this.whatsappGroupLink = whatsappGroupLink;
    }
}
