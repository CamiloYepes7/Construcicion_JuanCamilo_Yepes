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

        System.out.print("ID: ");
        String id = scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.println("Select subscription type:");
        System.out.println("1. VIP");
        System.out.println("2. Regular");

        String subscriptionType;
        int selection = Integer.parseInt(scanner.nextLine());

        switch (selection) {
            case 1:
                subscriptionType = "VIP";
                break;
            case 2:
                subscriptionType = "Regular";
                break;
            default:
                System.out.println("Invalid option, assigning Regular subscription by default.");
                subscriptionType = "Regular";
                break;
        }

        double availableFunds;

        // Determine available funds based on the subscription type
        if (subscriptionType.equals("VIP")) {
            availableFunds = 5000000;
        } else {
            availableFunds = 1000000;
        }

        // Create a Member object with the user-input data
        Members member = new Members(id, name, availableFunds, subscriptionType, 0, 0);

        int option;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Register Member");
            System.out.println("2. Manage Authorized People");
            System.out.println("3. Pay Invoice");
            System.out.println("4. Manage Unpaid Invoices");
            System.out.println("5. Manage Consumption");
            System.out.println("6. Increase Funds");
            System.out.println("7. Exit");
            System.out.print("Enter the desired option: ");

            option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1:
                    member.registerMember();
                    break;
                case 2:
                    System.out.print("Operation (add/remove): ");
                    String operation = scanner.nextLine();
                    System.out.print("Name of Authorized Person: ");
                    String personName = scanner.nextLine();
                    member.manageAuthorizedPeople(operation, personName);
                    break;
                case 3:
                    System.out.print("Amount of Invoice to Pay: ");
                    double invoiceAmount = Double.parseDouble(scanner.nextLine());
                    member.payInvoice(invoiceAmount);
                    break;
                case 4:
                    System.out.print("Operation (generate/pay): ");
                    String invoiceOperation = scanner.nextLine();
                    if (invoiceOperation.equals("generate")) {
                        member.manageUnpaidInvoices(invoiceOperation, 0); // No amount needed for generation
                    } else {
                        System.out.print("Amount of Invoice to Pay: ");
                        double amountToPay = Double.parseDouble(scanner.nextLine());
                        member.manageUnpaidInvoices(invoiceOperation, (int) amountToPay);
                    }
                    break;
                case 5:
                    System.out.print("Consumer Type (member/authorized): ");
                    String consumerType = scanner.nextLine();
                    System.out.print("Consumption Amount: ");
                    double consumptionAmount = Double.parseDouble(scanner.nextLine());
                    member.manageConsumption(consumerType, consumptionAmount);
                    break;
                case 6:
                    System.out.print("Amount to Increase Funds: ");
                    double increaseAmount = Double.parseDouble(scanner.nextLine());
                    member.increaseFunds(increaseAmount);
                    break;
                case 7:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }

        } while (option != 7);

    }
}
    