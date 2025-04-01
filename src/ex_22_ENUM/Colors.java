package ex_22_ENUM;

enum Colors {
    RED("#FF0000"),

    GREEN("#61FF33");

    private final String hexCode;

    Colors(String hexCode) {
        this.hexCode = hexCode;
    }

    public String getHexCode() {
        return hexCode;
    }
}
