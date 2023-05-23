public class Genero {
    String tipo;
    int year;
    String pais;
    String artista;
    String festival;

    public Genero(String tipo, int year, String pais, String artista, String festival) {
        this.tipo = tipo;
        this.year = year;
        this.pais = pais;
        this.artista = artista;
        this.festival = festival;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getFestival() {
        return festival;
    }

    public void setFestival(String festival) {
        this.festival = festival;
    }
    public void imprimirdatos(){
        System.out.println(this.tipo);
        System.out.println(this.year);
        System.out.println(this.pais);
        System.out.println(this.artista);
        System.out.println(this.festival);
    }

}
