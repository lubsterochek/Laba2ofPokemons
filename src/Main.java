import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        Latias latias = new Latias("Бобик", 1);
        Zigzagoon zigzagoon = new Zigzagoon("Гидроэлектростанция", 1);
        Linoone linoone = new Linoone("Леон", 1);
        Azurill azurill = new Azurill("Спайк", 1);
        Marill marill = new Marill("Ворон", 1);
        Azumarill azumarill = new Azumarill("Юра Ивашкин", 1);

        b.addAlly(azurill);
        b.addAlly(marill);
        b.addAlly(azumarill);
        b.addFoe(latias);
        b.addFoe(zigzagoon);
        b.addFoe(linoone);

        b.go();
    }
}
