import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Badge {
    private String name;
    private String ID;
    private int accessCategory;

    private String nameOfBadgeIssuer;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getAccessCategory() {
        return accessCategory;
    }

    public void setAccessCategory(int accessCategory) {
        if (accessCategory != 1 || accessCategory != 2 || accessCategory != 3) {
            accessCategory = 3; // Default to visitor;
        }

        this.accessCategory = accessCategory;
    }

    public String getNameOfBadgeIssuer() {
        return nameOfBadgeIssuer;
    }

    public void setNameOfBadgeIssuer(String name) {
        this.nameOfBadgeIssuer = name;
    }

    public void badgeInput() {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        try {
            System.out.print("Enter name: ");
            setName(bufferedReader.readLine());

            System.out.print("Enter ID number: ");
            setID(bufferedReader.readLine());

            System.out.print("Enter access type (1: Staff, 2: Student, 3: Visitor): ");
            setAccessCategory(Integer.parseInt(bufferedReader.readLine()));

            System.out.print("Enter name of person issuing badge: ");
            setNameOfBadgeIssuer(bufferedReader.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean hasAccess(int doorAccessLevel) {
        // Need more information about access levels, for now just a simple equality check
        return getAccessCategory() == doorAccessLevel;
    }

    public void printSummary() {
        System.out.println("===============");
        System.out.println("ID Badge:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + ID);
        System.out.println("Access Category: " + accessCategory);
        System.out.println("Issued By: " + nameOfBadgeIssuer);
        System.out.println("===============");
    }
}
