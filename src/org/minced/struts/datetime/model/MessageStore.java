package org.minced.struts.datetime.model;

/**
 * Created by rob on 9/25/16.
 * Message Store from Tutorial. Unused.
 */
public class MessageStore {

    private String message;

    public MessageStore() {

        setMessage("Hello Struts User");
    }

    public String getMessage() {
        return message;
    }

    private void setMessage(String message) {
        this.message = message;
    }

}