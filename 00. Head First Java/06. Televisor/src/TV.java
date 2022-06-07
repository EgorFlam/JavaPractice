public class TV {
    private double turnOn;
    private double turnOf;
    private String playShow;
    private String playSong;
    private String status;


    public TV() {
        turnOn = 7.00;
        turnOf = 23.00;
        playShow = "Show";
        playSong = "Son";
    }

    public double getTurnOn() {
        return turnOn;
    }

    public void setTurnOn(double turnOn) {
        this.turnOn = turnOn;
    }

    public double getTurnOf() {
        return turnOf;
    }

    public void setTurnOf(double turnOf) {
        this.turnOf = turnOf;
    }

    public String getPlayShow() {
        return playShow;
    }

    public void setPlayShow(String playShow) {
        this.playShow = playShow;
    }

    public String getPlaySong() {
        return playSong;
    }

    public void setPlaySong(String playSong) {
        this.playSong = playSong;
    }

}
