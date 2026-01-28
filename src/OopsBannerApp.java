/**
 * UC4: Render OOPS banner using String array and loop
 * Stores each banner line in an array and prints using a loop
 */
public class OopsBannerApp {

    public static void main(String[] args) {

        // String array holding all 7 lines of the OOPS banner
        String[] bannerLines = {

                String.join("",
                        "  *****  ", "  *****  ", "  *****  ", "  *****  "),

                String.join("",
                        " *     * ", " *     * ", " *     * ", " *       "),

                String.join("",
                        " *     * ", " *     * ", " *     * ", " *       "),

                String.join("",
                        " *     * ", " *     * ", " *****   ", "  *****  "),

                String.join("",
                        " *     * ", " *     * ", " *       ", "       * "),

                String.join("",
                        " *     * ", " *     * ", " *       ", "       * "),

                String.join("",
                        "  *****  ", "  *****  ", " *       ", "  *****  ")
        };

        // Loop to print each line of the banner
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}