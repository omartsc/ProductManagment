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
import java.util.Comparator;
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

        ProductManager pm = new ProductManager("en-GB");
        pm.createProduct(101, "Tea", BigDecimal.valueOf(1.99), Rating.NOT_RATED);
        pm.printProductReport(101);
        pm.parseReview("101,4,Nice hot cup of tea!");
//        pm.reviewProduct(101, Rating.FOUR_STAR, "Nice hot cup of tea!");
//        pm.reviewProduct(101, Rating.TWO_STAR, "Rather weak taste");
//        pm.reviewProduct(101, Rating.FOUR_STAR, "Fine tea");
//        pm.reviewProduct(101, Rating.FOUR_STAR, "Good tea");
//        pm.reviewProduct(101, Rating.THREE_STAR, "Just add some lemon");
//        pm.reviewProduct(101, Rating.FIVE_STAR, "Perfect tea!");
        pm.printProductReport(101);
//
//        pm.createProduct(102, "Coffee", BigDecimal.valueOf(1.99), Rating.FOUR_STAR);
//        pm.reviewProduct(102, Rating.THREE_STAR, "Coffee was ok");
//        pm.reviewProduct(102, Rating.ONE_STAR, "where is my milk?");
//        pm.reviewProduct(102, Rating.FIVE_STAR, "Perfect with ten spoons of sugar");
////        pm.printProductReport(102);
//
////        pm.changeLocale("de-DE");
//
//        pm.createProduct(103, "Cake", BigDecimal.valueOf(3.99), Rating.FIVE_STAR, LocalDate.now().plusDays(2));
//        pm.reviewProduct(103, Rating.FIVE_STAR, "Very nice cake");
//        pm.reviewProduct(103, Rating.FOUR_STAR, "It good, but more chocolate");
//        pm.reviewProduct(103, Rating.FIVE_STAR, "This cake is just perfect!");
////        pm.printProductReport(103);
//
////        pm.changeLocale("es-MX");
//
//        pm.createProduct(105, "Cookie", BigDecimal.valueOf(3.99), Rating.TWO_STAR, LocalDate.now());
//        pm.reviewProduct(105, Rating.THREE_STAR, "just another cookie");
//        pm.reviewProduct(105, Rating.FOUR_STAR, "keep it on with this cookies");
//        pm.reviewProduct(105, Rating.FIVE_STAR, "best cookie ever");
//        pm.printProductReport(105);
//        pm.printProducts(p -> p.getPrice().floatValue() < 2, 
//                (p1,p2) -> p2.getRating().ordinal() - p1.getRating().ordinal());
//
//        pm.getDiscounts().forEach((rating, discount) -> System.out.println(rating + '\t' + discount));
//        Comparator<Product> ratingSorter = (p1,p2) -> p2.getRating().ordinal() - p1.getRating().ordinal();
//        Comparator<Product> priceSorter = (p1,p2) -> p2.getPrice().compareTo(p1.getPrice());
//        pm.printProducts(ratingSorter.thenComparing(priceSorter));
//        pm.printProducts(priceSorter.thenComparing(ratingSorter).reversed());
        
        
    }

}
