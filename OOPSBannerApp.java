/**
 * OOPSBannerApp UC7 – OOPS Banner Display Application
 *
 * This application uses an inner class to store character patterns and displays the OOPS banner.
 *
 * @author Developer
 * @version 7.0
 */

public class OOPSBannerApp {

    // Inner class to store a character and its banner pattern.
    static class CharacterPatternMap {
        
        // The character to be displayed
        Character character;
        
        // The 7-line ASCII pattern for the character
        String[] pattern;

        /**
         * Constructor to set the character and its pattern lines.
         * @param character The character to store
         * @param pattern The pattern array for the character
         */
        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Returns the stored character
        public Character getCharacter() {
            return character;
        }

        // Returns the pattern array
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Creates an array of CharacterPatternMap objects for O, P, and S.
     * @return Array containing the character patterns
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {
        CharacterPatternMap[] charMaps = new CharacterPatternMap[3];

        charMaps[0] = new CharacterPatternMap('O', new String[] {
            "  *****  ",
            " **   ** ",
            "**     **",
            "**     **",
            "**     **",
            " **   ** ",
            "  *****  "
        });

        charMaps[1] = new CharacterPatternMap('P', new String[] {
            "******** ",
            "**     **",
            "**     **",
            "******** ",
            "**       ",
            "**       ",
            "**       "
        });

        charMaps[2] = new CharacterPatternMap('S', new String[] {
            "  ****** ",
            " **    **",
            "**       ",
            " ******* ",
            "       **",
            "**    ** ",
            " ******  "
        });

        return charMaps;
    }

    /**
     * Finds the pattern for a specific character in the map array.
     * @param ch The character to find
     * @param charMaps The array of maps to search
     * @return The pattern for the character
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return null; // Handle case where char is not found
    }

    /**
     * Prints the message as a banner by joining patterns line by line.
     * @param message The text to display
     * @param charMaps The available character patterns
     */
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        // Loop through all 7 lines of the banner height
        for (int i = 0; i < 7; i++) {
            StringBuilder lineBuilder = new StringBuilder();
            
            // For each letter in the message, add its specific line pattern
            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                lineBuilder.append(pattern[i]).append(" ");
            }
            System.out.println(lineBuilder.toString());
        }
    }

    // Main method to run the application.
    public static void main(String[] args) {
		
        // Initialize the character data
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        
        // Define message and print it
        String message = "OOPS";
        printMessage(message, charMaps);
    }
}