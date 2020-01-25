package actions.user;

import com.mindera.school.music.ui.Action;

import java.sql.SQLException;

public class RegisterAction implements Action {
    public RegisterAction() {
    }

    @Override
    public void execute() throws SQLException {
        new AddUserAction().execute();
    }
}
