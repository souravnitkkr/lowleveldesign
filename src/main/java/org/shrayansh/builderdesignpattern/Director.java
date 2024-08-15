package org.shrayansh.builderdesignpattern;

public class Director {
    StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

   public Student createStudent(){
        if(studentBuilder instanceof EngineeringStudentBuilder){
            return createEngineeringStudent();
        }
        else if(studentBuilder instanceof MBAStudentBuilder){
            return createMBAStudent();
        }else{
            return null;
        }
   }

    public Student createEngineeringStudent(){
        return studentBuilder.setRollNumber(10).setName("Rahul").setAge(24).setFatherName("Ram").setSubjects().build();
    }

    public Student createMBAStudent(){
        return studentBuilder.setRollNumber(11).setName("Raj").setAge(26).setFatherName("Ravi").setSubjects().build();
    }
}
