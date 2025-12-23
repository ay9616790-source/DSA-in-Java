package opps;

public class Banking {
    public static void main(String[] args) {
        //Constructer
        BankAccount myAcc=new BankAccount();
        myAcc.userName="Abhishek";
        System.out.println(myAcc.userName);
        myAcc.setPassword("anjnjnv4543564");
        System.out.println(myAcc.printPassword());
        myAcc.setNomani("Nikke");
        System.out.println(myAcc.printNomani());

    }

}
class BankAccount{
    public  String userName;
    private String password;
    private String Nomani;
    // password ko print karyanan ke liya
    String printPassword(){
         return this.password;
    }
    String printNomani(){
        return this.Nomani;
    }
    //Function
    void setNomani(String Nomani){
        this.Nomani=Nomani;
    }
    //function
    public void setPassword(String pws){
        password=pws;
    }

}
