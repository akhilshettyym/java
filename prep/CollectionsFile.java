package akhilshettyym.JAVA.prep;

// import java.util.Set;
// import java.util.Map;
import java.util.List;
// import java.util.HashSet;
// import java.util.HashMap;
// import java.util.TreeSet;
// import java.util.Iterator;
import java.util.ArrayList;
import java.util.Comparator;
// import java.util.Collection;
import java.util.Collections;

class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age = " + age + ", name = " + name + "]";
    }
}

public class CollectionsFile {
    public static void main(String[] args) {

        /* Collection ArrayList */
        // Collection<Integer> nums = new ArrayList<Integer>();
        // nums.add(1);
        // nums.add(2);
        // nums.add(3);
        // nums.add(4);

        // for(int n: nums) {
        // System.out.println(n);
        // }

        /* List - prints duplicates */
        // List<Integer> nums = new ArrayList<Integer>();
        // nums.add(1);
        // nums.add(2);
        // nums.add(3);
        // nums.add(4);

        // // System.out.println("In index :", nums.get(1));
        // // System.out.println("Index of :", nums.indexOf(4));

        // for(Object n : nums) {
        // int num = (Integer)n;
        // System.out.println(num);
        // }

        /* Set - prints unique, no duplicate elements */
        // Set<Integer> nums = new HashSet<Integer>();
        // nums.add(16);
        // nums.add(22);
        // nums.add(3);
        // nums.add(43);
        // nums.add(4);
        // nums.add(4);

        // for(int n : nums) {
        // System.out.println(n);
        // }

        /* TreeSet - prints unique, and sorted elements */
        // Set<Integer> nums = new TreeSet<Integer>();
        // nums.add(16);
        // nums.add(22);
        // nums.add(3);
        // nums.add(43);
        // nums.add(4);
        // nums.add(4);

        // for(int n : nums) {
        // System.out.println(n);
        // }

        // Iterator<Integer> values = nums.iterator();

        // while(values.hasNext()){
        // System.out.println(values.next());
        // }

        /* keys are set and values are list */
        // Map<String, Integer> students = new HashMap<String, Integer>();
        // students.put("akhil", 29);
        // students.put("shetty", 39);
        // students.put("mackhil", 49);

        // Keys are unique and this won't printed
        // students.put("mackhil", 49);

        // System.out.println(students);
        // System.out.println(students.get("mackhil"));
        // System.out.println(students.keySet());

        // for(String key : students.keySet()){
        // System.out.println(key + " : " + students.get(key));
        // }

        /* Sorting */
        // List<Integer> nums = new ArrayList<>();
        // nums.add(43);
        // nums.add(31);
        // nums.add(72);
        // nums.add(80);

        // Collections.sort(nums);
        // System.out.println(nums);

        /* Sorting with comparator */
        // Comparator<Integer> com = new Comparator<Integer>() {
        // public int compare(Integer i, Integer j) {
        // if(i%10 > j%10) {
        // return 1;
        // } else {
        // return -1;
        // }
        // }
        // };

        // List<Integer> nums = new ArrayList<>();
        // nums.add(43);
        // nums.add(31);
        // nums.add(72);
        // nums.add(80);

        // Collections.sort(nums, com);
        // System.out.println(nums);

        // Comparator<Student> com = new Comparator<Student>() {
        // public int compare(Student i, Student j) {
        // if(i.age > j.age) {
        // return 1;
        // } else {
        // return -1;
        // }
        // }
        // };

        /* Comparator with lamba */
        Comparator<Student> com = (i, j) -> i.age > j.age ? 1 : -1;
        List<Student> studs = new ArrayList<>();
        studs.add(new Student(21, "akhil"));
        studs.add(new Student(12, "shetty"));
        studs.add(new Student(13, "mackhil"));

        Collections.sort(studs, com);

        for (Student s : studs) {
            System.out.println(s);
        }
    }
}