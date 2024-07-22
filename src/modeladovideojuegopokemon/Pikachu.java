
package modeladovideojuegopokemon;

public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu() {
    }
     
    @Override
    protected void atacarPlacaje() {
        System.out.println("Pikachu Ataque Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Pikachu Ataque araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Pikachu Ataque araniazo");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Pikachu Ataque impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Pikachu Ataque punio trueno");
    }
    
}
