
public class SmartTV {

    public boolean ligada = true;
    public int canal = 21;
    public int volume = 25;

    public void Ligar(){
        ligada = true;
    }
    public void Desligar(){
        ligada = false;
    }
    public void aumentarVolume(){
        volume += 1;
    }
    public void diminuirVolume(){
        volume -= 1;
    }
    public void aumentarCanal(){
        canal += 1;
    }
    public void diminuirCanal(){
        canal -= 1;
    }
    public void escolherCanal(int canal){
        this.canal = canal;
    }
}

