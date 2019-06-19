package desingPatterns.Builder;


public class BankAccount {

    private String name;
    private String accountNumber;
    private boolean newsletter;
    private String email;

    private BankAccount(BankAccountBuilder builder){
        this.name = builder.name;
        this.accountNumber = builder.accountNumber;
        this.newsletter = builder.newsletter;
        this.email = builder.email;
    }

    public String getName(){
        return this.name;
    }

    public void SetName(String name){
        this.name = name;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public void SetAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public boolean isNewsletter(){
        return this.newsletter;
    }

    public void SetNewsletter(boolean newsletter){
        this.newsletter = newsletter;
    }

    public void setEmail( String email ) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }


    public static class BankAccountBuilder {

        private String name;
        private String accountNumber;
        private boolean newsletter;
        private String email;

        public BankAccountBuilder(String name, String accountNumber) {
            this.name = name;
            this.accountNumber = accountNumber;
        }

        public BankAccountBuilder withEmail(String email){
            this.email = email;
            return this;
        }

        public BankAccountBuilder wantNewsletter(boolean newsletter){
            this.newsletter = newsletter;
            return this;
        }

        public BankAccount build(){
            return new BankAccount(this);
        }

    }
}


