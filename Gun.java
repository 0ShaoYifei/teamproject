public class Gun {
    private String name;
    private double price;
    private String category;
    private String description;
    private long damage;
    private long penetratingpower;
    private long range;
    private String ammunitionload;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAmmunitionload() {
        return ammunitionload;
    }

    public void setAmmunitionload(String ammunitionload) {
        this.ammunitionload = ammunitionload;
    }

    public long getRange() {
        return range;
    }

    public void setRange(long range) {
        this.range = range;
    }

    public long getPenetratingpower() {
        return penetratingpower;
    }

    public void setPenetratingpower(long penetratingpower) {
        this.penetratingpower = penetratingpower;
    }

    public long getDamage() {
        return damage;
    }

    public void setDamage(long damage) {
        this.damage = damage;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gun(String name, double price, String category, String description, long damage, long penetratingpower, long range, String ammunitionload) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
        this.damage = damage;
        this.penetratingpower = penetratingpower;
        this.range = range;
        this.ammunitionload = ammunitionload;
    }

    public String toString() {
        return "Gun{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", damage=" + damage +
                ", penetratingpower=" + penetratingpower +
                ", range=" + range +
                ", ammunitionload='" + ammunitionload + '\'' +
                '}';
    }

    public Gun() {
    }
}


