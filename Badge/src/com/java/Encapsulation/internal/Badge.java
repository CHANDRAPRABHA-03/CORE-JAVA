package com.java.Encapsulation.internal;

public class Badge {
    private String badgeId = "B001";
    private String holderName = "Chandra";
    private String accessLevel = "Admin";
    private boolean isActive = true;
    private String department = "IT";

    public Badge() {
        System.out.println("Badge object created!");
    }

    void setBadgeId(String badgeId) {
        this.badgeId = badgeId;
    }

    void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    void setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
    }

    void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    void setDepartment(String department) {
        this.department = department;
    }

    public String getBadgeId() {
        return badgeId;
    }

    public String getHolderName() {
        return holderName;
    }

    public String getAccessLevel() {
        return accessLevel;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public String getDepartment() {
        return department;
    }}
