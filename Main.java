import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    TestovClass testovClass = new TestovClass();
    testovClass.Testvai();

    }
}

class TestovClass {
    Biblioteka biblioteka = new Biblioteka();

    public void Testvai(){

        biblioteka.VkaraiKniga(new Kniga("Kniga", "Steven King", "Publikator1", 2003, 12345));
        biblioteka.VkaraiKniga(new Kniga("Kniga2", "Steven King", "Publikator2", 2013, 12412));
        biblioteka.VkaraiKniga(new Kniga("Kniga3", "George", "Publikator3", 1999, 23455));

        System.out.println(biblioteka.vzemiStringNaKnigi());

        biblioteka.PremahniKnigiPoAvtor("Steven King");

        System.out.println("-----------------------------------------");
        System.out.println(biblioteka.vzemiStringNaKnigi());
    }


}

class Biblioteka {

    private String Name;
    private ArrayList<Kniga> Knigi;

    public Biblioteka(){
        Knigi = new ArrayList<>();
    }
    public ArrayList<Kniga> VsichkiKnigi() {
        return Knigi;
    }



    public void VkaraiKniga(Kniga book){
        if(book != null) {
            Knigi.add(book);
        }
    }

    public ArrayList<Kniga> VzemiKnigiOtAvtor(String avtor){
        ArrayList<Kniga> KnigiOtAvtor = new ArrayList<>();

        for (Kniga kniga : Knigi){
            if (kniga.getAvtor() == avtor){
                KnigiOtAvtor.add(kniga);
            }
        }

        return KnigiOtAvtor;
    }

    public String BookString(long ISBN){
        for (Kniga kniga : Knigi){
            if (kniga.getISBN() == ISBN)

                return kniga.getAvtor() + "\n" + kniga.getZaglavie() + "\n" + kniga.getPublikator() + "\n" + kniga.getGodina() + "\n"  + kniga.getISBN();
        }

        return "Nqma Takava Kniga";
    }

    public String vzemiStringNaKnigi(){
        String stringknigi = new String();
        for (Kniga kniga : Knigi){
            stringknigi += kniga.getAvtor() + "\n" + kniga.getZaglavie() + "\n" + kniga.getPublikator() + "\n" + kniga.getGodina() + "\n"  + kniga.getISBN();
        }

        return stringknigi;
    }

    public void PremahniKnigiPoAvtor(String avtor){
            ArrayList<Kniga> AvtorKnigi = new ArrayList<>();

            for (Kniga kniga1 : Knigi){
                if (kniga1.getAvtor() == avtor){
                    AvtorKnigi.add(kniga1);
                }
            }

            Knigi.removeAll(AvtorKnigi);
    }
}


class Kniga {

    private int godina;
    private long ISBN;
    private String zaglavie;
    private String avtor;
    private String publikator;

    public Kniga(String zaglavie, String avtor, String publikator, int godina, long ISBN){
        setZaglavie(zaglavie);
        setAvtor(avtor);
        setPublikator(publikator);
        setGodina(godina);
        setISBN(ISBN);
    }


    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public String getZaglavie() {
        return zaglavie;
    }

    public void setZaglavie(String zaglavie) {
        this.zaglavie = zaglavie;
    }

    public String getAvtor() {
        return avtor;
    }

    public void setAvtor(String avtor) {
        this.avtor = avtor;
    }

    public String getPublikator() {
        return publikator;
    }

    public void setPublikator(String bookPublisher) {
        publikator = bookPublisher;
    }

}

