package music.Java;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class RecentlyPlayedSongs {
    private int capacity;
    private Map<String, LinkedList<String>> song1;

    public RecentlyPlayedSongs(int capacity) {
        this.capacity = capacity;
        this.song1 = new HashMap<String, LinkedList<String>>();
    }

    public void addSong(String user, String song) {
        if (!song1.containsKey(user)) {
        	song1.put(user, new LinkedList<String>());
        }
        LinkedList<String> playlist = song1.get(user);
        if (playlist.size() == capacity) {
            playlist.removeFirst();
        }
        playlist.addLast(song);
    }

    public List<String> getRecentlyPlayed(String user) {
        if (song1.containsKey(user)) {
            return song1.get(user);
        }
        return new LinkedList<String>();
    }

public static void main (String[]args){
RecentlyPlayedSongs song = new RecentlyPlayedSongs(3);

song.addSong("userID", "S1");
song.addSong("userID", "S2");
song.addSong("userID", "S3");

//output: [S1, S2, S3]
System.out.println(song.getRecentlyPlayed("userID"));  

//output: [S2, S3, S4]
song.addSong("userID", "S4");
System.out.println(song.getRecentlyPlayed("userID"));  

//output: [S3, S4, S2]
song.addSong("userID", "S2");
System.out.println(song.getRecentlyPlayed("userID"));  

//output: [S4, S2, S1]
song.addSong("userID", "S1");
System.out.println(song.getRecentlyPlayed("userID"));  

}

}
