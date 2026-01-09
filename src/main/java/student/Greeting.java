package student;

/**
 * Implementation of the Greeting class based on the unit test requirements.
 */
public class Greeting {
    private int localityID;
    private String localityName;
    private String asciiGreeting;
    private String unicodeGreeting;
    private String formatStr;

    /**
     * Creates default greeting like "Hello {name}!"
     * Default values are based on requirements for USA/Standard greetings.
     */
    public Greeting(int localityID, String localityName) {
        this(localityID, localityName, "Hello", "Hello", "Hello, %s!");
    }

    /**
     * Creates a greeting assuming the language is already using ascii letters only.
     * Assumes the format of the greeting to be "{greeting}, {name}!"
     */
    public Greeting(int localityID, String localityName, String greeting) {
        this(localityID, localityName, greeting, greeting, greeting + ", %s!");
    }

    /**
     * Fully parameterized constructor.
     */
    public Greeting(int localityID, String localityName, String asciiGreeting,
                    String unicodeGreeting, String formatStr) {
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = asciiGreeting;
        this.unicodeGreeting = unicodeGreeting;
        this.formatStr = formatStr;
    }

    // --- Accessor Methods ---

    public int getLocalityID() {
        return this.localityID;
    }

    public String getLocalityName() {
        return this.localityName;
    }

    public String getAsciiGreeting() {
        return this.asciiGreeting;
    }

    public String getUnicodeGreeting() {
        return this.unicodeGreeting;
    }

    /**
     * Returns the format string. By default, returns the unicode version.
     */
    public String getFormatStr() {
        return this.getFormatStr(false);
    }

    /**
     * Returns the format string.
     * @param asciiOnly if true, returns the format with the ascii greeting.
     */
    public String getFormatStr(boolean asciiOnly) {
        if (asciiOnly) {
            // Note: Tests expect "%s, Ni Hao!" format for China's ASCII version
            return String.format(this.formatStr, "%s", this.asciiGreeting)
                    .replace(this.unicodeGreeting, this.asciiGreeting);
        }
        return String.format(this.formatStr, "%s", this.unicodeGreeting);
    }

    @Override
    public String toString() {
        return String.format("{localityID:%d, localityName:\"%s\", asciiGreeting:\"%s\", unicodeGreeting:\"%s\"}",
                localityID, localityName, asciiGreeting, unicodeGreeting);
    }
}