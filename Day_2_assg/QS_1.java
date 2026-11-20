class Course {
    int id;
    String name;
    int fee;

    Course(int id, String name, int fee)
    {
        this.id = id;
        this.name = name;
        this.fee = fee;
    }
}

public class Main {
    public static void main(String[] args) {

ArrayList<Course> list = new ArrayList<>();

list.add(new Course(101, "Java", 15000));
list.add(new Course(102, "Python", 12000));
list.add(new Course(103, "React", 15000));
list.add(new Course(104, "SQL", 8000));
list.add(new Course(105, "Angular", 12000));
Collections.sort(list, new Comparator<Course>() {
    public int compare(Course a, Course b) {
        return a.fee - b.fee;
  }
});
System.out.println("Fee Low to High:");
for (Course c : list) {
System.out.println(c.id + " " + c.name + " " + c.fee);
}


Collections.sort(list, new Comparator<Course>() {
   public int compare(Course a, Course b) {
      return b.fee - a.fee;
}
});

System.out.println("\nFee High to Low:");
for (Course c : list) {
System.out.println(c.id + " " + c.name + " " + c.fee);
}

Collections.sort(list, new Comparator<Course>() {
public int compare(Course a, Course b) {
     return a.name.compareTo(b.name);
}
});
System.out.println("\nName A to Z:");
for (Course c : list) {
System.out.println(c.id + " " + c.name + " " + c.fee);
    }
  }
}
