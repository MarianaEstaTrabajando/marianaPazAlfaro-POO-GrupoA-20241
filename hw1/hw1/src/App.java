public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Clase Persona: ");
        Persona uno = new Persona("Juan", 19, false);
        Persona dos = new Persona("Luna", 24, true);
        Persona tres = new Persona("Juli", 64, false);
        Persona cuatro = new Persona("Sianya", 18, true);

        System.out.println(
                "La persona es: " + uno.nombre + " tiene " + uno.edad + " años y el que es mujer es " + uno.esChica);
        System.out.println(
                "La persona es: " + dos.nombre + " tiene " + dos.edad + " años y el que es mujer es " + dos.esChica);
        System.out.println(
                "La persona es: " + tres.nombre + " tiene " + tres.edad + " años y el que es mujer es " + tres.esChica);
        System.out.println(
                "La persona es: " + cuatro.nombre + " tiene " + cuatro.edad + " años y el que es mujer es "
                        + cuatro.esChica);

        System.out.println();
        System.out.println("Clase Libro: ");
        Libro one = new Libro();
        Libro two = new Libro();
        Libro three = new Libro();
        Libro four = new Libro();

        System.out.println(
                "El libro es " + one.titulo + " del año " + one.año_public + " autor " + one.autor + "  ISBN "
                        + one.ISBN);

        two.titulo = "Necronomicon";
        two.año_public = "1545";
        two.autor = "El monje loco";
        two.ISBN = "8983";

        three.titulo = "BALDOR";
        three.año_public = "1864";
        three.autor = "Baldor Jimenez";
        three.ISBN = "79899";

        four.titulo = "Koalas asesinos";
        four.año_public = "2000 A.C.";
        four.autor = "Askualajam Maham";
        four.ISBN = "14546";

        System.out.println(
                "El libro es " + two.titulo + " del año " + two.año_public + " autor " + two.autor + "  ISBN "
                        + two.ISBN);
        System.out.println(
                "El libro es " + three.titulo + " del año " + three.año_public + " autor " + three.autor + "  ISBN "
                        + three.ISBN);
        System.out.println(
                "El libro es " + four.titulo + " del año " + four.año_public + " autor " + four.autor + "  ISBN "
                        + four.ISBN);

        System.out.println();
        System.out.println("Clase Rectangulo: ");
        Rectangulo first = new Rectangulo(5, 4, "Azul");
        Rectangulo second = new Rectangulo(7.5, 5.4, "Amarillo");
        Rectangulo third = new Rectangulo(23.5, 7.9, "Morado");
        Rectangulo fourth = new Rectangulo(12, 24.7, "Rojo");

        first.Area();
        first.Perimetro();
        second.Area();
        second.Perimetro();
        third.Area();
        third.Perimetro();
        fourth.Area();
        fourth.Perimetro();

    }
}
