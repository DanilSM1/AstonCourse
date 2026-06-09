package Module1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class Student {

    private final String name;
    private final List<String> objects;
    private final Date dateOfCreate;

    public Student(String name, List<String> objects, Date dateOfCreate) {
        this.name = name;
        this.objects = new ArrayList<>(objects);
        this.dateOfCreate = new Date(dateOfCreate.getTime());
    }

    public String getName() {
        return name;
    }

    public List<String> getObjects() {
        return List.copyOf(objects);
    }

    public Date getDateOfCreate() {
        return new Date(dateOfCreate.getTime());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", objects=" + objects +
                ", dateOfCreate=" + dateOfCreate +
                '}';
    }
}
