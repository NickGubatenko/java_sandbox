public class Tank implements VehicleInterface, GunInterface {
    @Override
    public void start(){
        System.out.println("Tank Engine started");
    }

    @Override
    public void accelerate(){
        System.out.println("Acceleration");
    }

    @Override
    public void brake(){
        System.out.println("Speed down");
    }

    @Override
    public void stop(){
        System.out.println("Stopped");
    }

    @Override
    public void load() {
        System.out.println("Shell is loaded");
    }

    @Override
    public void fire() {
        System.out.println("Tank FIRE");
    }

    @Override
    public void aim() {
        System.out.println("Lock target");
    }
}

