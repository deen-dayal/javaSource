/**
 * The HelloWorldApp class implements an application that
 * simply prints "Hello World!" to standard output.
 */
package com.instanceofjava.openwebpage;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello Team Nimble!"); // Display the string.

        Test1();
        Test2();
    }

    public static void Test1() {
        System.out.println("-----------------------------------------------"); // Display the string.
        System.out.println("Test1 results!"); // Display the string.
        System.out.println("-----------------------------------------------"); // Display the string.
    }

    public static void Test2() {
        System.out.println("-----------------------------------------------"); // Display the string.
        System.out.println("Test2 results!"); // Display the string.
        System.out.println("-----------------------------------------------"); // Display the string.

        File htmlFile = new File("C:\\Dayal\\hsbc\\sample.html");
        Desktop.getDesktop().browse(htmlFile.toURI());

    }
}