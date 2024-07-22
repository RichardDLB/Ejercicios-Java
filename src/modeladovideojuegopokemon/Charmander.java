
package modeladovideojuegopokemon;

public class Charmander extends Pokemon implements IFuego{

    public Charmander() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Charmander Ataque Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Charmander Atacar araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Charmander Atacar mordisco");
    }

    @Override
    public void atacarPunioJuego() {
        System.out.println("Charmander Atacar punio juego");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Charmander Atacar lanza llamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Charmander Atacar ascuas");        
    }
    
}
