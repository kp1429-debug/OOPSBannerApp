import java.util.HashMap;

public class OOPSBannerAppUC8 {

    // Create HashMap to store character patterns
    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        map.put('P', new String[]{
                " ***** ",
                "*     *",
                " ***** ",
                "*      ",
                "*      "
        });

        map.put('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        });

        return map;
    }

    // Method to print banner
    public static void printBanner(String word, HashMap<Character, String[]> map) {

        int height = 5;

        for (int i = 0; i < height; i++) {

            for (char ch : word.toCharArray()) {

                String[] pattern = map.get(Character.toUpperCase(ch));

                if (pattern != null) {
                    System.out.print(pattern[i] + "  ");
                }
            }

            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {

        HashMap<Character, String[]> characterMap = createCharacterMap();

        String word = "OOPS";

        printBanner(word, characterMap);
    }
}