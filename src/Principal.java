import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Genero rock = new Genero(
                "rock",
                1950,
                "EU",
                "Chuck",
                "festival de california");
        Genero salsa = new Genero(
                "salsa",
                1900,
                "Colombia",
                "anonimo",
                "festival internacional de salsa");
        Genero metal = new Genero("metal",
                1950,
                "EU",
                "anonimo",
                "festival de california");
        Genero musicaclasica = new Genero(
                "musica clasica",
                1620,
                "Inglaterra",
                "Beethoven",
                "capilla");
        System.out.println(musicaclasica.getYear());
        System.out.println(metal.getYear());
        System.out.println(salsa.getYear());
        System.out.println(rock.getYear());
        System.out.println();
        System.out.println(rock.getYear() + salsa.getYear() + metal.getYear() + musicaclasica.getYear());
        rock.setYear(1900);
        salsa.setYear(1850);
        System.out.println();

        //ingreso de datos
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar nuevo valor");
        int yeartemporal = entrada.nextInt();
        rock.setYear(yeartemporal);
        System.out.println(rock.getYear());

        //creacion de un metodo para imprimir
        rock.imprimirdatos();
        musicaclasica.imprimirdatos();
        metal.imprimirdatos();
        salsa.imprimirdatos();
        //Hola a todos
    }
}
