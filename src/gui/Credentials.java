/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

/**
 *
 * @author ziamdriel03
 */
public class Credentials {
    private static String username;
    private static String password;
    private static String gender;
    private static String firstname;
    private static String lname;

    // Methods to set the username and password
    public static void setUsername(String u) {
        username = u;
    }

    public static void setPassword(String p) {
        password = p;
    }
    public static void setGender(String g) {
        gender = g;
    }
    public static void setFirstname(String f){
        firstname = f;
    }
    public static void setLname(String l){
        lname = l;
    }
    // Methods to get the username and password
    public static String getUsername() {
        return username;
    }

    public static String getPassword() {
        return password;
    }
     public static String getGender() {
        return gender;
    }
       public static String getFirstname() {
        return firstname;
    }
       public static String getLname(){
           return lname;
       }
}
/*package gui;

public class Credentials {
    private String username;
    private String password;
    private String gender;
    private String firstname;
    private String lname;

    // Constructor to initialize all fields
    public Credentials(String username, String password, String gender, String firstname, String lname) {
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.firstname = firstname;
        this.lname = lname;
    }

    // Getters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getGender() {
        return gender;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLname() {
        return lname;
    }

    // Setters
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
}*/

