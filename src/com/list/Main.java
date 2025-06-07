// Java project to review ArrayList
package com.list;

import java.util.ArrayList;
import java.util.List;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating ArrayList
        List<String> list = new ArrayList<>();

        // Adding elements to list
        list.add("Berlin");
        list.add("Paris");
        list.add("London");

        // Printing information about these cities to console
        for (int index = 0; index < list.size(); index++) {
            System.out.println(list.get(index) + " Capital");
        }
    }
}