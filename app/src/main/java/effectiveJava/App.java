/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package effectiveJava;

import static effectiveJava.Taco.Shell.FLOUR;
import static effectiveJava.Mexican.Topping.*;
import static effectiveJava.TacoSoup.Broth.*;;

public class App {

    public static void main(String[] args) {
    	System.out.println("Taco ingredients:");
        Taco taco = new Taco.Builder(FLOUR).addIngredient(CHICKEN).addIngredient(CHEESE).addIngredient(SALSA).build();
        taco.printToppings();
        taco.printShell();
        
        System.out.println("\nTacoSoup ingredients:");
        TacoSoup tacoSoup = new TacoSoup.Builder(VEGETABLE_STOCK).addIngredient(BEEF).build();
        tacoSoup.printToppings();
        tacoSoup.printBroth();
    }
}
