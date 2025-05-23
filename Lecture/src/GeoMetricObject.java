public abstract class GeoMetricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    protected GeoMetricObject() {
        dateCreated = new java.util.Date();
    }
    protected GeoMetricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

}
