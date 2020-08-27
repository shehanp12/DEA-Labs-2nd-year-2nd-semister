package app;

public class Country {
    private   String flag;
    private  String  Name;
    private String FullName;
    private  String Capital;
    private  String Phone_code;
    private  String TLD;
    private String Region;

    public Country(String flag, String name, String fullName, String capital, String phone_code, String TLD, String region) {
        this.flag = flag;
        Name = name;
        FullName = fullName;
        Capital = capital;
        Phone_code = phone_code;
        this.TLD = TLD;
        Region = region;
    }

    public Country() {
    }



    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getCapital() {
        return Capital;
    }

    public void setCapital(String capital) {
        Capital = capital;
    }

    public String getPhone_code() {
        return Phone_code;
    }

    public void setPhone_code(String phone_code) {
        Phone_code = phone_code;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getTLD() {
        return TLD;
    }

    public void setTLD(String TLD) {
        this.TLD = TLD;
    }
}
