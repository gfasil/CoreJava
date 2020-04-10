
public class User {

    String name;
    String id;
    static ROLE role;

    static void add() {

    }

    public User(String name, String id, ROLE role) {
        // this(name);
        this(name, id);
        this.role = role;
    }

    public User() {

    }

    public User(String name) {
        this.name = name;
    }

    public User(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" + "name='" + name + '\'' + ", id='" + id + '\'' + ", role=" + role + '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ROLE getRole() {
        return this.role;
    }

    public void setRole(ROLE role) {
        this.role = role;
    }

    public static void changeName(User u, String name) {

        u.setName(name);
    }

    public static void main(String[] args) {

        // new User();

        User fasil = new User("fasil", "64827", ROLE.FACULTY);

        if (fasil.getRole().equals(ROLE.STUDENT)) {

            System.out.print(fasil.getName() + " is logged in as a student");
        } else if (fasil.getRole().equals(ROLE.ADMIN)) {

            System.out.print(fasil.getName() + " is logged in as a ADMIN");
        } else if (fasil.getRole().equals(ROLE.FACULTY)) {
            System.out.print(fasil.getName() + " is logged in as a FACULITY");
        }
        ROLE role = fasil.getRole();
        switch (role) {

            case FACULTY:
                System.out.print(fasil.getName() + " is logged in as a FACULITY");
                break;
            case ADMIN:
                System.out.print(fasil.getName() + " is logged in as a ADMIN");
                break;
            case STUDENT:
                System.out.print(fasil.getName() + " is logged in as a student");
                break;
            default:
                System.out.print(fasil.getName() + " is not a user");
                break;
        }
        User lamin = new User("lamin");

        System.out.println("\n before calling method " + lamin.getName());

        changeName(lamin, "janka");

        System.out.println("after calling method " + lamin.getName());
        String s1 = "fasil";
        String s2 = "fasil";

        String str3 = new String("Hello");
        String str4 = new String("Hello");
        String str5 = str4;
        System.out.println("result " + str3.equals(str4));
        Answerable ans = new Answerable() {
            @Override
            public String answer(String input) {
                return input + " brother";
            }
        };
        Answerable a = (inp) -> "\n hello" + inp;

        UserRole u = new UserRole();
        System.out.println(ans.answer("hello") + a.answer(" woooow"));
    }

    public static class UserRole {

        public UserRole() {
            ROLE r = User.role;
        }

    }
}
