package actions.music;

import com.mindera.school.music.services.MusicService;
import com.mindera.school.music.ui.Action;
import com.mindera.school.music.ui.Request;

import java.sql.SQLException;

import static com.mindera.school.music.services.Services.MUSIC_SERVICE;

public class UnlikeMusicAction implements Action {
    private MusicService musicService;

    public UnlikeMusicAction() {
        this.musicService = MUSIC_SERVICE;
    }

    @Override
    public void execute() throws SQLException {
        Request request = new Request();
        request.hasString("Name", "What is the name of the music?");
        musicService.removeLikeMusic(request.ask().get(0).getValue().toString());
    }
}
