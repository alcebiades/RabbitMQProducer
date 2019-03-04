package com.area.models;

//@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class,
//        property = "@id", scope = Person.class)
public class Person  {

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder()
                .append("Employee [")
                .append("name=\"")
                .append(name).append("\"")
                .append(",age=")
                .append(age)
                .append("]");
        return builder.toString();
    }
}