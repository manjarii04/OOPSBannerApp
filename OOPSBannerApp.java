public class BannerUC5 {
    public static void main(String[] args) {

        // Inline declaration and initialization using String.join()
        String[] banner = {
            String.join("", "+", "-".repeat(30), "+"),
            String.join("", "|", "                              ", "|"),
            String.join("", "|", "        WELCOME USER         ", "|"),
            String.join("", "|", "    INLINE ARRAY VERSION     ", "|"),
            String.join("", "|", "                              ", "|"),
            String.join("", "+", "-".repeat(30), "+"),
            String.join("", "        Program Completed        ")
        };

        // Enhanced for-loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
