public class Checking extends Account {

    //list properties specific to a checking acc

    int debitCardNumber;
    int debitCardPIN;
    //constructor to initialize checking acc properties

    public Checking(String name, String sSN, double initDeposit){
        super(name, sSN, initDeposit);
        accountNumber= "2" + accountNumber;
        setDebitCard();

    }


    private void setDebitCard(){
        debitCardNumber =(int)( Math.random()*Math.pow(10,12));
        debitCardPIN=(int)( Math.random()*Math.pow(10,4));
    }
    @Override
    public void setRate(){
        rate = getBaseRate()* .15;
    }

    public void showInfo(){

        super.showInfo();
        System.out.println("Your checking account features " +
                "\n Debit Card Number: " + debitCardNumber +
                "\n Debit Card Pin: " + debitCardPIN);
    }

    //list any methods specific to the checking acc


}

