package keyone.to.keytwo.dialog;

public class BadClass {
    private final int field1;
    private final int field2;
    private final int field3;
    private final int field4;
    private final int field5;
    private final int field6;
    private final int field7;

    public BadClass(int field1, int field2, int field3, int field4, int field5) {
        this(field1, field2,field3,field4, field5,0,0);
    }

    public BadClass(int field1, int field2, int field3, int field4) {
        this(field1, field2,field3,field4,0);
    }

    public BadClass(int field1, int field2, int field3) {
        this(field1, field2,field3,0);
    }

    public BadClass(int field1, int field2) {
        this(field1, field2,0);
    }

    public BadClass(int field1, int field2, int field3, int field4, int field5, int field6, int field7) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
        this.field4 = field4;
        this.field5 = field5;
        this.field6 = field6;
        this.field7 = field7;
    }
}
