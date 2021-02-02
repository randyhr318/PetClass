package com.tts.petclass;

public class Guitar {

    private String name;
    private String colors;
    private int size;
    private boolean legalSize;
    private String fullDescription;

    private final static String DEFAULT_DECK_NAME = "New Deck";
    private final static String DEFAULT_DECK_COLORS = "C";
    private final static int DEFAULT_DECK_SIZE = 0;
    private final static int MIN_DECK_SIZE = 60;

    public Guitar() {
        this(DEFAULT_DECK_NAME, DEFAULT_DECK_COLORS, DEFAULT_DECK_SIZE);
    }

    public Guitar(String name, String colors) {
        this(name, colors, DEFAULT_DECK_SIZE);
    }

    public Guitar(String name, String colors, int size) {
        this.name = name;
        this.colors = colors;
        this.size = size;

        this.legalSize = (this.size >= MIN_DECK_SIZE);
        this.buildDescription();
    }


    public String getName() {
        return this.name;
    }

    public String getColors() {
        StringBuilder colorOutput = new StringBuilder();

        for (int i = 0; i < this.colors.length(); i++) {
            if (!colorOutput.toString().contains("" + this.colors.charAt(i))) {
                colorOutput.append(this.colors.charAt(i));
            }
        }

        return colorOutput.toString().toUpperCase();
    }

    public int getDate() {
        return this.size;
    }

    public void setName(String newVar) {
        this.name = newVar;
    }

    public void setColors(String newVar) {
        this.colors = newVar;
    }

    public void setDate(int newSize) {
        this.size = newSize;
        this.legalSize = (this.size >= MIN_DECK_SIZE);
    }

    public boolean getLegalSize() {
        return legalSize;
    }

    public String getFullDescription() {
        return fullDescription;
    }

    private void buildDescription() {
        this.fullDescription =
                "Name: " + this.name +
                        "\nColors: " + this.getColors() +
                        "\nSize: " + this.size +
                        "\nLegal: " + this.getLegalSize()
        ;
    }

}
