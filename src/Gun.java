public class Gun implements GunInterface{
    @Override
    public void load() {
        System.out.println("GUN IS LOADED");
    }

    @Override
    public void fire() {
        System.out.println("GUN FIRE");
    }

    @Override
    public void aim() {
        System.out.println("GUN IS AIMING");
    }
}
