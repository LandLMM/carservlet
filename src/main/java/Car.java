public class Car {

    private String carModel;

    private String carType;

    private Integer year;


    public Car(String carModel, String carType, Integer year) {
        this.carModel = carModel;
        this.carType = carType;
        this.year = year;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
