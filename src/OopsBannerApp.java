/**
 * UC3: Render OOPS banner using String.join()
 * Uses String.join instead of + for better memory efficiency
 */
public class OopsBannerApp {

    public static void main(String[] args) {

        // Line 1
        System.out.println(String.join("",
                "  *****  ", "  *****  ", "  *****  ", "  *****  "));

        // Line 2
        System.out.println(String.join("",
                " *     * ", " *     * ", " *     * ", " *       "));

        // Line 3
        System.out.println(String.join("",
                " *     * ", " *     * ", " *     * ", " *       "));

        // Line 4
        System.out.println(String.join("",
                " *     * ", " *     * ", " *****   ", "  *****  "));

        // Line 5
        System.out.println(String.join("",
                " *     * ", " *     * ", " *       ", "       * "));

        // Line 6
        System.out.println(String.join("",
                " *     * ", " *     * ", " *       ", "       * "));

        // Line 7
        System.out.println(String.join("",
                "  *****  ", "  *****  ", " *       ", "  *****  "));
    }
}