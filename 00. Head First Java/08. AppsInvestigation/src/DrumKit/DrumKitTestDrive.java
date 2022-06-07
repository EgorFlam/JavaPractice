package DrumKit;

public class DrumKitTestDrive {
    public static void main(String[] args) {
        DrumKit d = new DrumKit();
        d.share = false;
        d.playShare();
        d.playTopHat();

        if (d.share == true) {
            d.playShare();
        }

    }
}
