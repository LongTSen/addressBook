//Info class
package com.company;

public class info {
    private String first;
    private String last;
    private String phone;
    private String email;
    private String dateOfBirth;

    public info(String first, String last, String phone, String email, String dateOfBirth) {
        this.first = first;
        this.last = last;
        this.phone = phone;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
}
