import java.util.ArrayList;
import java.util.List;

public class Main06 {
    public static void main(String[] args) {
        // Criando uma lista de Animal
        List<Animal> animais = new ArrayList<>();

        // Adicionando instâncias de cada subclasse
        animais.add(new Cachorro());
        animais.add(new Gato());
        animais.add(new Vaca());

        // Iterando sobre a lista e invocando emitirSom() para cada animal
        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}
