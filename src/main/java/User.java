import java.util.Date;

public class User extends Record {

    private String username;
    private String password;
    private Date created;

    private static int countOfUsers = 0;


    public User(String username, String password) {
        super(countOfUsers);
        this.username = username;
        this.password = password;
        this.created = new Date();

        countOfUsers++;

        System.out.println(String.format("created user: %s; created at: %s; current count of users: %s", username, created, countOfUsers));
    }

    public User() {
        super(countOfUsers);
        System.out.println("cr new empty ");
    }


    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public String getPassword(boolean isForReporting) {
        if (isForReporting) {
            return "******";
        } else {
            return password;
        }
    }

    public void setPassword(String password) {
        this.password = password;

    }
        @Override
        public void printId() {
            System.out.println("id: " + this.getId());
            this.printCurrentDate();
        }
    }
