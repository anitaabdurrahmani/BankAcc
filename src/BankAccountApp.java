public class BankAccountApp {

    public static void main(String[] args ){

        // read a CVS file then create new acc based on that data

        Checking ch1 = new Checking("tom whitey","293848342",1500);

        Savings s1 = new Savings("rich loe","987345634",2500);

        s1.showInfo();

        System.out.println("*************");

        ch1.showInfo();

    }

}
