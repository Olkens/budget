public class AddToCategory implements CategoryMethods {

    CategoriesList food = new CategoriesList();
    CategoriesList clothes = new CategoriesList();
    CategoriesList entertainment = new CategoriesList();
    CategoriesList other = new CategoriesList();
    CategoriesList all = new CategoriesList();

    protected String purchaseName;
    protected double purchasePrice;

    public AddToCategory(int categoryInput) {
        addToCategory(categoryInput);
    }

    protected void addToCategory(int categoryInput) {
        switch (categoryInput) {
            case 1:
                addToList(food);
                break;
            case 2:
                addToClothes();
                break;
            default:
                System.out.println("Wrong number");
        }
    }

    public void addToList(CategoriesList category) {
        System.out.println("Enter purchase name:");
        Main.sc.nextLine();
        purchaseName = Main.sc.nextLine();

        System.out.println("Enter its price:");
        purchasePrice = Main.sc.nextDouble();

        category.addToList(purchaseName, purchasePrice);
        System.out.println("Purchase was added!");
        for (String f : food.list.keySet()) {
            System.out.println(f + " = " + food.list.get(f));
        }
        System.out.println(food.list);
    }

}