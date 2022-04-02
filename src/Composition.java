public class Composition {
    private final Tank battleTank = new Tank();
    private final Gun battleArtillery = new Gun();

    void fire() {
        battleTank.fire();
        battleArtillery.fire();
    }
}
