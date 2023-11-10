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

    private int ID;
    private String name;
    private double availableFunds;
    private int subscriptionType;
    private int unpaidBills;
    private int authorizedPeople; 
        private String[] authorizedNames = new String[10];
    private String[] authorizedID = new String[10];

  public Members(int ID, String name, double availableFunds, int subscriptionType, int unpaidBills, int authorizedPeople) {
    this.ID = ID;
    this.name = name;
    this.subscriptionType = subscriptionType;
    this.unpaidBills = unpaidBills;
    this.authorizedPeople = authorizedPeople;

    // Set availableFunds based on subscription type
    if (subscriptionType == 1) {
        this.availableFunds = 100000; // VIP subscription
    } else if (subscriptionType == 2) {
        this.availableFunds = 50000; // Regular subscription
    } else {
        System.out.println("Invalid subscription type. Setting availableFunds to 0.");
        this.availableFunds = 0;
    }

 
    }

    public int getID() {
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

    public int getAuthorizedPeople() {
        return authorizedPeople;
    }

    public String[] getAuthorizedNames() {
        return authorizedNames;
    }

    public String[] getAuthorizedID() {
        return authorizedID;
    }

    public void setID(int ID) {
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

    public void setAuthorizedPeople(int authorizedPeople) {
        this.authorizedPeople = authorizedPeople;
    }

    public void setAuthorizedNames(String[] authorizedNames) {
        this.authorizedNames = authorizedNames;
    }

    public void setAuthorizedID(String[] authorizedID) {
        this.authorizedID = authorizedID;
    }



public void newMember() {
    Scanner scanner = new Scanner(System.in);
        int memberCount=0;

    if (memberCount >= 35) {
        System.out.println("Maximum member limit (35) reached. Cannot add more members.");
        return;
    }

    System.out.println("Enter the new member's details:");
    System.out.print("Name: ");
    String name = scanner.nextLine();

    System.out.print("ID: ");
    String ID = scanner.nextLine();

    System.out.print("Enter 1 for VIP or 2 for Regular subscription: ");
    int subscriptionChoice = scanner.nextInt();

    String subscriptionType = null;
 
            int vipCount = 0;
switch (subscriptionChoice) {
    case 1:
        {
           int MAX_VIP_MEMBERS = 3;
            if (vipCount < MAX_VIP_MEMBERS) {
                subscriptionType = "VIP";
                System.out.println("You've chosen VIP subscription.");
                availableFunds = 100000;
            } else {
                System.out.println("Maximum VIP members limit (3) reached. Setting subscription to Regular.");
                
            }
        }
        break;


    case 2:
        subscriptionType = "Regular";
        System.out.println("You've chosen Regular subscription.");
        availableFunds = 50000;
        break;
    default:
        System.out.println("Invalid choice.");
        return;
}


 
    setName(name);
    setSubscriptionType(subscriptionChoice);
    setAvailableFunds(availableFunds);

    System.out.println("New user created successfully!");
    System.out.println("Name: " + getName());
    System.out.println("ID: " + getID());
    System.out.println("Subscription Type: " + subscriptionType);
    System.out.println("Initial Amount: " + availableFunds);
}
 

       public void AuthorizedPerson() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select 1 to add an authorized person, 2 to delete, and 3 to leave");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                if (authorizedPeople < 10) {
                    System.out.println("Enter details for the new authorized person:");
                    System.out.print("Name: ");
                    authorizedNames[authorizedPeople] = scanner.next();

                    System.out.print("ID: ");
                    authorizedID[authorizedPeople] = scanner.next();

                    authorizedPeople++;

                    System.out.println("Authorized person added successfully!");
                } else {
                    System.out.println("Number of added persons is limited to 10. Cannot add more.");
                }
                break;

            case 2:
                if (authorizedPeople > 0) {
                    System.out.println("Removing authorized person: Name: " + authorizedNames[authorizedPeople - 1] + ", ID: " + authorizedID[authorizedPeople - 1]);
                    authorizedNames[authorizedPeople - 1] = null;
                    authorizedID[authorizedPeople - 1] = null;
                    authorizedPeople--;
                } else {
                    System.out.println("No authorized persons to remove.");
                }
                break;

            case 3:
                System.out.println("Exiting Authorized People Management.");
                return;

            default:
                System.out.println("Invalid choice. Please enter a valid option.");
                break;
        }
       }

    public void manageUnpaidBills(String operation, double billAmount) {
        switch (operation) {
            case "generate":
                if (this.unpaidBills < 20) {
                    this.unpaidBills++;
                    System.out.println("Unpaid bill generated.");
                } else {
                    System.out.println("The maximum limit of unpaid bills has been reached.");
                }
                break;

            case "pay":
                if (this.unpaidBills == 0) {
                    System.out.println("There are no pending bills to pay.");
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
                System.out.println("Consumption registered by the member: " + consumptionAmount);
            } else {
                System.out.println("Insufficient funds to make the consumption.");
            }
            break;

        case "authorized":
            if (this.availableFunds >= consumptionAmount) {
                this.availableFunds -= consumptionAmount;
                System.out.println("Consumption registered by the authorized person: " + consumptionAmount);
            } else {
                System.out.println("Insufficient funds to make the consumption.");
            }
            break;

        default:
            System.out.println("Unrecognized consumer type.");
    }
        }
   public void increaseAmount(double additionalAmount) {
    double limit = (getSubscriptionType() == 1) ? 5000000 : 1000000;

    if (getAvailableFunds() + additionalAmount <= limit) {
        setAvailableFunds(getAvailableFunds() + additionalAmount);
        System.out.println("Amount increased successfully. New available funds: " + getAvailableFunds());
    } else {
        System.out.println("Cannot exceed the maximum limit for the subscription type.");
    }

    System.out.println("Your current amount is: " + getAvailableFunds());
}
}