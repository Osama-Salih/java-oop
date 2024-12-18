public class Math {
    int val;

    public Math(int val) {
        this.val = val;
    }

    public Math() {}
    Math add(Math n2) {
        Math n3 = new Math();
        n3.val = this.val + n2.val;
        return n3;
    }

    boolean isEqual(Math n2) {
        return this.val == n2.val;
    }
} 
