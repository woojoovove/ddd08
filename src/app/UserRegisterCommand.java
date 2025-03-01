package app;

import domain.model.UserName;

public class UserRegisterCommand {
    private final UserName userName;

    public UserRegisterCommand(UserName userName) {
        this.userName = userName;
    }

    public UserName getUserName() {
        return userName;
    }
}
