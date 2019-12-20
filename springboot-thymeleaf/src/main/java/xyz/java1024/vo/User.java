package xyz.java1024.vo;

import java.io.Serializable;

/**
 * @author xivin
 * @email 1250402127@qq.com
 * @description
 * @date 2019/12/20
 */
public class User implements Serializable {

    private int id;

    private String username;
    private String sex;
    private String city;
    private String sign;
    /*
    积分
     */
    private int experience;
    /**
     * 分数
     */
    private int score;
    /**
     * 财富
     */
    private String classify;
    private long wealth;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public long getWealth() {
        return wealth;
    }

    public void setWealth(long wealth) {
        this.wealth = wealth;
    }
}
