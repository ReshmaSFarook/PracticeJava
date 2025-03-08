package org.example;

import java.util.ArrayList;

public class MenuBuilder {

    public static void main (String[] args) {
        //Reference variable
         String menuTitle = "My Dream Menu";
        System.out.printf("Menu Title " +menuTitle);

        ArrayList<MenuItem> menu = new ArrayList<>();
        MenuItem starter = new MenuItem("Calamari");
        menu.add(starter);
        MenuItem mainCourse = new MenuItem("Lasagne");
        menu.add(mainCourse);
        MenuItem desert = new MenuItem("Banoffee Pie");
        menu.add(desert);
        System.out.println(menu);
    }
}
