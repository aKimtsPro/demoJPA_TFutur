package bstrom.akim.demoJPA;

import bstrom.akim.demoJPA.entities.RacePokemon;

import java.util.Optional;

public class DemoOptional {

    public static void main(String[] args) {

        RacePokemon poke = RacePokemon.builder()
                .numeroPokedex(1)
                .nom("bulbizarre")
                .build();

        // Creation d'Optional

        Optional<RacePokemon> optVide = Optional.empty();
        Optional<RacePokemon> optRempli = Optional.of(poke);
        Optional<RacePokemon> optOnSaitPas = Optional.ofNullable(null);

        // Récupérer la valeur à l'intérieur

        RacePokemon poke2 = optRempli.get(); // crash si l'optional est vide
        poke2 = optRempli.orElse(new RacePokemon()); // Donne un backup si l'optional est vide
        poke2 = optRempli.orElseGet(RacePokemon::new); // Donne une methode pouvant creer un backup si l'optional est vide
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
