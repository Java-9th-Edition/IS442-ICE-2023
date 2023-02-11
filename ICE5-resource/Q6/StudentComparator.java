import java.util.Comparator;
public class StudentComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        int compareName = o1.getName().compareTo(o2.getName());
        if (compareName == 0){
            int compareAge = o1.getAge() - o2.getAge();
            return compareAge;
        }
        return compareName;
    }
}
