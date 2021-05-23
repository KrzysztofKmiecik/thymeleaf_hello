package pl.kmiecik.thymeleaf_hello;

import java.util.StringJoiner;

public class Car {
    private Long id;
    private String  mark;
    private String model;

    public Car(Long id, String mark, String model) {
        this.id = id;
        this.mark = mark;
        this.model = model;
    }

    public Car() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
                .add("id=" + id)
                .add("mark='" + mark + "'")
                .add("model='" + model + "'")
                .toString();
    }
}
