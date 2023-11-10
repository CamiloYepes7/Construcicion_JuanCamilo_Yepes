/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.club;

import java.util.Scanner;

/**
 *
 * @author camil
 */
public class Club {

      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter member details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("ID: ");
        int id = scanner.nextInt();

        System.out.print("Enter 1 for VIP or 2 for Regular subscription: ");
        int subscriptionType = scanner.nextInt();

        // Validate subscription type
        if (subscriptionType != 1 && subscriptionType != 2) {
            System.out.println("Invalid subscription type. Exiting program.");
            System.exit(0);
        }

        // Create a member with user-input values
        Members member = new Members(id, name, 0, subscriptionType, 0, 0);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. add new member");
            System.out.println("2. Add/Remove Authorized Person");
            System.out.println("3. Manage Unpaid Bills");
            System.out.println("4. Manage Consumption");
            System.out.println("5. Increase Amount");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    member.newMember();
                    break;
                case 2:
                    member.AuthorizedPerson();
                    break;
                case 3:
                    manageUnpaidBills(member, scanner);
                    break;
                case 4:
                    manageConsumption(member, scanner);
                    break;
                case 5:
                    System.out.print("Enter the additional amount: ");
                    double additionalAmount = scanner.nextDouble();
                    member.increaseAmount(additionalAmount);
                    break;
                case 6:
                    System.out.println("Exiting program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
 
    }

    private static void manageUnpaidBills(Members member, Scanner scanner) {
        System.out.println("\nManage Unpaid Bills:");
        System.out.println("1. Generate Unpaid Bill");
        System.out.println("2. Pay Unpaid Bill");
        System.out.print("Enter your choice: ");
        int operationChoice = scanner.nextInt();

        switch (operationChoice) {
            case 1:
                member.manageUnpaidBills("generate", 0);
                break;
            case 2:
                System.out.print("Enter the bill amount to pay: ");
                double billAmount = scanner.nextDouble();
                member.manageUnpaidBills("pay", billAmount);
                break;
            default:
                System.out.println("Invalid choice. Please enter a valid option.");
        }
    }

    private static void manageConsumption(Members member, Scanner scanner) {
        System.out.println("\nManage Consumption:");
        System.out.println("1. Member Consumption");
        System.out.println("2. Authorized Person Consumption");
        System.out.print("Enter your choice: ");
        int consumerTypeChoice = scanner.nextInt();

        switch (consumerTypeChoice) {
            case 1:
                System.out.print("Enter the consumption amount for the member: ");
                double memberConsumption = scanner.nextDouble();
                member.manageConsumption("member", memberConsumption);
                break;
            case 2:
                System.out.print("Enter the consumption amount for the authorized person: ");
                double authorizedConsumption = scanner.nextDouble();
                member.manageConsumption("authorized", authorizedConsumption);
                break;
            default:
                System.out.println("Invalid choice. Please enter a valid option.");
        }
    }
}