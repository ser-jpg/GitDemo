package comparable;

public class Ogrenci implements Comparable<Ogrenci> {

    private String isim;
    private int id;

    public Ogrenci(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    @Override
    public String toString() {
        return "||||Isim: "+isim+"||||ID: "+id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Ogrenci ogrenci) {
        if(this.id<ogrenci.getId()){
            return -1;

        }
        else if(this.id>ogrenci.getId()){

            return 1;
        }
        return 0;
    }
}
