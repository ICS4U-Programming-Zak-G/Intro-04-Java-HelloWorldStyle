/**
* This program says customized messages and uses style.
*
* @author  Zak Goneau
* @version 1.0
* @since   2025-02-06
*/

// Creating class
public final class HelloWorldStyle {
    /**
     * This is a private constructor used to satisfy the style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private HelloWorldStyle() {
        throw new IllegalStateException("Utility class");
    }
    /**
     * This is the main method.
     *
     * @param args Unused.
     */

    public static void main(String[] args) {
        // Print "Hello, Ms Raffin"
        System.out.println("Hello, Ms Raffin");
        // Print a customized message
        System.out.println("How was your day?");
    }
}
