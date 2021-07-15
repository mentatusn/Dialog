package keyone.to.keytwo.dialog;


public class GoodClass {
    private final int field1;
    private final int field2;
    private final int field3;
    private final int field4;
    private final int field5;
    private final int field6;
    private final int field7;

    public GoodClass(Builder builder) {
        field1 = builder.field1;
        field2 = builder.field2;
        field3 = builder.field3;
        field4 = builder.field4;
        field5 = builder.field5;
        field6 = builder.field6;
        field7 = builder.field7;
    }

    public static class Builder {
        private final int field1;
        private final int field2;
        private int field3 = 0;
        private int field4 = 0;
        private int field5 = 0;
        private int field6 = 0;
        private int field7 = 0;

        public Builder(int field1, int field2) {
            this.field1 = field1;
            this.field2 = field2;
        }

        public Builder setField3(int field3) {
            this.field3 = field3;
            return this;
        }

        public Builder setField4(int field4) {
            this.field4 = field4;
            return this;
        }

        public Builder setField5(int field5) {
            this.field5 = field5;
            return this;
        }

        public Builder setField6(int field6) {
            this.field6 = field6;
            return this;
        }

        public Builder setField7(int field7) {
            this.field7 = field7;
            return this;
        }

        public GoodClass build(){
            return new GoodClass(this);
        }
    }
}
