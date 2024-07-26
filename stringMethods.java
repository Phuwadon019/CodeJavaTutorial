public class stringMethods {
    public static void main(String[] args) {
        String message = "Java is great fun";
/*         เมดธอดพื้นฐาน
        1.toUpperCase()ปรับค่าข้อความให้เป็นตัวพิมพ์ใหญ่
        2.toLowerCase()ปรับค่าข้อความให้เป็นตัวพิมพ์เล็ก
        3.length() เก็บความของสตริง นับจำนวนตัวอักษร
        4.charAt(2) บอกให้เก็บตัวอักษรตามตำแหน่ง */


        String upper = message.toUpperCase();
        System.out.println(upper);

        String lower = message.toLowerCase();
        System.out.println(lower);

        int length = message.length();
        System.out.println(length);

        char letter = message.charAt(0);
        System.out.println(letter);
    }
}
