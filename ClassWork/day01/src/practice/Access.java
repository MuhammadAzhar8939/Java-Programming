package practice;

public class Access {
    public int x = 10;//access any where
    private int y = 20;//only this class can access
    protected int z = 30;//only this class its subclasses and inside package can be used
    int zz = 40;//can be used any where
}

class AccessingSpecifier extends Access {
    public static void main(String[] args) {
        AccessingSpecifier obj = new AccessingSpecifier();
        System.out.println(obj.x);
        // System.out.println(obj.y);//Error due to Private member access
        System.out.println(obj.z);
        System.out.println(obj.zz);
    }
}
