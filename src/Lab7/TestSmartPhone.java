package Lab7;
public class TestSmartPhone {
    public static void main(String[] args) {
        // สร้างออบเจ็กต์ SmartPhone
        Smartphone phone = new Smartphone();
        // ตั้งค่าเริ่มต้นให้กับสมาร์ทโฟน
        System.out.println("กำลังตั้งค่าข้อมูลสมาร์ทโฟนเริ่มต้น...");
        phone.setBrand("SmartMobile");
        phone.setModel("W1000");
        phone.setStorageCapacity(256);
        // แสดงรายละเอียดสมาร์ทโฟน
        System.out.println("\nข้อมูลสมาร์ทโฟนเบื้องต้น:");
        phone.printDetails();
        // เพิ่มความจุด้วยค่า valid
        System.out.println("\nเพิ่มความจุหน่วยความจำ 100 GB...");
        phone.increaseStorage(100); // เพิ่มความจุสำเร็จ
        // เพิ่มความจุด้วยค่า invalid (เกินขีดจำกัด)
        System.out.println("\nพยายามเพิ่มความจุหน่วยความจำ 200 GB...");
        phone.increaseStorage(200); // ไม่สำเร็จ: เกินขีดจำกัด
        // เพิ่มความจุด้วยค่า invalid (ค่าติดลบ)
        System.out.println("\nพยายามเพิ่มความจุหน่วยความจำ -50 GB...");
        phone.increaseStorage(-50); // ไม่สำเร็จ: ค่าติดลบ
        // คำนวณพื้นที่หน่วยความจำที่เหลือ (valid used storage)
        System.out.println("\nคำนวณพื้นที่หน่วยความจำที่เหลือ โดยใช้ไปแล้ว 120 GB...");
        int remainingStorage = phone.getRemainingStorage(120); // คำนวณสำเร็จ
        if (remainingStorage != -1) {
            System.out.println("พื้นที่ที่เหลือ: " + remainingStorage + " GB");
        }
        // คำนวณพื้นที่หน่วยความจำที่เหลือ (invalid used storage)
        System.out.println("\nคำนวณพื้นที่หน่วยความจุที่เหลือ โดยใช้ไปแล้ว 500 GB...");
        phone.getRemainingStorage(500); // ไม่สำเร็จ: เกินความจุ
        // ทดสอบการตั้งค่าที่ไม่ถูกต้อง (brand และ model)
        System.out.println("\nตั้งค่าแบรนด์และรุ่นด้วยค่าที่ไม่ถูกต้อง... ");
        phone.setBrand(""); // ไม่สำเร็จ: แบรนด์สั้นเกินไป
        phone.setModel("A"); // ไม่สำเร็จ: รุ่นสั้นเกินไป
        // ทดสอบการตั้งค่าความจุที่ไม่ถูกต้อง
        System.out.println("\nตั้งค่าความจุหน่วยความจุที่ไม่ถูกต้อง... ");
        phone.setStorageCapacity(600); // ไม่สำเร็จ: เกินขีดจำกัด
        // แสดงรายละเอียดสมาร์ทโฟนหลังการตั้งค่าต่างๆ
        System.out.println("\nข้อมูลสมาร์ทโฟนสุดท้าย:");
        phone.printDetails();
    }
}