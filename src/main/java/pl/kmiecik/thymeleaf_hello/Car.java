package pl.kmiecik.thymeleaf_hello;

import java.util.StringJoiner;

public class Car {
    private String  mark;
    private String model;

    public Car(String mark, String model) {
        this.mark = mark;
        this.model = model;
    }

    public Car() {

    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Car.class.getSimpleName() + "[", "]")
                .add("mark='" + mark + "'")
                .add("model='" + model + "'")
                .toString();
    }
}
