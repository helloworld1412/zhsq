package com.monster.zhaqsq.bean;

public class UserAdress {
	

    public UserAdress() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserAdress(Integer id, Integer uid, String adress, String userName) {
		super();
		this.id = id;
		this.uid = uid;
		this.adress = adress;
		this.userName = userName;
	}
	
    private Integer id;

    private Integer uid;

    private String adress;

    private String userName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress == null ? null : adress.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }
}