package class24;

public abstract class Phone { // So no one can create an object of this class
    //Create a phone class lets create abstract methods like displayPictures
    //unlockPhone
    //SendText
    // 2 child classes IPhone, Samsung, Google and provide specific implementation
    // Lets write code to achieve runtime polymorphism
   abstract void unlockPhone();
   abstract void SendText();
   abstract void displayPictures();
}
class IPhone extends Phone{
    @Override
    void unlockPhone() {
        System.out.println("Face ID to unlock the Phone");
    }

    @Override
    void SendText() {
        System.out.println("Lets use the IMessage to send the text");
    }

    @Override
    void displayPictures() {
        System.out.println("Iphotos to browse the pictures");
    }
}
class Samsung extends Phone {
    @Override
    void unlockPhone() {
        System.out.println("Using fingerPrint sensor camera");
    }

    @Override
    void SendText() {
        System.out.println("Message app to send the message");
    }

    @Override
    void displayPictures() {
        System.out.println("Gallery app ");
    }
}