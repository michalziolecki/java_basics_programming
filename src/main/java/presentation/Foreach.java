package presentation;

public class Foreach {

    public static void ex1(String[] names){
        for (String name: names){
            System.out.println("Hello " + name);
        }
    }

    public static String ex2(String[] products){
        StringBuilder productsStr = new StringBuilder();
        String lists = "";
        for (String product: products){
            // String builder szybciej wykonuje operacje niż zwykła kontatenacja plusem
            productsStr.append(product).append(", ");

            lists += product;
        }
        System.out.println(lists);
        return String.valueOf(productsStr);
    }

    public static void main(String[] args){
//        String[] table = {"Michal", "Sara", "Kamil", "Żaneta", "Łukasz"};
//        ex1(table);
        String[] products = {"Ser", "Szynka", "Pomidor", "Bułka", "Szczypior"};
        String result = ex2(products);
        System.out.println(result);
    }
}
