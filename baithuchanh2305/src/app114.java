import java.util.HashMap;
import java.util.Scanner;
public class App114 {
  public static void main(String[] args){
    HashMap<String, Student> hashMap = new HashMap<String, Student>();
    Scanner scanner = new Scanner(System.in);
    hashMap.put("1", new Student("2021050842", "Ninh Thi Chieu Xuan", "E2"));
    hashMap.put("2", new Student("2021050776", "Vu Thi Mai Chi", "E2"));
    hashMap.put("3", new Student("2021050764", "Tran Thi Hanh", "E1"));
    hashMap.put("4", new Student("2021050898", "Tran Dieu linh", "E1"));

    String lopCanTim;
    System.out.println("Nhap lop can tim");
    lopCanTim = scanner.nextLine();
    for(int i=0; i< hashMap.size(); i++){
      if(hashMap.get(i).getLop().equals(lopCanTim));
        hashMap.get(i).hienThi();
    }

    String maSinhVienCanTim;
    System.out.println("Nhap ma sinh vien can tim");
    maSinhVienCanTim = scanner.nextLine();
    for(int i=0; i< hashMap.size(); i++){
      if(hashMap.get(i).getMaSinhVien().equals(maSinhVienCanTim));
        hashMap.get(i).hienThi();
    }
  }
}
class Student{
  private String maSinhVien;
  private String hoTen;
  private String lop;

  public Student() {
  }

  public Student(String maSinhVien, String hoTen, String lop) {
      super();
      this.maSinhVien = maSinhVien;
      this.hoTen = hoTen;
      this.lop = lop;
  }

  public String getMaSinhVien() {
      return maSinhVien;
  }

  public void setMaSinhVien(String maSinhVien) {
      this.maSinhVien = maSinhVien;
  }

  public String getHoTen() {
      return hoTen;
  }

  public void setHoTen(String hoTen) {
      this.hoTen = hoTen;
  }

  public String getLop() {
      return lop;
  }

  public void setLop(String lop) {
      this.lop = lop;
  }
  public void hienThi(){
    System.out.println("Ma sinh vien: " + maSinhVien);
    System.out.println("Ho va ten " + hoTen);
    System.out.println("Lop: " + lop);
  }

  @Override
  public String toString() {
      return "Student@Ma Sinh Vien: " + maSinhVien + ",Ho Ten: " + hoTen + ",lop: " + lop;
  }
}