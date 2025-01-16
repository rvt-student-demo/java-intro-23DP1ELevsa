package lv.rvt.connecticut;

public class Part {

    private String identifier;
    private String manufacturer;
    private String description;

    public Part(String identifier, String manufacturer, String description) {
        this.identifier = identifier;
        this.manufacturer = manufacturer;
        this.description = description;
    }

    // protected
    // ir neredzams priekš visām klasēm, izņemot sub klases, vai nu child klases
    protected String getPartId() {
        return "5252525252";
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getDescription() {
        return description;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}