import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Tendjera {
    List<Qice> qica = new ArrayList<Qice>();
    String nivo;

    public Tendjera(){
        qica = new ArrayList<>();
    }

    public void dobaviQiceKumTendjera(){
        qica.add(new Qice());
    }

    public void svari(String nivo){
        System.out.println("Qicata se varqt");
        this.nivo = nivo;
    }

    public void izvadiQica(){
        System.out.println("Qicata sa izvadeni");
    }
}
