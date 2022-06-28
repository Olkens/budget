public class AddToCategory implements CategoryMethods {

    CategoriesList food = new CategoriesList();
    CategoriesList clothes = new CategoriesList();
    CategoriesList entertainment = new CategoriesList();
    CategoriesList other = new CategoriesList();
    CategoriesList all = new CategoriesList();

    public AddToCategory(int categoryInput){
        addToCategory(categoryInput);
    }
    protected void addToCategory(int categoryInput) {
        switch (categoryInput) {
            case 1:
                addToFood();
                break;
            case 2:
                addToClothes();
                break;
            default:
                System.out.println("Wrong number");
        }
    }

    public void addToFood() {
        food.addToList("mleko", 24.44);
        for(double f : food.list.values()) {
            System.out.println(f);
        }
        System.out.println(food.list);
    }

    protected void addToClothes() {
        clothes.addToList("spodnie", 4.55);
        System.out.println(clothes);
    }
}