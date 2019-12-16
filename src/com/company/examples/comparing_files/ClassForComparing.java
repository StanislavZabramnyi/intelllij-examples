package com.company.examples.comparing_files;

import java.time.LocalDate;
import java.util.Objects;

public class ClassForComparing {

    private String name;

    private String version;

    private LocalDate date;

    public ClassForComparing(String name, String version, LocalDate date) {
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
        ClassForComparing that = (ClassForComparing) o;
        return name.equals(that.name) &&
                version.equals(that.version) &&
                date.equals(that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, version, date);
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
