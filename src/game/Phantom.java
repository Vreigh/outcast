package game;
import java.util.ArrayList;

public final class Phantom extends Unit {
    
    public Phantom(){
        super();
        super.setSpeed(80);
        
        super.power.bind(super.powerUp.multiply(10).add(25));
        super.health.bind(super.healthUp.multiply(30).add(120));
        super.shield.bind(super.shieldUp.multiply(15).add(10));
        
        super.tmpHealth.set(health.get());
    }
    
    public void mainAbility(ArrayList<Unit> units, Monster monster){
        
    }
    public String getMainAbilityName(){
        return "Power Shift";
    }
    public void secondAbility(ArrayList<Unit> units, Monster monster){
        
    }
    public String getSecondAbilityName(){
        return "Freeze";
    }
    public void ultAbility(ArrayList<Unit> units, Monster monster){
        
    }
    public String getUltAbilityName(){
        return "Psychic Scream";
    }
    public String getName(){
        return "Phantom";
    }
}
