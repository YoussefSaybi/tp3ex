public class Testpoint {
        public static void main(String[] args) {
            point p1 = new point(2, 3);
            point p2 = new point(-1, -4);
            point p3 = new point();

            p1.affichepoint();
            p2.affichepoint();
            p3.affichepoint();

            System.out.println("Est-ce que p1 est à l'origine ? " + p1.origine());
            System.out.println("Est-ce que p2 est à l'origine ? " + p2.origine());

            System.out.println("Est-ce que p1 est égal à p2 ? " + p1.egale(p2));

            point p4 = p1.symetrie();
            p4.affichepoint();

            System.out.println("Nombre de points créés : " + point.getNombre());
        }
    }
