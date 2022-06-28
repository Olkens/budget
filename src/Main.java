//package budget;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;


public class Main {

    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    public static float totalIncome;
    public static List<String> expenses = new ArrayList<>();
    public static List<Float> expensesPrices = new ArrayList<>();
    public static int input;
    public static String purchaseName;
    public static float price;
    public static float sumOfPrices;

    public static double sum;


    public static void spacer(){
        System.out.println();
    }

    public static void displayMenu() {
        System.out.println("Choose your action:");
        System.out.println("1) Add income");
        System.out.println("2) add purchase");
        System.out.println("3) Show list of purchases");
        System.out.println("4) Balance");
        System.out.println("0) Exit");
        System.out.print("");
        input = sc.nextInt();
        chosenAction(input);
    }

    public static void AddIncome() {
        spacer();
        System.out.println("Enter income: ");
        System.out.print("> ");
        int income = sc.nextInt();
        totalIncome += income;
        System.out.println("Income added!");
        spacer();
        displayMenu();
    }

    public static void AddPurchase() {
        spacer();

        displayCategories();

        System.out.println("Enter purchase name:");
        sc.nextLine();
        purchaseName = sc.nextLine();

        System.out.println("Enter its price:");
        price = sc.nextFloat();

        System.out.println("Purchase was added!");
        expenses.add(purchaseName);
        expensesPrices.add(price);
        totalIncome -= price;

        spacer();

        displayMenu();
    }

    public static void ShowListOfPurchases() {
        spacer();
        if (expenses.size() == 0) {
            System.out.println("The purchase list is empty");
        } else {
            for (int i = 0; i < expenses.size(); i++) {
                System.out.println(expenses.get(i) + " $" + expensesPrices.get(i));
            }
        }
        for (Float expensesPrice : expensesPrices) {
            sumOfPrices += expensesPrice;
        }
        System.out.println("Total sum: $" + sumOfPrices);
        spacer();
        displayMenu();
    }

    public static void Balance() {
        spacer();
        System.out.println("Balance: $" + totalIncome);
        spacer();
        displayMenu();
    }

    public static void chosenAction(int input) {
        switch (input) {
            case 1:
                AddIncome();
                break;
            case 2:
                AddPurchase();
                break;
            case 3:
                ShowListOfPurchases();
                break;
            case 4:
                Balance();
                break;
            case 0:
                spacer();
                System.out.println("Bye!");
                break;
        }
    }

    public static void displayCategories() {
        System.out.println("1) Food");
        System.out.println("2) Clothes");
        System.out.println("3) Entertainment");
        System.out.println("4) Other");
        System.out.println("5) All");
        System.out.println("6) Back");
        int categoryInput = sc.nextInt();
//        AddToCategory.addToCategory(categoryInput); <-- do wykminy
//
//        CategoriesList clothes = new CategoriesList();
//        clothes.addToList("spodnie", 24.44);
//        clothes.addToList("koszulka", 5.33);
//
//        for (double x : clothes.list.values()) {
//            sum += x;
//        }
//        System.out.println(df.format(sum));
//        food.addToList("mleko", 4.33);
//        food.ConsoleInfo();
//        clothes.ConsoleInfo();
    }




    public static void main(String[] args) {
        displayMenu();
    }
}