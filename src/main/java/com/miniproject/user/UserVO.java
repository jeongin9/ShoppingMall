package com.miniproject.user;

public class UserVO {
    private String id;
    private String pass;
    private String name;
    private String nickname;
    private String phone;
    
    public UserVO(String id, String pass, String name, String nickname, String phone) {
        this.id = id;
        this.pass = pass;
        this.name = name;
        this.nickname = nickname;
        this.phone = phone;
    }

  
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    
    public String getPass() { return pass; }
    public void setPass(String pass) { this.pass = pass; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public String getNickname() { return nickname; }
    public void setNickname(String nickname) { this.nickname = nickname; }
    
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
}