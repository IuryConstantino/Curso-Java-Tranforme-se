package tiposprimitivos;


public class GPS {
    private String idioma;
    private String rota;
    
    public GPS() {
        this.idioma = "";
        this.rota = "";
    }
    
    public GPS(String idioma, String rota) {
        this.idioma = idioma;
        this.rota = rota;
    }
    
    public void ligarGPS() {
        this.idioma = "Português";
        this.rota = "Alguma rota";
    }
    
    public void definirIdioma(String idioma) {
        this.idioma = idioma;
    }
    
    public void definirRota(String rota) {
        this.rota = rota;
    }
    
    public void mostrar() {
        System.out.println("Idioma: " + this.idioma);
        System.out.println("Rota: " + this.rota);
    }




    }
