public class AccessingOutSidePackage extends practice.Access {
    public static void main(String[] args) {
        AccessingOutSidePackage obj = new AccessingOutSidePackage();

        System.out.println(obj.x);
        // System.out.println(obj.y);// Error due to Private member access
        System.out.println(obj.z);
        // System.out.println(obj.zz);
    }
}
