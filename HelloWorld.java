/**
 * The HelloWorldApp class implements an application that
 * simply prints "Hello World!" to standard output.
 */
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

        String url_open ="http://www.paconsulting.com";
        java.awt.Desktop.getDesktop().browse(java.net.URI.create(url_open));
    }
}