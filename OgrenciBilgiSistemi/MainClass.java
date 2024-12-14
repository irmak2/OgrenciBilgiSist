package OgrenciBilgiSistemi;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Öğrenci ismini giriniz: ");
        String isim=s.nextLine();

        System.out.println("Öğrenci soyismini giriniz: ");
        String soyisim=s.nextLine();

        System.out.println("Öğrenci emailini giriniz: ");
        String email=s.nextLine();

        Student student=new Student(isim,soyisim,email);
        StudentManagementSystem studentManagementSystem=new StudentManagementSystem();
       studentManagementSystem.ekle(student);
       studentManagementSystem.listele(student);

        System.out.println("Öğrenci bilgileri güncellenecek mi?");
String yanit=s.nextLine();
if (yanit.equals("evet")){
    System.out.print("Öğrencinin ismi: ");
    String isim2=s.nextLine();

    System.out.println("Öğrencinin soyisimini giriniz: ");
    String soyisim2 = s.nextLine();

    System.out.println("Öğrencinin emailini giriniz: ");
    String email2 = s.nextLine();
studentManagementSystem.güncelle(student,isim2,soyisim2,email2);
}
        System.out.println("Öğrenci silinecek mi?: ");
        yanit= s.nextLine();

        if (yanit.equalsIgnoreCase("evet")) {
            studentManagementSystem.silme(student);
        }
    }
}
