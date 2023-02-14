 public enum LicenseType {
    FREE(0, new String[][]{{"en", "Free license"}, {"es", "Licencia gratuita"}}, 0.0),
    FREEMIUM(1, new String[][]{{"en", "Freemium license"}, {"es", "Licencia freemium"}}, 5.99),
    PREMIUM(2, new String[][]{{"en", "Premium license"}, {"es", "Licencia premium"}}, 9.99),
    GOLD(3, new String[][]{{"en", "Gold license"}, {"es", "Licencia gold"}}, 19.99);

    private final int id;
    private final String[][] descriptions;
    private double price;

    private LicenseType(int id, String[][] descriptions, double price) {
        this.id = id;
        this.descriptions = descriptions;
        this.price = price;
    }

    public String getDescription(String languageCode) {
        for (String[] description : descriptions) {
            if (description[0].equals(languageCode)) {
                return description[1];
            }
        }
        return "";
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String languageCode, String description) {
        for (String[] descriptionArray : descriptions) {
            if (descriptionArray[0].equals(languageCode)) {
                descriptionArray[1] = description;
                break;
            }
        }
    }
}
