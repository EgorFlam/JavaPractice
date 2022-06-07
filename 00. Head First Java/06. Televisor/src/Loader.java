public class Loader {
    public static void main(String[] args) {
        TV bigTV = new TV();
        System.out.println("TV starts: " + bigTV.getTurnOn());
        bigTV.setPlaySong("RHCP - Californication");
        System.out.println("TV shows the song: " + bigTV.getPlaySong());
        bigTV.setPlayShow("New show with Nataly Portman");
        System.out.println("TV shows: " + bigTV.getPlayShow());
        bigTV.setPlayShow("Mama-mia");
        bigTV.setPlaySong("Love me tender");
        System.out.println("TV shows a song: " + bigTV.getPlaySong());

    }

}
