class Bank {
    void interestRate() {
        System.out.println("General bank interest");
    }
}

class SBI extends Bank {
  
    void interestRate() {
        System.out.println("SBI interest rate: 7%");
    }
}

class HDFC extends Bank {
    
    void interestRate() {
        System.out.println("HDFC interest rate: 8%");
    }
}

public class checkBank {
    public static void main(String[] args) {
        Bank b;

        b = new SBI();
        b.interestRate();

        b = new HDFC();
        b.interestRate();
    }
}
