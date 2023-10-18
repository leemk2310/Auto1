package Training;

public class Student {
    public static void main(String[] args) throws InterruptedException {
        class student1 {
            String name;
            int age;

            public void display() {
                System.out.println("My name is" + name);

            }

        }
        class getInformation {
            public static void show() {
                student1 Show1 = new student1();
                Show1.name = "Khanh";
                Show1.display();

            }
        }

    }
}
