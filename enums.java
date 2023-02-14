public enum TipoLicencia {
    FREE(0, new String[][]{{"en", "Free license"}, {"es", "Licencia gratuita"}}, 0.0),
    FREEMIUM(1, new String[][]{{"en", "Freemium license"}, {"es", "Licencia freemium"}}, 5.99),
    PREMIUM(2, new String[][]{{"en", "Premium license"}, {"es", "Licencia premium"}}, 9.99),
    GOLD(3, new String[][]{{"en", "Gold license"}, {"es", "Licencia gold"}}, 19.99);

    private final int id;
    private final String[][] descripciones;
    private double precio;

    private TipoLicencia(int id, String[][] descripciones, double precio) {
        this.id = id;
        this.descripciones = descripciones;
        this.precio = precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDescripcion(String idioma, String descripcion) {
        for (String[] descrip : descripciones) {
            if (descrip[0].equals(idioma)) {
                descrip[1] = descripcion;
                break;
            }
        }
    }

    public String getDescripcion(String idioma) {
        for (String[] descrip : descripciones) {
            if (descrip[0].equals(idioma)) {
                return descrip[1];
            }
        }
        return "";
    }

    public double getPrecio() {
        return this.precio;
    }
}
