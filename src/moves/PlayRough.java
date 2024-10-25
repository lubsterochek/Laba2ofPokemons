package moves;
import ru.ifmo.se.pokemon.*;

public class PlayRough extends PhysicalMove {

    public PlayRough(){
        type = Type.FAIRY;
        power = 90;
        accuracy = 90;
        priority = 10;
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        p.addEffect(new Effect().chance(0.1).stat(Stat.ATTACK, -1));
        System.out.println(p + " потерял 1 уровень атаки!");
    }

    @Override
    protected String describe() {
        return "действует атакой Play Rough";
    }
}
