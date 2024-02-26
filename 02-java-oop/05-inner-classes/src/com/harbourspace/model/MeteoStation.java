package com.harbourspace.model;

public class MeteoStation {

    private final String name;
    private Double[] position;

    // implement versionInfo field
    private VersionInfo versionInfo = new VersionInfo("1.0.0");

    // constructor 1
    public MeteoStation(String subject, Double[] position) {
        name = subject;
        this.position = position;
    }

    // constructor 2
    public MeteoStation(String subject) {
        this.name = subject;
        this.position = null;
    }

    public String getName() {
        return name;
    }

    public Double[] getPosition() {
        return position;
    }

    public void setPosition(Double[] position) {
        this.position = position;
    }

    // implemenet VersionInfo getter


    public VersionInfo getVersionInfo() {
        return versionInfo;
    }

    // implement VersionInfo class
    public static class VersionInfo {

        private String firmware;
        public VersionInfo(String firmware){
            this.firmware = firmware;
        }

        public String getFirmware() {
            return firmware;
        }
    }
}
