public class TapeDeckTestDrive {
    public static void main(String[] args) {
        TapeDeck t = new TapeDeck();
        t.canRecord = false;

        if (t.canRecord == true) {
            t.recordTape();
        }
        else if (t.canRecord == false){
            t.playTape();
        }
    }
}
