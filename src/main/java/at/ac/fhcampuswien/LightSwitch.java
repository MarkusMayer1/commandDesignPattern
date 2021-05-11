package at.ac.fhcampuswien;

public class LightSwitch extends Command {
    private Light light;
    private boolean lightIsOff;

    public LightSwitch(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        if (lightIsOff) {
            light.lightOff();
            lightIsOff = false;
        } else {
            light.lightOn();
            lightIsOff = true;
        }
    }
}
