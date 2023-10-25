package Training;

class Student {
    String name;
    int age;
    float height;
    public static String universityName = "Kteam Education";
    static int total = 0;

    public Student(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
        total += 1;
    }

    public static void main(String[] args) throws InterruptedException {
        Student a = new Student("Chau", 21, 1.7f);
        System.out.println("University (from class):" + Student.universityName);
        System.out.println("University (from instance):" + a.universityName);
        System.out.println("University (from instance):" + a.universityName);

        System.out.println("Total (from class):" + Student.total);
        Student b = new Student("Long", 24, 1.7f);
        System.out.println("Total (from instance):" + b.total);

        System.out.println("My name is " + a.name +" " + a.age );




    }
}



