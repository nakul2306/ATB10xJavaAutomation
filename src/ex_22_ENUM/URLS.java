package ex_22_ENUM;

 enum URLS2 {
    page_button("#btn"),
    page_input("input1");


    private String locator ;

    URLS2(String locator) {
        this.locator = locator;
    }

    public String getLocator() {
        return this.locator;
    }
}
