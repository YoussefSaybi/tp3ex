public class testperson {
        public static void main(String[] args) {
            person person1 = new person("Doe", "John", 15, 6, 1985);

            System.out.println("Nom: " + person1.getname());
            System.out.println("Prénom: " + person1.getfirstName());
            System.out.println("Date de naissance: " + person1.getdayNaiss() + "/" + person1.getmonthNaiss() + "/" + person1.getyearNaiss());

            int age = person1.ageEn2023();
            if (age >= 0) {
                System.out.println("Âge en 2023: " + age + " ans");
            } else {
                System.out.println("Date de naissance invalide.");
            }

            person1.setName("Smith");
            person1.setFirstName("Jane");
            person1.setDateNaiss(20, 8, 1990);
            System.out.println("Nouveau nom: " + person1.getname());
            System.out.println("Nouveau prénom: " + person1.getfirstName());
            System.out.println("Nouvelle date de naissance: " + person1.getdayNaiss() + "/" + person1.getmonthNaiss() + "/" + person1.getyearNaiss());
        }
    }



