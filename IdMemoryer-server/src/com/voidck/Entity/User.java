package com.voidck.Entity;

public class User {
    private String loginAccount;
    private String loginPassword;
    private Boolean loginResult;
    private Double phone;

    public User(String loginAccount, String loginPassword){
        this.loginAccount = loginAccount;
        this.loginPassword = loginPassword;
    }

    public User(String loginAccount, Double phone){
        this.loginAccount = loginAccount;
        this.phone = phone;
    }

    public User() {

    }

    public String getLoginAccount() {
        return loginAccount;
    }

    public void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public Boolean getLoginResult() {
        return loginResult;
    }

    public void setLoginResult(Boolean loginResult) {
        this.loginResult = loginResult;
    }

    public Double getPhone() {
        return phone;
    }

    public void setPhone(Double phone) {
        this.phone = phone;
    }


}
