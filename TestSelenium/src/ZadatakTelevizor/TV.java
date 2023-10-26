package ZadatakTelevizor;

public class TV {

    private int volume = 0;
    private boolean turnedOn = false;

    private static final int MAX_VOLUME = 20;
    private static final int MIN_VOLUME = 0;

    public TV() {

    }

    public TV (int volume, boolean turnedOn) {
        if (turnedOn) {
            this.volume = volume;
        } else System.out.println("You cannot edit volume level if the TV is turned off!");
    }

    public void onOff() {
        this.turnedOn = !turnedOn;
    }

    public void volumeUp() {
        if (turnedOn && volume < MAX_VOLUME) {
            this.volume++;
        } else if (turnedOn && volume == MAX_VOLUME) {
            System.out.println("TV volume is already on maximum level");
        } else System.out.println("You cannot edit volume level if the TV is turned off!");
    }


    public void volumeDown() {
        if (turnedOn && volume > MIN_VOLUME) {
            this.volume--;
        } else if (turnedOn && volume == MIN_VOLUME) {
            System.out.println("TV volume already reached minimum value");
        } else System.out.println("You cannot edit volume level if the TV is turned off!");
    }

    public boolean isTurnedOn() {
        return this.turnedOn;
    }

    public int getVolume() {
        return this.volume;
    }

    @Override
    public String toString() {
        return "TV{" +
                "volume=" + volume +
                ", turnedOn=" + turnedOn +
                '}';
    }
}
