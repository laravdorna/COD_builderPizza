/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cod_pizzeria;

/**
 *
 * @author Lara Vazquez Dorna
 */
public class COD_PIZZERIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //crear pizza
        Pizza pizzaHawaiana;

        pizzaHawaiana = new PizzaBuilder(500, 200).setGrPinha(50).createPizza();

        System.out.println(pizzaHawaiana.toString());

    }

}
