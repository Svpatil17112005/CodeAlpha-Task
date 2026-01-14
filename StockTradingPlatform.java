import java.util.ArrayList;
import java.util.Scanner;

// Stock class
class Stock {
    String name;
    double price;

    Stock(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

// User Portfolio class
class Portfolio {
    double balance = 10000; // initial balance
    ArrayList<String> ownedStocks = new ArrayList<>();

    void buyStock(Stock stock) {
        if (balance >= stock.price) {
            balance -= stock.price;
            ownedStocks.add(stock.name);
            System.out.println("Stock bought successfully!");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void sellStock(Stock stock) {
        if (ownedStocks.contains(stock.name)) {
            balance += stock.price;
            ownedStocks.remove(stock.name);
            System.out.println("Stock sold successfully!");
        } else {
            System.out.println("You do not own this stock!");
        }
    }

    void showPortfolio() {
        System.out.println("\n--- Portfolio ---");
        System.out.println("Balance: ₹" + balance);
        System.out.println("Owned Stocks: " + ownedStocks);
    }
}

// Main class
public class StockTradingPlatform {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Market Stocks
        ArrayList<Stock> market = new ArrayList<>();
        market.add(new Stock("TATA", 1200));
        market.add(new Stock("INFY", 1500));
        market.add(new Stock("RELIANCE", 2500));

        Portfolio user = new Portfolio();
        int choice;

        do {
            System.out.println("\n===== Stock Trading Platform =====");
            System.out.println("1. View Market Stocks");
            System.out.println("2. Buy Stock");
            System.out.println("3. Sell Stock");
            System.out.println("4. View Portfolio");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\n--- Market Stocks ---");
                    for (int i = 0; i < market.size(); i++) {
                        System.out.println((i + 1) + ". " +
                                market.get(i).name + " - ₹" +
                                market.get(i).price);
                    }
                    break;

                case 2:
                    System.out.print("Enter stock number to buy: ");
                    int buyChoice = sc.nextInt();
                    if (buyChoice >= 1 && buyChoice <= market.size()) {
                        user.buyStock(market.get(buyChoice - 1));
                    } else {
                        System.out.println("Invalid choice!");
                    }
                    break;

                case 3:
                    System.out.print("Enter stock number to sell: ");
                    int sellChoice = sc.nextInt();
                    if (sellChoice >= 1 && sellChoice <= market.size()) {
                        user.sellStock(market.get(sellChoice - 1));
                    } else {
                        System.out.println("Invalid choice!");
                    }
                    break;

                case 4:
                    user.showPortfolio();
                    break;

                case 5:
                    System.out.println("Thank you for trading!");
                    break;

                default:
                    System.out.println("Invalid option!");
            }

        } while (choice != 5);

        sc.close();
    }
}
