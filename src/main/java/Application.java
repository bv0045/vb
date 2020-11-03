import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class Application {

    static int a = 1;

private final static Logger LOG = LogManager.getLogger("Основной класс приложения");


    public static void main(String[] args) {
        LOG.fatal("fatal");
        LOG.error("error");
        LOG.warn("warn");
        LOG.info("info");
        LOG.debug("debug");
        LOG.trace("trace");






      /*  int[][] ints = new int[3][2];
        ints[0][0] = 1;
        ints[0][1] = 1;

        ints[1][0] = 2;
        ints[1][1] = 2;

        ints[2][0] = 3;
        ints[2][1] = 3;

        System.out.println("===start===");
        for (int i = 0; i < 3; i++) {
            for (int a = 0; a < 2; a++) ;
            System.out.println("current" + ints[i][a]);
        }



    /*   List<List<String>> strings = new ArrayList<>();
        //создаем лист
        List<String> listOne = new ArrayList<>();

        listOne.add("String 1");
        listOne.add("String 2");
        listOne.add("String 3");
        listOne.add("String 4");

        strings.add(listOne);


    }
}
/*


      /*  List<User> users = new ArrayList<>();
       */
        Map<String, User> userMap = new TreeMap<>();



        User admin = new User("admin", "123123");
        User businessA = new User("businessA","123123");
        User customer = new User("customer", "123123");


        userMap.put("admin", admin);
        userMap.put("businessA", businessA);
        userMap.put("customer", customer);

        userMap.get("admin");
        for (String username : userMap.keySet()) {
            System.out.println(username.toUpperCase());
            System.out.println("current");
            System.out.println("user id ");
            userMap.get(username).printId();
            userMap.get(username).printCurrentDate();

        }


    }
}
        /*
// помещаем в список
        users.add(admin);
        users.add(businessA);
        users.add(customer);

        for (User user : users) {
            System.out.println("current");
            System.out.println("login: " + user.getUsername());
            System.out.println("password: " + user.getPassword(true));
        }
                }
}

/*
        Calc calc = new Calc();
        System.out.println("===START====");
        System.out.println("Result:" + calc.sum("2.6", 4));
        System.out.println("===FINISH====");


*/

       // Variables v = new Variables();

// int b = 10;
   /*
        if(b < 40) {
            System.out.println("yes");
        } else if(b==40)
            System.out.println("equal");
        else {
            System.out.println("no");
        }
        */
   /*v.a = 40;
        switch (v.a){
            case 40:
                System.out.println("equal");
                break;
            case 10:
                System.out.println("Yes");
                break;
            default:
                System.out.println("no");
        }

// System.out.println(v);*/
   // }
//}
