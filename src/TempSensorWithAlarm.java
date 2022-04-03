/**
 * Датчик температуры с сигнализацией
 */
public class TempSensorWithAlarm {
    private int temperature;
    private int temperatureAlarmThreshold = 255; // инициализация заведомо ложным значением
    private boolean isTempHasBeenRead = false; // признак того, что температуру считали и в поле temperature есть данные

    TempSensorWithAlarm() {
        System.out.println("Default constructor");
    }

    TempSensorWithAlarm(String initMessage) {
        System.out.println("Constructor with init message and sensor read: " + initMessage);
        readTemperatureFromSensor();
    }

    public boolean isSensorDataReady() {
        return isTempHasBeenRead;
    }

    public int getTemperature() {
        if (isSensorDataReady()) {
            return temperature;
        } else {
            return 255;
        }
    }

    /**
     *
     * @param temperature - alarm threshold
     * @return
     *  0 - success
     * -1 - error, temperature is out of range
     */
    public int setTemperatureAlarmThreshold(int temperature) {
        int HIGH_THRESHOLD_LIMIT = 150;
        int LOW_THRESHOLD_LIMIT = -50;
        if (temperature < HIGH_THRESHOLD_LIMIT &
            temperature > LOW_THRESHOLD_LIMIT) {
            temperatureAlarmThreshold = temperature;
            return 0;
        }
        else {
            return -1;
        }
    }

    private void readTemperatureFromSensor() {
        // тут как будто происходит чтение физического датчика
        isTempHasBeenRead = true; // установили признак того, что данные считаны
        temperature = 123; // 123 это то, что как будто считали с датчика
    }

    private void alarmCheck() {
        if (isTempHasBeenRead) {
            if (temperature > temperatureAlarmThreshold) {
                System.out.println("ALARM!!!");
            }
        }
    }

    // execute run() continuously in thread
    private void run() {
        readTemperatureFromSensor();
        alarmCheck();
    }
}
