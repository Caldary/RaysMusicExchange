package accessories;

import behaviours.ISell;

public abstract class Accessories implements ISell {

    private String type;
    private String description;
    private int acquired;

    public Accessories(String type, String description, int acquired){
        this.type = type;
        this.description = description;
        this.acquired = acquired;
    }

    public int getAcquired() {
        return acquired;
    }

    public void setAcquired(int acquired) {
        this.acquired = acquired;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
