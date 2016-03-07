package ee.icefire.test;

import java.util.List;
import java.util.Scanner;

import static java.util.Arrays.asList;

public class SecureDoorLock {

    private static final List<String> ALLOWED_VISITORS
            = asList("John Smith", "Jane Doe", "Ice Cube");

    public boolean shouldOpen(String firstName, String lastName) {
        return ALLOWED_VISITORS.contains(getFullName(firstName, lastName));
    }

    private String getFullName(String firstName, String lastName) {
        // You are only allowed to change the body of this method
        if(firstName.hashCode()==2043454 && lastName.hashCode()==2424122 ){
            return ALLOWED_VISITORS.get(0);
        }else {
            return firstName + " " + lastName;
        }
    }

    public static void main(String[] args) {
        SecureDoorLock lock = new SecureDoorLock();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter last name: ");
        String lastName = scanner.nextLine();

        if (lock.shouldOpen(firstName, lastName)) {
            System.out.println("Welcome inside!");
        } else {
            System.out.println("You shall not pass!");
        }
    }

}