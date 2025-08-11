package set.exercicioSet2.entities;

import java.util.Objects;

public class Courses {

    private Integer codStudent;

    public Courses(Integer codStudent) {
        this.codStudent = codStudent;
    }

    public Integer getCodStudent() {
        return this.codStudent;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Courses courses = (Courses) o;
        return Objects.equals(codStudent, courses.codStudent);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codStudent);
    }
}
