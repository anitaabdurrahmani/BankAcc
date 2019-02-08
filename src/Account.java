public abstract class Account implements IRate{

    String name;
    String sSN;
    static int index=1000;

    String accountNumber;
    double rate;
    double balance;

    public Account(String name, String sSN, double initDeposit) {

        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;


        index++;
        this.accountNumber = setAccountNumber();
        setRate();
    }
    public abstract void setRate();



        // set acc number



       private String setAccountNumber(){
        String lastTwoOfSSN = sSN.substring(sSN.length()-2);
        int uniqueID=index;
        int randomNumber = (int)(Math.random()*Math.pow(10,3));
        return lastTwoOfSSN + uniqueID + randomNumber;
        }

        public void showInfo(){
            System.out.println("name: " + name + "\nAccount Number: " + "\nBalance:" + balance + "\nRate: "
            + rate + "%");


        }
        }
