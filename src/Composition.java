public class Composition {
    private Tank battleTank;
    private Gun battleArtillery;

    Composition(){
        this.battleArtillery = new Gun();
        this.battleTank = new Tank();
    }

    void fire() {
        battleTank.fire();
        battleArtillery.fire();
    }
}
