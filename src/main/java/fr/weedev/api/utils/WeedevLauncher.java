package fr.weedev.api.utils;

public class WeedevLauncher {

    private String LauncherName;

    public WeedevLauncher(String LauncherName) {
        this.LauncherName = LauncherName;
    }

    public String getLauncherName() {
        return this.LauncherName;
    }

    public void setLauncherName(String LauncherName) {
        this.LauncherName = LauncherName;
    }
}
