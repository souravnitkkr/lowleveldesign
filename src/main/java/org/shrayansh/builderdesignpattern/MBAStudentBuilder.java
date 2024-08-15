package org.shrayansh.builderdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects() {
        List<String> subjects=new ArrayList<>();
        subjects.add("Maths");
        subjects.add("Economics");
        subjects.add("Accounts");
        this.subjects=subjects;
        return this;
    }
}
