import java.util.Vector;

public class dataLogin {
    public static boolean studentAccess = false, staffAccess = false;
    public static Vector<String> uNameStaff = new Vector<String>();
    public static Vector<String> passStaff = new Vector<String>();

    public static Vector<String> uNameStudent = new Vector<String>();
    public static Vector<String> passStudent = new Vector<String>();

    public static void userCache() {
        addUserStaff();
        addUserStudent();
    }

    public static void addUserStaff() {
        // ID 0
        uNameStaff.add("Bambang39");
        passStaff.add("12345");
        // ID 1
        uNameStaff.add("heru39");
        passStaff.add("54321");

    }

    public static void addUserStudent() {
        // ID 0
        uNameStudent.add("ase");
        passStudent.add("12345");
        // ID 1
        uNameStudent.add("esa");
        passStudent.add("54321");
    }

}
