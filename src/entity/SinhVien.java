package entity;

public class SinhVien {
    public static String university = "Fpt";
    private String fullName;
    private int age;
    private String maJor;

    public SinhVien() {
    }

    public SinhVien(String fullName, int age, String maJor) {
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMaJor() {
        return maJor;
    }

    public void setMaJor(String maJor) {
        this.maJor = maJor;
    }
}
