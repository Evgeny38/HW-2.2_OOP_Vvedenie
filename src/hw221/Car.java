package hw221;

public class Car {
    String brand;
    String model;
    double volumeDrive;
    String color;
    int yearMade;
    String madeCountry;

    public Car(String brand, String model, double volumeDrive, String color, int yearMade, String madeCountry) {
        this.brand = brand;
        this.model = model;
        this.volumeDrive = volumeDrive;
        this.color = color;
        this.yearMade = yearMade;
        this.madeCountry = madeCountry;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        }else {
            this.brand = "default";
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        }else {
            this.model = "default";
        }
    }

    public double getVolumeDrive() {
        return volumeDrive;
    }

    public void setVolumeDrive(double volumeDrive) {
//        if (volumeDrive == null) {
//            this.volumeDrive = 1.5;
//        }else {
            this.volumeDrive = volumeDrive;
//        }

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null && !color.isEmpty() && !color.isBlank()) {
            this.color = color;
        }else {
            this.color = "Белый";
        }
    }

    public int getYearMade() {
        return yearMade;
    }

    public void setYearMade(int yearMade) {
//        if (yearMade = 0) {
            this.yearMade = yearMade;
//        }else {
//            this.yearMade = 2000;
//        }
    }

    public String getMadeCountry() {
        return madeCountry;
    }

    public void setMadeCountry(String madeCountry) {
        if (madeCountry != null && !madeCountry.isEmpty() && !madeCountry.isBlank()) {
            this.madeCountry = madeCountry;
        }else {
            this.madeCountry = "default";
        }
    }

    @Override
    public String toString() {
        return "Марка: " + brand +
                ", модель: " + model +
                ", Объём двигателя: " + volumeDrive +
                ", Цвет кузова: " + color +
                ", Год производства: " + yearMade +
                ", Страна производства: " + madeCountry + ".";
    }
}
