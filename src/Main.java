import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Créer un objet Exercise1
        Exercise1 item = new Exercise1(
                LocalDate.of(2024, 12, 31), // Date d'expiration
                true,                       // Approuvé pour la consommation
                123                         // ID de l'inspecteur
        );

        // Tester la méthode isEdible()
        boolean edible = item.isEdible();
        System.out.println("Is the item edible? " + edible);
    }
}
