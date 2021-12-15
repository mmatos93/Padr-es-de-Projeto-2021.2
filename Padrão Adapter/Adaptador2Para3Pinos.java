import com.katyusco.padroes.adpater.servicos.Fio;
import com.katyusco.padroes.adpater.servicos.ServicoTomada3Pinos;

public class Adaptador2Para3Pinos extends ServicoTomada3Pinos implements Tomada3Pinos {


    public Adaptador2Para3Pinos(Fio fioVermelho, Fio fioAzulClaro) {
        super(fioVermelho, fioAzulClaro, fioAzulClaro);
    }

    @Override
    public void Adapta2Para3(Fio fioVermelho, Fio fioAzul) {

        ServicoTomada3Pinos tomada = new ServicoTomada3Pinos(fioVermelho, fioAzul, fioAzul);

    }
}
