package com.becomejavasenior.mvc.model;


public enum Gender {
    MAN("MAN"),

    WOMAN("WOMAN");

    private String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    public static Gender fromString(String genderString) {
        if (genderString != null) {
            for (Gender go : Gender.values()) {
                if (genderString.equalsIgnoreCase(go.gender)) {
                    return go;
                }
            }
        }
        return MAN;
    }

    @Override
    public String toString() {
        return gender;
    }
}
