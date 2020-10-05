package ru.mirea.Practice06._1;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2)
    {
        return s1.getPoints()-s2.getPoints();
    }
}
