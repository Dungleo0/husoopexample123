package lab10.builderpattern.pseudocode;

public class Manual {
    private String manualText;

    public String getManualText() {
        return manualText;
    }

    public void setManualText(String manualText) {
        this.manualText = manualText;
    }
    @Override
    public String toString() {
        return "Manual{" +
                "manualText='" + manualText + '\'' +
                '}';
    }
}
