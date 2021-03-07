public enum Book {
    JAVA("blah", 2020),
    C("blah blah ",2021),
    PYTON("blah2 ",2022);

    private String language;
    private int year;

    Book(String language ,int year) {
        this.language = language;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getLanguage() {
        return language;
    }
}
