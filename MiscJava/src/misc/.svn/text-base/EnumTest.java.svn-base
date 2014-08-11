package misc;

public class EnumTest {

    private enum LOAN {

        HOME_LOAN {
            @Override
            public String toString() {
                return "Always look for cheaper Home loan";
            }
        },
        AUTO_LOAN {
        	
            @Override
            public String toString() {
                return "Cheaper Auto Loan is better";
            }
        },
        PERSONAL_LOAN{
            @Override
            public String toString() {
                return "Personal loan is not cheaper any more";
            }
        }
    }


	public static void main2(String[] args) {
     
        //Exmaple of String to Enum in Java
        LOAN homeLoan = LOAN.HOME_LOAN;
        System.out.println(homeLoan);
        LOAN autoLoan = LOAN.valueOf("AUTO_LOAN");
        System.out.println(autoLoan);
        LOAN personalLoan = LOAN.valueOf("PERSONAL_LOAN");
        System.out.println(personalLoan);
     
    }
    public static void main(String[] args) {
        
        //Exmaple of Enum to String in Java
        String homeLoan = LOAN.HOME_LOAN.name();
        System.out.println(homeLoan);
        String autoLoan = LOAN.AUTO_LOAN.name();
        System.out.println(autoLoan);
        String personalLoan = LOAN.PERSONAL_LOAN.name();
        System.out.println(personalLoan);     
    }


}