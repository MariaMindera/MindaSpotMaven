package actions.artist;

import com.mindera.school.music.services.ArtistService;
import com.mindera.school.music.ui.Action;
import com.mindera.school.music.ui.Request;

import java.sql.SQLException;

import static com.mindera.school.music.services.Services.ARTIST_SERVICE;

public class PrintMusicArtistAction implements Action {
    private ArtistService artistService;

    public PrintMusicArtistAction() {
        this.artistService = ARTIST_SERVICE;
    }

    @Override
    public void execute() throws SQLException {
        Request request = new Request();
        request.hasString("Name", "Insert the name of the artist: ");
        artistService.printAllMusics(request.ask().get(0).getValue().toString());
    }
}
