public class Composition {
    private Tank battleTank;
    private Gun battleArtillery;

    Composition(Gun battleArtillery, Tank battleTank){
        this.battleArtillery = battleArtillery;
        this.battleTank = battleTank;
    }

    void fire() {
        battleTank.fire();
        battleArtillery.fire();
    }
}
