package com.example.likai.getmyphonenumber;

/**
 * Created by likai on 15/7/7.
 */
public class PhoneInfo {
    private String phoneNum;
    private String phoneName;

    public PhoneInfo(String phoneName, String phoneNum) {
        setPhoneName(phoneName);
        setPhoneNum(phoneNum);
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
