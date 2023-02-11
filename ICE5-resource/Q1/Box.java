public class Box {
    private int length;
    private int breadth;


    private int height;

    public Box(int height, int breadth, int length) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }



    public String toString() {
        return "height: " + this.height + ", breadth:" + this.breadth + ", length: " + this.length;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        return true;
    }

    public Box clone() {

        return new Box(this.height, this.breadth, this.length);
    }
}
