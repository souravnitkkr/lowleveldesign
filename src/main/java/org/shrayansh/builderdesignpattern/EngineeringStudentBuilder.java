package org.shrayansh.builderdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects() {
        List<String> subjects=new ArrayList<>();
        subjects.add("C++");
        subjects.add("Java");
        subjects.add("Python");
        this.subjects=subjects;
        return this;
    }
}
