package application.forms;

import data.User;

import javax.validation.constraints.NotNull;

public class MessageForm {

    @NotNull
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
