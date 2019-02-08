public class Savings extends Account{

    //list properties specific to savings

    int safetyDepositBoxID;
    int safetyDepositBoxKey;

    //constructor to initialize savings properties\

    public Savings(String name, String sSn, double initDeposit) {
        super(name, sSn, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }
    @Override
    public void setRate(){
        rate = getBaseRate() - .25;

    }

    public void setSafetyDepositBox(){
        safetyDepositBoxID =(int) (Math.random()*Math.pow(10,3));
        safetyDepositBoxKey=(int)(Math.random()*Math.pow(10,4));



    }

        public void showInfo() {

            super.showInfo();
            System.out.println("Savings account features " + "\n Safety Deposit Box ID" + safetyDepositBoxID +
                    "\n Safety Deposit Box Key" + safetyDepositBoxKey);

        }






    //list any methods specific to the savings acc
}
