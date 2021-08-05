package com.example.chatapp.Model;

public class User {

    private String id;
    private String Username;
    private String imageURL;

    public User(String id, String username, String imageURL) {
        this.id = id;
        this.Username = username;
        this.imageURL = imageURL;

    }

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        this.Username = username;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }


}
