public class Main {
    // USER STORIES:
    // IMPLEMENTED 1. As a security staff, I want to record visitor name information, so that I can address people by their name
    // IMPLEMENTED 2. As a security staff, I want to record visitor ID number information, so that I can keep track of people
    // IMPLEMENTED 3. As a security staff, I want to record visitor access category information, so that I can restrict access to rooms
    // IMPLEMENTED 4. As a security staff, I want to see a badge-style summary for each person, so that I can see all information together
    // IMPLEMENTED 5. As a management staff, I want to see who issued the ID badge, so that I can keep employees accountable

    public static void main(String[] args) {
        Badge visitor1 = new Badge();
        visitor1.badgeInput();
        visitor1.printSummary();

        // Basic access checks:
        if (visitor1.hasAccess(1)) {
            System.out.println("Entered door 1");
        } else {
            System.out.println("Cannot enter door 1");
        }

        if (visitor1.hasAccess(2)) {
            System.out.println("Entered door 2");
        } else {
            System.out.println("Cannot enter door 2");
        }

        if (visitor1.hasAccess(3)) {
            System.out.println("Accessed door 3");
        } else {
            System.out.println("Cannot enter door 3");
        }
    }
}
