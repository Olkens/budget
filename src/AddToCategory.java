public class AddToCategory {

    CategoriesList food = new CategoriesList();
    CategoriesList clothes = new CategoriesList();
    CategoriesList entertainment = new CategoriesList();
    CategoriesList other = new CategoriesList();
    CategoriesList all = new CategoriesList();

    public void addToCategory(int categoryInput) {
        switch (categoryInput) {
            case 1:
                addToFood();
                break;
            default:
                System.out.println("Wrong number");
        }


    }

    public void addToFood() {

        food.addToList("spodnie", 24.44);
    }
}