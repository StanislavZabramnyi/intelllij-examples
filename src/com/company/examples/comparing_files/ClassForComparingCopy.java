package com.company.examples.comparing_files;

import java.time.LocalDate;

public class ClassForComparingCopy {

    private String name;

    private String version;

    private LocalDate date;

    public ClassForComparingCopy(String name, String version, LocalDate date) {
        this.name = name;
        this.version = version;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClassForComparingCopy that = (ClassForComparingCopy) o;

        if (!name.equals(that.name)) return false;
        if (!version.equals(that.version)) return false;
        return date.equals(that.date);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + version.hashCode();
        result = 31 * result + date.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "ClassForComparing{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                ", date=" + date +
                '}';
    }
}
