package OgrenciBilgiSistemi;
public class StudentManagementSystem{

   public void ekle(Student student){

       System.out.println(student.getIsim()+" Öğrenci eklendi.");
    }
    public void listele(Student student){

       System.out.println(student.toString()+ "Öğrenciler bilgileri.");
    }
    public void güncelle(Student student, String isim2, String soyisim2, String email2) {
        student.setIsim(isim2);
        student.setSoyisim(soyisim2);
        student.setEmail(email2);
        System.out.println("Öğrenci bilgileri güncellendi: " + student.toString());
    }
     public void silme(Student student){
        System.out.println( student.getIsim() +"Öğrenci silindi");
    }
}
