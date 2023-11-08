/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.club;

import java.util.Scanner;

/**
 *
 * @author camil
 */
public class Members {
      private static void add(Members newMember) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private String ID;
    private String name;
    private double availableFunds;
    private int subscriptionType;
    private int unpaidBills;
    private int authorizedPeopleCount; 

    public Members(String ID, String name, double availableFunds, String subscriptionType, int unpaidBills, int authorizedPeopleCount) {
        this.ID = ID;
        this.name = name;
        this.availableFunds = availableFunds;
        this.availableFunds = (subscriptionType.equals("VIP")) ? 5000000 : 1000000;
        this.unpaidBills = 0;
        this.authorizedPeopleCount = 0;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public double getAvailableFunds() {
        return availableFunds;
    }

    public int getSubscriptionType() {
        return subscriptionType;
    }

    public int getUnpaidBills() {
        return unpaidBills;
    }

    public int getAuthorizedPeopleCount() {
        return authorizedPeopleCount;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAvailableFunds(double availableFunds) {
        this.availableFunds = availableFunds;
    }

    public void setSubscriptionType(int subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public void setUnpaidBills(int unpaidBills) {
        this.unpaidBills = unpaidBills;
    }

    public void setAuthorizedPeopleCount(int authorizedPeopleCount) {
        this.authorizedPeopleCount = authorizedPeopleCount;
    }

    public void enrollMember() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the new member's details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("ID: ");
        String ID = scanner.nextLine();

        String subscriptionType;
        do {
            System.out.print("Subscription Type (VIP or Regular): ");
            subscriptionType = scanner.nextLine().toUpperCase();
        } while (!subscriptionType.equals("VIP") && !subscriptionType.equals("REGULAR"));

        double availableFunds = (subscriptionType.equals("VIP")) ? 5000000 : 1000000;

        Members newMember = new Members(ID, name, availableFunds, subscriptionType, 0, 0);

        Members.add(newMember);
        System.out.println("User creation successful:");
        System.out.println("Name: " + newMember.getName());
        System.out.println("ID: " + newMember.getID());
        System.out.println("Subscription type: " + newMember.getSubscriptionType());
    }

    public void increaseFunds(double increasedAmount) {
        double maxAmount = (this.subscriptionType == 1) ? 5000000 : 1000000;

        if ((this.availableFunds + increasedAmount) <= maxAmount) {
            this.availableFunds += increasedAmount;
            System.out.println("Funds increased: " + increasedAmount);
        } else {
            System.out.println("The entered amount exceeds the permitted limit.");
        }
    }

    public void manageAuthorizedPeople(String operation, String personName) {
        switch (operation) {
            case "add":
                if (authorizedPeopleCount >= 10) {
                    System.out.println("Cannot add more authorized people. The limit of 10 has been reached.");
                    return;
                }

                this.authorizedPeopleCount++;
                System.out.println("Authorized person registered: " + personName);
                break;

            case "remove":
                if (authorizedPeopleCount == 0) {
                    System.out.println("No authorized people to remove.");
                    return;
                }

                this.authorizedPeopleCount--;
                System.out.println("Authorized person removed: " + personName);
                break;

            default:
                System.out.println("Invalid operation to manage authorized people.");
        }
    }

    public void payBill(double billAmount) {
        if (this.unpaidBills == 0) {
            System.out.println("No pending bills to pay.");
            return;
        }

        if (this.availableFunds < billAmount) {
            System.out.println("Insufficient funds to pay the bill.");
            return;
        }

        this.availableFunds -= billAmount;
        this.unpaidBills--;
        System.out.println("Bill paid. Remaining funds: " + this.availableFunds);
    }

    public void manageUnpaidBills(String operation, double billAmount) {
        switch (operation) {
            case "generate":
                if (this.unpaidBills < 20) {
                    this.unpaidBills++;
                    System.out.println("Bill generated.");
                } else {
                    System.out.println("Maximum limit of unpaid bills reached.");
                }
                break;

            case "pay":
                if (this.unpaidBills == 0) {
                    System.out.println("No pending bills to pay.");
                    return;
                }

                if (this.availableFunds >= billAmount) {
                    this.availableFunds -= billAmount;
                    this.unpaidBills--;
                    System.out.println("Bill paid. Remaining funds: " + this.availableFunds);
                } else {
                    System.out.println("Insufficient funds to pay the bill.");
                }
                break;

            default:
                System.out.println("Invalid operation to manage unpaid bills.");
        }
    }

    public void manageConsumption(String consumerType, double consumptionAmount) {
        switch (consumerType) {
            case "member":
                if (this.availableFunds >= consumptionAmount) {
                    this.availableFunds -= consumptionAmount;
                    System.out.println("Consumption recorded by the member: " + consumptionAmount);
                } else {
                    System.out.println("Insufficient funds to make the consumption.");
                }
                break;

            case "authorized":
                if (this.availableFunds >= consumptionAmount) {
                    this.availableFunds -= consumptionAmount;
                    System.out.println("Consumption recorded by the authorized person: " + consumptionAmount);
                }
        }
    }

    void registerMember() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void payInvoice(double invoiceAmount) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void manageUnpaidInvoices(String invoiceOperation, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
