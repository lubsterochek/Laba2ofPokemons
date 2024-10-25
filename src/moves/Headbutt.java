package moves;

import ru.ifmo.se.pokemon.*;

public class Headbutt extends PhysicalMove {

    public Headbutt(){
        type = Type.NORMAL;
        power = 70;
        accuracy = 100;
        priority = 15;
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.3) {
            Effect.flinch(p);
            System.out.println(p + " вздрагивает!");
        }
    }

    @Override
    protected String describe() {
        return "бьет головой";
    }
}
