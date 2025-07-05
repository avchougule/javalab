package basic;
import java.util.Random;

// Base class
class Medicine {
    String companyName = "MediLife Pharma";
    String address = "123, Health Park, Mumbai";

    public void displayLabel() {
        System.out.println("Company: " + companyName);
        System.out.println("Address: " + address);
    }
}

// Subclass: Tablet
class Tablet extends Medicine {
    @Override
    public void displayLabel() {
        super.displayLabel();
        System.out.println("Medicine Type: Tablet");
        System.out.println("Note: Store in a cool dry place.\n");
    }
}

// Subclass: Syrup
class Syrup extends Medicine {
    @Override
    public void displayLabel() {
        super.displayLabel();
        System.out.println("Medicine Type: Syrup");
        System.out.println("Note: Shake well before use.\n");
    }
}

// Subclass: Ointment
class Ointment extends Medicine {
    @Override
    public void displayLabel() {
        super.displayLabel();
        System.out.println("Medicine Type: Ointment");
        System.out.println("Note: For external use only.\n");
    }
}

// Test class
public class Basic1 {
    public static void main(String[] args) {
        Medicine[] meds = new Medicine[10];
        Random rand = new Random();

        // Create random medicine objects
        for (int i = 0; i < meds.length; i++) {
            int type = rand.nextInt(3) + 1; // 1 to 3
            switch (type) {
                case 1:
                    meds[i] = new Tablet();
                    break;
                case 2:
                    meds[i] = new Syrup();
                    break;
                case 3:
                    meds[i] = new Ointment();
                    break;
            }
        }

        // Polymorphic behavior
        System.out.println("---- Medicine Labels ----\n");
        for (int i = 0; i < meds.length; i++) {
            System.out.println("Index " + i + ":");
            meds[i].displayLabel(); // Polymorphic call
        }
    }
}
