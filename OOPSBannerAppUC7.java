public class OOPSBannerAppUC7 {

    static class CharacterPatternMap {
        private final Character character;
        private final String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public Character getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static CharacterPatternMap[] createCharacterPatternMaps() {
        return new CharacterPatternMap[] {
            new CharacterPatternMap('O', new String[] {
                "  *****   ",
                " *     *  ",
                " *     *  ",
                " *     *  ",
                " *     *  ",
                " *     *  ",
                "  *****   "
            }),
            new CharacterPatternMap('P', new String[] {
                "  *****   ",
                " *     *  ",
                " *     *  ",
                " *****    ",
                " *        ",
                " *        ",
                " *        "
            }),
            new CharacterPatternMap('S', new String[] {
                "  *****   ",
                " *        ",
                " *        ",
                "  *****   ",
                "       *  ",
                " *     *  ",
                "  *****   "
            }),
            new CharacterPatternMap(' ', new String[] {
                "           ",
                "           ",
                "           ",
                "           ",
                "           ",
                "           ",
                "           "
            })
        };
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }

        // If character not found, return blank pattern
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ' ') {
                return map.getPattern();
            }
        }

        return new String[7]; // safety fallback
    }

    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        message = message.toUpperCase();  // supports lowercase input

        int numLines = charMaps[0].getPattern().length;

        for (int i = 0; i < numLines; i++) {
            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                lineBuilder.append(pattern[i]).append(" ");
            }

            System.out.println(lineBuilder.toString());
        }
    }

    public static void main(String[] args) {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        String message = "OOPS";
        printMessage(message, charMaps);
    }
}