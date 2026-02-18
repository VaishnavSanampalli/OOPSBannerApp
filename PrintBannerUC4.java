public class PrintBannerUC4 {

    public static void main(String[] args) {

        // Storing banner lines in an array
        String[] banner = {

            String.join("", "O   O   OOO   PPPP   SSS "),
            String.join("", "O   O  O   O  P   P S   S"),
            String.join("", "O   O  O   O  PPPP   SSS "),
            String.join("", "O   O  O   O  P         S"),
            String.join("", " OOO    OOO   P     SSS ")
        };

        // Enhanced for loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}