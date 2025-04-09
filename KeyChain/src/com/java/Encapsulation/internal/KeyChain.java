package com.java.Encapsulation.internal;

public class KeyChain {
    private String material = "Metal";
    private int numberOfKeys = 5;
    private boolean hasRemoteAccess = false;
    private String color = "Silver";
    private String ownerName = "Alex";

    public KeyChain() {
        System.out.println("KeyChain object created!");
    }

    void setMaterial(String material) {
        this.material = material;
    }

    void setNumberOfKeys(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }

    void setHasRemoteAccess(boolean hasRemoteAccess) {
        this.hasRemoteAccess = hasRemoteAccess;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getMaterial() {
        return material;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public boolean getHasRemoteAccess() {
        return hasRemoteAccess;
    }

    public String getColor() {
        return color;
    }

    public String getOwnerName() {
        return ownerName;
    }
}
