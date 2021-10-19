package myhomework7;

public class Que_15 {
    private double widh;
    private double height;

    public Que_15() {

    }

    public Que_15(double widh, double height) {
        if (widh > 0 && height < 0) {
            this.height = 0;
            this.widh = widh;
        } else if (widh < 0 && height > 0) {
            this.height = height;
            this.widh = 0;
        } else if (widh < 0 && height < 0) {
            this.height = 0;
            this.widh = 0;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getWidh() {
        return widh;
    }

    public void setWidh(double widh) {
        if (widh < 0) {
            this.widh = 0;

        } else {
            this.widh = widh;

        }
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
        }
    }public static void main(String[]args){
        Que_15 wall=new Que_15(5,4);
        System.out.println("heigh="+wall.getHeight());
        System.out.println("wide="+ wall.getWidh());
    }
}