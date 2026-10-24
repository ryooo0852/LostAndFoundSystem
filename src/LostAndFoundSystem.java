
import java.util.Scanner;

public class LostAndFoundSystem {

    static Scanner scanner = new Scanner(System.in);

    // Lost item information
    static String lostName = "";
    static String lostCollege = "";
    static String lostProgram = "";
    static String lostItem = "";
    static String lostMarks = "";
    static String lostPlace = "";
    static String lostLocation = "";
    static String lostFloor = "";
    static String lostRoom = "";
    static String lostTime = "";
    static String lostContact = "";
    static String lostFacebook = "";
    static String lostFacebookLink = "";
    static String lostOtherContact = "";
    static String lostStatus = "NO REPORT";

    // Found item information
    static String founderName = "";
    static String founderCollege = "";
    static String founderProgram = "";
    static String foundItem = "";
    static String foundMarks = "";
    static String identifyOwner = "";
    static String foundPlace = "";
    static String founderLocation = "";
    static String founderFloor = "";
    static String founderRoom = "";
    static String founderTime = "";
    static String founderContact = "";
    static String founderFacebook = "";
    static String founderFacebookLink = "";
    static String founderOtherContact = "";
    static String foundStatus = "NO REPORT";

    // Claim request information
    static String claimantName = "";
    static String claimantContact = "";
    static String claimDetails = "";
    static String claimStatus = "NO CLAIM REQUEST";

    public static void chooseOption(int choice) {

        switch (choice) {

            case 1:
                reportItemLost();
                break;

            case 2:
                reportItemFound();
                break;

            case 3:
                claimItem();
                break;

            case 4:
                seeItemStatus();
                break;

            case 5:
                viewSocialMediaPagesOfOrgs();
                break;

            case 6:
                exitSystem();
                break;

            default:
                System.out.println(
                    "Invalid choice. Please enter a number from 1 to 6."
                );
        }
    }

    public static void reportItemLost() {

        System.out.println("\n===== REPORT A LOST ITEM =====");
        System.out.println("Enter N/A for details that do not apply.");
        System.out.println("====================================");

        System.out.print("Name: ");
        lostName = scanner.nextLine();

        System.out.print("College: ");
        lostCollege = scanner.nextLine();

        System.out.print("Program and Section: ");
        lostProgram = scanner.nextLine();

        System.out.print("Item lost: ");
        lostItem = scanner.nextLine();

        System.out.print("Distinguishing marks or features: ");
        lostMarks = scanner.nextLine();

        System.out.print("Places you visited before losing it: ");
        lostPlace = scanner.nextLine();

        System.out.println("\nWhere can we usually find you?");
        System.out.print("Building or location (N/A if not applicable): ");
        lostLocation = scanner.nextLine();

        lostFloor = "N/A";
        lostRoom = "N/A";
        lostTime = "N/A";

        if (!lostLocation.equalsIgnoreCase("N/A")
                && !lostLocation.equalsIgnoreCase("NA")) {

            System.out.print("Floor: ");
            lostFloor = scanner.nextLine();

            System.out.print("Room: ");
            lostRoom = scanner.nextLine();

            System.out.print("Available hours: ");
            lostTime = scanner.nextLine();
        }

        System.out.println("\n===== CONTACT DETAILS =====");

        System.out.print("Contact number: ");
        lostContact = scanner.nextLine();

        System.out.print("Facebook account name: ");
        lostFacebook = scanner.nextLine();

        System.out.print("Facebook account link: ");
        lostFacebookLink = scanner.nextLine();

        System.out.print("Other contact details: ");
        lostOtherContact = scanner.nextLine();

        lostStatus = "LOST - WAITING FOR A MATCH";

        System.out.println("\nLost item report recorded!");
        System.out.println("Item: " + lostItem);
        System.out.println("Status: " + lostStatus);
        System.out.println("Please keep your contact details updated.");
    }

    public static void reportItemFound() {

        System.out.println("\n===== REPORT A FOUND ITEM =====");
        System.out.println("Enter N/A for details that do not apply.");
        System.out.println("====================================");

        System.out.print("Your name: ");
        founderName = scanner.nextLine();

        System.out.print("College: ");
        founderCollege = scanner.nextLine();

        System.out.print("Program and Section: ");
        founderProgram = scanner.nextLine();

        System.out.print("Item found: ");
        foundItem = scanner.nextLine();

        System.out.print("Distinguishing marks or features: ");
        foundMarks = scanner.nextLine();

        System.out.print("Details that may identify the owner: ");
        identifyOwner = scanner.nextLine();

        System.out.print("Where did you find the item? ");
        foundPlace = scanner.nextLine();

        System.out.println("\nWhere can the owner find you?");
        System.out.print("Building or location (N/A if not applicable): ");
        founderLocation = scanner.nextLine();

        founderFloor = "N/A";
        founderRoom = "N/A";
        founderTime = "N/A";

        if (!founderLocation.equalsIgnoreCase("N/A")
                && !founderLocation.equalsIgnoreCase("NA")) {

            System.out.print("Floor: ");
            founderFloor = scanner.nextLine();

            System.out.print("Room: ");
            founderRoom = scanner.nextLine();

            System.out.print("Available hours: ");
            founderTime = scanner.nextLine();
        }

        System.out.println("\n===== CONTACT DETAILS =====");

        System.out.print("Contact number: ");
        founderContact = scanner.nextLine();

        System.out.print("Facebook account name: ");
        founderFacebook = scanner.nextLine();

        System.out.print("Facebook account link: ");
        founderFacebookLink = scanner.nextLine();

        System.out.print("Other contact details: ");
        founderOtherContact = scanner.nextLine();

        foundStatus = "FOUND - WAITING FOR OWNER";
        claimStatus = "NO CLAIM REQUEST";

        System.out.println("\nFound item report recorded!");
        System.out.println("Item: " + foundItem);
        System.out.println("Status: " + foundStatus);
        System.out.println("Thank you for helping return someone's belongings.");
    }

    public static void claimItem() {

        System.out.println("\n===== CLAIM AN ITEM =====");

        if (foundStatus.equals("NO REPORT")) {
            System.out.println("No found item has been reported yet.");
            return;
        }

        if (foundStatus.equals("CLAIM REQUESTED")) {
            System.out.println("A claim request already exists.");
            System.out.println("Status: " + claimStatus);
            return;
        }

        if (foundStatus.equals("CLAIMED")) {
            System.out.println("This item has already been marked as claimed.");
            return;
        }

        System.out.println("Item reported found: " + foundItem);
        System.out.println("Place found: " + foundPlace);
        System.out.println("Distinguishing marks: " + foundMarks);

        System.out.print("\nIs this the item you are claiming? (yes/no): ");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("yes")) {

            System.out.print("Your full name: ");
            claimantName = scanner.nextLine();

            System.out.print("Your contact number: ");
            claimantContact = scanner.nextLine();

            System.out.print(
                "Describe details that can prove ownership: "
            );
            claimDetails = scanner.nextLine();

            foundStatus = "CLAIM REQUESTED";
            claimStatus = "WAITING FOR STAFF VERIFICATION";

            System.out.println("\nClaim request submitted!");
            System.out.println("Claimant: " + claimantName);
            System.out.println("Item: " + foundItem);
            System.out.println("Status: " + claimStatus);
            System.out.println(
                "Please coordinate with the University Student Council."
            );

        } else if (answer.equalsIgnoreCase("no")) {

            System.out.println("Claim cancelled.");

        } else {

            System.out.println("Invalid answer. Please enter yes or no.");
        }
    }

    public static void seeItemStatus() {

        System.out.println("\n===== CHECK ITEM STATUS =====");

        System.out.println("\n--- Lost Item Report ---");

        if (lostStatus.equals("NO REPORT")) {

            System.out.println("No lost item report available.");

        } else {

            System.out.println("Item: " + lostItem);
            System.out.println("Reported by: " + lostName);
            System.out.println("Last known location: " + lostPlace);
            System.out.println("Status: " + lostStatus);
        }

        System.out.println("\n--- Found Item Report ---");

        if (foundStatus.equals("NO REPORT")) {

            System.out.println("No found item report available.");

        } else {

            System.out.println("Item: " + foundItem);
            System.out.println("Found at: " + foundPlace);
            System.out.println("Reported by: " + founderName);
            System.out.println("Status: " + foundStatus);
        }

        System.out.println("\n--- Claim Request ---");

        if (claimStatus.equals("NO CLAIM REQUEST")) {

            System.out.println("No claim request submitted.");

        } else {

            System.out.println("Claimant: " + claimantName);
            System.out.println("Contact: " + claimantContact);
            System.out.println("Claim details: " + claimDetails);
            System.out.println("Status: " + claimStatus);
        }

        // Compare the reported lost and found item names.
        if (!lostStatus.equals("NO REPORT")
                && !foundStatus.equals("NO REPORT")) {

            if (lostItem.equalsIgnoreCase(foundItem)) {

                System.out.println(
                    "\nPossible match: The lost and found item names match."
                );
                System.out.println(
                    "The details must still be checked by authorized staff."
                );

            } else {

                System.out.println(
                    "\nNo match based on item names alone."
                );
            }
        }
    }

    public static void viewSocialMediaPagesOfOrgs() {

        System.out.println("\n===== CAMPUS ORGANIZATIONS =====");
        System.out.println("University Student Council (USC)");
        System.out.println("Facebook: Check the official university page.");
        System.out.println();
        System.out.println("College Student Councils");
        System.out.println("Check the official page of your college.");
        System.out.println();
        System.out.println(
            "Note: Replace these instructions with verified official links."
        );
    }

    public static void exitSystem() {

        System.out.println("\nThank you for using");
        System.out.println("Bulacan State University's Lost and Found System!");
        System.out.println("Have a great day!");
    }

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n=================================================");
            System.out.println(
                "Welcome to Bulacan State University's Lost and Found!"
            );
            System.out.println("=================================================");
            System.out.println("1. Report a Lost Item");
            System.out.println("2. Report a Found Item");
            System.out.println("3. Claim an Item");
            System.out.println("4. Check Item Status");
            System.out.println("5. Campus Organizations");
            System.out.println("6. Exit");
            System.out.println("=================================================");
            System.out.print("Choose an option (1-6): ");

            choice = scanner.nextInt();
            scanner.nextLine();

            chooseOption(choice);

        } while (choice != 6);

        scanner.close();
    }
}
