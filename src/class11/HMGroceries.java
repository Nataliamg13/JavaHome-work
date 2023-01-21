package class11;

public class HMGroceries {
    public static void main(String[] args) {
        // Using 2D array create a grocery list.
        //Inside you should have an array of veggies, fruits, dairy and sweets. Retrieve all values from that
        // array using 2 different loops

        String [] [] groceryshopping={{"Tomatoes","Avocado","Cucumber","Carrots"},
                {"Strawberry","Peach","Cantaloupe","Cotton Candy Grapes"},
                {"Milk","Buttermilk","CoffeeCreamer","Sour Cream"},
                {"Smetanik","Raspberry chocolate Ice cream","Creamy puffs"}};

        for(int i=0;i< groceryshopping.length; i++) {
            for (int j = 0; j < groceryshopping[i].length; j++) {
                System.out.println(groceryshopping[i][j]);
            }
            System.out.println("*********************");
        }
        for (String[]shopping:groceryshopping) {
            for (String g:shopping){
                System.out.println(g+" ");
            }

        }

    }
}
