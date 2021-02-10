package bstrom.akim.demoJPA;

import bstrom.akim.demoJPA.entities.Pokemon;

import java.util.Comparator;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class DemoOptional {

    public static void main(String[] args) {

        Pokemon poke = Pokemon.builder()
                .numeroPokedex(1)
                .nom("bulbizarre")
                .build();

        // Creation d'Optional

        Optional<Pokemon> optVide = Optional.empty();
        Optional<Pokemon> optRempli = Optional.of(poke);
        Optional<Pokemon> optOnSaitPas = Optional.ofNullable(null);

        // Récupérer la valeur à l'intérieur

        Pokemon poke2 = optRempli.get(); // crash si l'optional est vide
        poke2 = optRempli.orElse(new Pokemon()); // Donne un backup si l'optional est vide
        poke2 = optRempli.orElseGet(Pokemon::new); // Donne une methode pouvant creer un backup si l'optional est vide
        optRempli = optRempli.or(() -> Optional.of(poke)); // Donne une methode pouvant créer un backup de l'optional si il est vide
        poke2 = optRempli.orElseThrow(); // pareil que get
        poke2 = optRempli.orElseThrow(IllegalArgumentException::new); // Si vide -> lance l'exception créée par la lambda

        // Utilities

        optRempli.ifPresent(System.out::println); // si present, execute l'action
        optRempli.ifPresentOrElse(System.out::println, () -> System.out.println("vide")); // si présent exécute le consumer, si vide, le runnable
        optRempli.isPresent(); // verifie si c'est bien rempli
        optRempli.isEmpty(); // verifie si c'est bien vide

        // BONUS - interface fonctionnelles

        // Runnable          -  () -> return void
        // Supplier<T>       -  () -> return type T
        // Consumer<T>       -  (type T) -> return rien
        // Function<T,U>     -  (type T) -> return type U
        // BiFunction<T,U,V> -  (type T, type U) -> return type V
        // Predicate<T>      -  (type T) -> return type boolean
        // UnaryOperator<T>  -  (type T) -> return type T  - extends Function<T,T>
        // BinaryOperator<T> -  (type T, type T) -> return type T - extends Function<T,T,T>

    }
}
