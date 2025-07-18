package Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serial {
    public static void main(String[] args) {
        try {
            Student student = new Student("John Doe", 20, "San Francisco");

            FileOutputStream fos = new FileOutputStream("student.txt");

            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(student);
            oos.close();
            fos.close();
            System.out.println("Object has been serialized");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
