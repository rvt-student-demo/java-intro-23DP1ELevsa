package lv.rvt;

public class Engine extends Part {

    private String engineType;

    public Engine(String engineType, String identifier, String manufacturer, String description) {
        // Izsaucam Part klases konstruktoru
        super(identifier, manufacturer, description);
        this.engineType = engineType;
    
    }

    public String getEngineType() {
        return engineType;
    }
}