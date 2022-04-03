public class Main {
    public static void main(String[] args) {
        Composition army = new Composition(new Gun(), new Tank());
        TempSensorWithAlarm ts = new TempSensorWithAlarm("text in message param");

        System.out.println(ts.getTemperature());
        ts.setTemperatureAlarmThreshold(125);
        ts.run();
    }
}
