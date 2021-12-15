import com.katyusco.padroes.adpater.servicos.Fio;

public class ClientePlugParaTomada2Pinos {

    private Fio pinoFase;
    private Fio pinoNeutro;

    public ClientePlugParaTomada2Pinos(Fio pinoFase, Fio pinoNeutro) {
        this.pinoFase = pinoFase;
        this.pinoNeutro = pinoNeutro;
    }

    public void plugaAdaptador(){
        Adaptador2Para3Pinos adaptador = new Adaptador2Para3Pinos(this.pinoFase, this.pinoNeutro);
        adaptador.forneceEnergia();
    }

    public static void main(String[] args) {

        ClientePlugParaTomada2Pinos plug2Pinos = new ClientePlugParaTomada2Pinos(Fio.FASE, Fio.NEUTRO);
        plug2Pinos.plugaAdaptador();

    }


}
