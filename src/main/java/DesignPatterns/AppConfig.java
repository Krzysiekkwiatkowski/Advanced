package DesignPatterns;

public class AppConfig {

    private static AppConfig INSTANCE;

    private AppConfig() {
    }

    public static AppConfig getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new AppConfig();
        }
        return INSTANCE;
    }
}
