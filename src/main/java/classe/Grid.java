package classe;

import java.util.HashMap;
import java.util.Map;
//TODO melhorar classe
public class Grid {

    public Map<String, String> cerquilha = new HashMap<>();

    public void criarCerquilha(){
        cerquilha.put("1", "1"); cerquilha.put("4", "4"); cerquilha.put("7", "7");
        cerquilha.put("2", "2");  cerquilha.put("5", "5"); cerquilha.put("8", "8");
        cerquilha.put("3", "3");  cerquilha.put("6", "6"); cerquilha.put("9", "9");
    }

    public Grid(){
        criarCerquilha();

    }

    public String jogarRodada(String flagJogada, String casaJogada){
        cerquilha.replace(casaJogada, flagJogada);

        return cerquilha.get(casaJogada);
    }

    public boolean heVazio(String casaJogada){
        boolean vazio;
        if(cerquilha.get(casaJogada) != "X" && cerquilha.get(casaJogada) != "O"){
            vazio = true;
        }else{
            vazio = false;
        }
        return vazio;
    }

    public String gerarCerquilha(){
        String casa1 = this.cerquilha.get("1"); String casa2 = this.cerquilha.get("2");
        String casa3 = this.cerquilha.get("3"); String casa4 = this.cerquilha.get("4");
        String casa5 = this.cerquilha.get("5"); String casa6 = this.cerquilha.get("6");
        String casa7 = this.cerquilha.get("7"); String casa8 = this.cerquilha.get("8");
        String casa9 = this.cerquilha.get("9");

        return String.format("""
                  %s|%s|%s
                  %s|%s|%s
                  %s|%s|%s
                  """, casa1, casa2, casa3 , casa4, casa5, casa6, casa7,
                casa8, casa9);
    }
}
