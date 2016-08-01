package com.telpa.ecommerce.network;

/**
 * Created by SAMSUNGNB on 1.08.2016.
 */
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Musterus {

    @SerializedName("ID")
    @Expose
    private String iD;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("surname")
    @Expose
    private String surname;
    @SerializedName("mail")
    @Expose
    private String mail;

    /**
     *
     * @return
     * The iD
     */
    public String getID() {
        return iD;
    }

    /**
     *
     * @param iD
     * The ID
     */
    public void setID(String iD) {
        this.iD = iD;
    }

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     *
     * @param surname
     * The surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     *
     * @return
     * The mail
     */
    public String getMail() {
        return mail;
    }

    /**
     *
     * @param mail
     * The mail
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

}
