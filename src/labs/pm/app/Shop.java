/*
 * Copyright (C) 2021 Omar
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package labs.pm.app;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Locale;
import labs.pm.data.Product;
import labs.pm.data.ProductManager;
import labs.pm.data.Rating;

/**
 * {@code Shop} class represents an application that manages Products
 *
 * @version 4.0
 * @author Omar
 */
public class Shop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ProductManager pm = new ProductManager(Locale.UK);
        Product p1 = pm.createProduct(101, "Tea", BigDecimal.valueOf(1.99), Rating.NOT_RATED);
        pm.printProductReport(p1);
        p1 = pm.reviewProduct(p1, Rating.FOUR_STAR, "Nice hot cup of tea!");
        p1 = pm.reviewProduct(p1, Rating.TWO_STAR, "Rather weak taste");
        p1 = pm.reviewProduct(p1, Rating.FOUR_STAR, "Fine tea");
        p1 = pm.reviewProduct(p1, Rating.FOUR_STAR, "Good tea");
        p1 = pm.reviewProduct(p1, Rating.THREE_STAR, "Just add some lemon");
        p1 = pm.reviewProduct(p1, Rating.FIVE_STAR, "Perfect tea!");
        pm.printProductReport(p1);

        Product p2 = pm.createProduct(102, "Coffee", BigDecimal.valueOf(1.99), Rating.FOUR_STAR);
        p2 = pm.reviewProduct(p2, Rating.THREE_STAR, "Coffee was ok");
        p2 = pm.reviewProduct(p2, Rating.ONE_STAR, "where is my milk?");
        p2 = pm.reviewProduct(p2, Rating.FIVE_STAR, "Perfect with ten spoons of sugar");
        pm.printProductReport(p2);

        Product p3 = pm.createProduct(103, "Cake", BigDecimal.valueOf(3.99), Rating.FIVE_STAR, LocalDate.now().plusDays(2));
        p3 = pm.reviewProduct(p3, Rating.FIVE_STAR, "Very nice cake");
        p3 = pm.reviewProduct(p3, Rating.FOUR_STAR, "It good, but more chocolate");
        p3 = pm.reviewProduct(p3, Rating.FIVE_STAR, "This cake is just perfect!");
        pm.printProductReport(p3);
        
        Product p4 = pm.createProduct(105, "Cookie", BigDecimal.valueOf(3.99),Rating.TWO_STAR,LocalDate.now());
        p4 = pm.reviewProduct(p4, Rating.THREE_STAR, "just another cookie");
        p4 = pm.reviewProduct(p4, Rating.FOUR_STAR, "keep it on with this cookies");
        p4 = pm.reviewProduct(p4, Rating.FIVE_STAR, "best cookie ever");
        pm.printProductReport(p4);
//        Product p3 = pm.createProduct(103, "Cake", BigDecimal.valueOf(3.99), Rating.FIVE_STAR, LocalDate.now().plusDays(2));
//        Product p4 = pm.createProduct(105, "Cookie", BigDecimal.valueOf(3.99),Rating.TWO_STAR,LocalDate.now());
//        Product p5 = p3.applyRating(Rating.THREE_STAR);
//        Product p6 = pm.createProduct(104, "Chocolate", BigDecimal.valueOf(2.99), Rating.THREE_STAR, LocalDate.now().plusDays(4));
//        Product p7 = pm.createProduct(104, "Chocolate", BigDecimal.valueOf(2.99), Rating.THREE_STAR);
//        Product p8 = p4.applyRating(Rating.FIVE_STAR);
//        Product p9 = p1.applyRating(Rating.TWO_STAR);
//        
//        System.out.println(p6.equals(p7));

//        System.out.println(p3.getBestBefore());
//        System.out.println(p2.getBestBefore());
//        if (p3 instanceof Food) {
//            LocalDate bestBefore = ((Food) p3).getBestBefore();
//        }
        //p3 = p3.applyRating(Rating.THREE_STAR);
//        System.out.println(p1.getId() + " " + p1.getName() + " " + p1.getPrice() + " " + p1.getDiscount()+" "+p1.getRating().getStars());
//        System.out.println(p2.getId() + " " + p2.getName() + " " + p2.getPrice() + " " + p2.getDiscount()+" "+p2.getRating().getStars());
//        System.out.println(p3.getId() + " " + p3.getName() + " " + p3.getPrice() + " " + p3.getDiscount()+" "+p3.getRating().getStars());
//        System.out.println(p4.getId() + " " + p4.getName() + " " + p4.getPrice() + " " + p4.getDiscount()+" "+p4.getRating().getStars());
//        System.out.println(p5.getId() + " " + p5.getName() + " " + p5.getPrice() + " " + p5.getDiscount()+" "+p5.getRating().getStars());
//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p3);
//        System.out.println(p4);
//        System.out.println(p5);
//        System.out.println(p6);
//        System.out.println(p7);
//        System.out.println(p8);
//        System.out.println(p9);
    }

}
