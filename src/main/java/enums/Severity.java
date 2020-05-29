package enums;

public enum Severity {
    LOW(3){
        @Override
        public String getColor() {
            return "WHITE";
        }
    },
    MEDIUM(1){
        @Override
        public String getColor() {
            return "YELLOW";
        }
    },
    HIGH(1){
        @Override
        public String getColor() {
            return "RED";
        }
    };

    int sLevel;

    //The enum constructor must be either private or package scope (default).
    // You cannot use public or protected constructors for a Java enum.
    Severity(int s){
        this.sLevel=s;
    }

    public int getsLevel(){
        return this.sLevel;
    }

    // yu can create an abstract method for your enums if you have constant based implementation
    public abstract String getColor();

}

