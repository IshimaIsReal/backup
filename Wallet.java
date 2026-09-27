import java.util.Scanner;

public class Wallet {
    public static void main(String[] args) {
        Scanner shop = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = shop.nextLine();
        System.out.print("Enter Your Balance: Peso");
        int bal = shop.nextInt();
        shop.nextLine(); // fix nextLine bug

        System.out.println("\nGood day " + name + "! Welcome to Binsoyy Coffee Shop! ");

        // Prices
        int Americano = 95;
        int SpanishLatte = 140;
        int Cappuccino = 125;
        int CaramelMacchiato = 145;
        int IcedAmericano = 105;
        int IcedSpanishLatte = 155;
        int IcedLatte = 135;
        int IcedCaramelMacchiato = 155;

        boolean running = true;
        while (running) {
            // HOME PAGE
            System.out.println("\n====================");
            System.out.println("        HOME        ");
            System.out.println("====================");
            System.out.println("1. MENU");
            System.out.println("2. ORDER ONLINE");
            System.out.println("3. LOCATION");
            System.out.println("4. CONTACT");
            System.out.println("5. EXIT SHOP");
            System.out.print("Enter the number: ");
            int tab = shop.nextInt();

            if (tab == 1) {
                // MENU TAB
                int total = 0;
                boolean inMenu = true;
                while (inMenu) {
                    System.out.println("\n====================");
                    System.out.println("        MENU        ");
                    System.out.println("====================");
                    System.out.println("HOT COFFEE");
                    System.out.println("1. Americano ₱ " + Americano);
                    System.out.println("2. Spanish Latte ₱" + SpanishLatte);
                    System.out.println("3. Cappuccino ₱" + Cappuccino);
                    System.out.println("4. Caramel Macchiato ₱" + CaramelMacchiato);
                    System.out.println("5. Iced Coffee Option");
                    System.out.println("6. Back to Home");
                    System.out.println("7. Place Order");
                    System.out.print("Enter the number: ");
                    int a = shop.nextInt();

                    switch (a) {
                        case 1:
                            if (bal - (total + Americano) < 0) System.out.println("Insufficient balance!");
                            else { total += Americano; System.out.println("+You added Americano | Total: ₱" + total + " | Remaining: ₱" + (bal - total)); }
                            break;
                        case 2:
                            if (bal - (total + SpanishLatte) < 0) System.out.println("Insufficient balance!");
                            else { total += SpanishLatte; System.out.println("+You added Spanish Latte | Total: ₱" + total + " | Remaining: ₱" + (bal - total)); }
                            break;
                        case 3:
                            if (bal - (total + Cappuccino) < 0) System.out.println("Insufficient balance!");
                            else { total += Cappuccino; System.out.println("+You added Cappuccino | Total: ₱" + total + " | Remaining: ₱" + (bal - total)); }
                            break;
                        case 4:
                            if (bal - (total + CaramelMacchiato) < 0) System.out.println("Insufficient balance!");
                            else { total += CaramelMacchiato; System.out.println("+You added Caramel Macchiato | Total: ₱" + total + " | Remaining: ₱" + (bal - total)); }
                            break;
                        case 5: // Iced Coffee Sub-menu
                            boolean inIced = true;
                            while (inIced) {
                                System.out.println("\n--------------------");
                                System.out.println("   ICED COFFEE");
                                System.out.println("--------------------");
                                System.out.println("1. Iced Americano ₱" + IcedAmericano);
                                System.out.println("2. Iced Spanish Latte ₱" + IcedSpanishLatte);
                                System.out.println("3. Iced Latte ₱" + IcedLatte);
                                System.out.println("4. Iced Caramel Macchiato ₱" + IcedCaramelMacchiato);
                                System.out.println("5. Back to Hot Coffee");
                                System.out.println("6. Place Order");
                                System.out.print("Enter the number: ");
                                int b = shop.nextInt();

                                switch (b) {
                                    case 1: total += IcedAmericano; System.out.println("+You added Iced Americano | Total: ₱" + total); break;
                                    case 2: total += IcedSpanishLatte; System.out.println("+You added Iced Spanish Latte | Total: ₱" + total); break;
                                    case 3: total += IcedLatte; System.out.println("+You added Iced Latte | Total: ₱" + total); break;
                                    case 4: total += IcedCaramelMacchiato; System.out.println("+You added Iced Caramel Macchiato | Total: ₱" + total); break;
                                    case 5: inIced = false; break;
                                    case 6:
                                        if (total == 0) { System.out.println("No order yet!"); }
                                        else {
                                            System.out.println("\nYour total payment is ₱" + total);
                                            bal -= total;
                                            System.out.println("Your Remaining balance is ₱" + bal);
                                            System.out.println("\nTHANK YOU FOR ORDER! " + name + " God bless");
                                            inIced = false;
                                            inMenu = false;
                                        }
                                        break;
                                    default: System.out.println("Invalid choice!");
                                }
                            }
                            break;
                        case 6: inMenu = false; break; // Back
                        case 7: // Place Order
                            if (total == 0) {
                                System.out.println("No order yet!");
                            } else {
                                System.out.println("\nYour total payment is ₱" + total);
                                bal -= total;
                                System.out.println("Your Remaining balance is ₱" + bal);
                                System.out.println("\nTHANK YOU FOR ORDER! " + name + " God bless");
                                inMenu = false;
                            }
                            break;
                        default: System.out.println("Invalid choice!");
                    }
                }

            } else if (tab == 2) {
                System.out.println("\n--- ORDER ONLINE ---");
                System.out.println("You can order via: FB: Binsoyy Coffee Shop");
                System.out.println("Delivery fee: ₱30 (within Mamburao!)");
                System.out.println("Press Enter to go back...");
                shop.nextLine(); shop.nextLine();

            } else if (tab == 3) {
                System.out.println("\n--- LOCATION ---");
                System.out.println("Binsoyy Coffee Shop");
                System.out.println("Brgy. Payompon 7, Occidental Mindoro");
                System.out.println("Open: 7AM - 7PM, Mon-Fri");
                System.out.println("Press Enter to go back...");
                shop.nextLine(); shop.nextLine();

            } else if (tab == 4) {
                System.out.println("\n--- CONTACT ---");
                System.out.println("Phone: 0912-345-6789");
                System.out.println("Email: binsoyy.coffee@gmail.com");
                System.out.println("Press Enter to go back...");
                shop.nextLine(); shop.nextLine();

            } else if (tab == 5) {
                System.out.println("\nThank you " + name + "! Come again at Binsoyy!");
                System.out.println("Final Balance: ₱" + bal);
                running = false;

            } else {
                System.out.println("Invalid choice! Try again.");
            }
        }
        shop.close();
    }
}
