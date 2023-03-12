public class CommonStringFUnction {
    public static void main(String[] args) {
        String str="Hello I think Programming is interesting";
        char[] ch={'a','z','h','a','r'};
        System.out.println("CharAt(0) \t:"+str.charAt(0));
        System.out.println("codePointAt(1) \t:"+str.codePointAt(1));
        System.out.println("codePointBefore(1) \t:"+str.codePointBefore(1));
        System.out.println("codePointCount(start,end) \t:"+str.codePointCount(0,str.length()));
        System.out.println("compareTo('hello') \t:"+str.compareTo("hello"));
        System.out.println("concat('hello') \t:"+str.concat("hello"));
        System.out.println("contains('Hello') \t:"+str.contains("Hello"));
        System.out.println("toUpperCase() \t:"+str.toUpperCase());
        System.out.println("toLowerCase() \t:"+str.toLowerCase());
        System.out.println("trim() \t:"+str.trim());
        System.out.println("replaceAll(He,OO) \t:"+str.replaceAll("He","OO"));
        System.out.println("isEmpty() \t:"+str.isEmpty());
        System.out.println("intern() \t:"+str.intern());
        System.out.println("hashCode() \t:"+str.hashCode());
        System.out.println("getBytes() \t:"+str.getBytes());
        System.out.println("copyValueOf() \t:"+(str=str+String.copyValueOf(ch,0,5)));
    }
}
