public class point {
        public int abs;
        public int ord;
        public static int nombre = 0;
        public int numero;
        public point() {
            this.abs = 0;
            this.ord = 0;
            nombre++;
            this.numero = nombre;
        }

        public point(int u, int v) {
            this.abs = u;
            this.ord = v;
            nombre++;
            this.numero = nombre;
        }

        public void affichepoint() {
            System.out.println("point " + numero + " : Coordonnées (" + abs + ", " + ord + ")");
        }

        public boolean origine() {
            return (abs == 0 && ord == 0);
        }

        public boolean egale(point q) {
            return (this.abs == q.getAbs() && this.ord == q.getOrd());
        }

        public void setCoordonnepoint(point p) {
            this.abs = p.getAbs();
            this.ord = p.getOrd();
        }

        public point symetrie() {
            return new point(-abs, -ord);
        }

        public int getAbs() {
            return abs;
        }

        public int getOrd() {
            return ord;
        }


        public int getNumero() {
            return numero;
        }

        public static int getNombre() {
            return nombre;
        }
    }

