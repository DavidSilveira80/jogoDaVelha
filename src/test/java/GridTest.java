import classe.Grid;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GridTest {

    @Test
    void geracaoDoGridTest(){
        Grid gridCerquilha  = new Grid();
        System.out.println("Testando geração do grid");
        String expectativa = """
                1|2|3
                4|5|6
                7|8|9
                """;
        String saida = gridCerquilha.gerarCerquilha();
        Assertions.assertEquals(expectativa, saida);
    }

    @Test
    void gerarCerquilha123XTest(){
        Grid grid123X  = new Grid();

        String casa1 = "1";  String casa2 = "2"; String casa3 = "3"; String flag = "X";

        grid123X.cerquilha.replace(casa1, casa1, flag);
        grid123X.cerquilha.replace(casa2, casa2, flag);
        grid123X.cerquilha.replace(casa3, casa3, flag);


        String expectativa = """
                X|X|X  
                4|5|6
                7|8|9
                """;
        String saida = grid123X.gerarCerquilha();
        Assertions.assertEquals(expectativa, saida);
    }

    @Test
    void gerarCerquilha159XTest(){
        Grid grid159X  = new Grid();

        String casa1 = "1";  String casa5 = "5"; String casa9 = "9"; String flag = "X";

        grid159X.cerquilha.replace(casa1, casa1, flag);
        grid159X.cerquilha.replace(casa5, casa5, flag);
        grid159X.cerquilha.replace(casa9, casa9, flag);


        String expectativa = """
                X|2|3
                4|X|6
                7|8|X
                """;
        String saida = grid159X.gerarCerquilha();
        Assertions.assertEquals(expectativa, saida);
    }

    @Test
    void gerarCerquilha123X76OTest(){
        Grid grid123X76O  = new Grid();

        String casa1 = "1";  String casa2 = "2"; String casa3 = "3"; String flagX = "X";
        String casa7 = "7"; String casa6 = "6"; String flagO = "O";

        grid123X76O.cerquilha.replace(casa1, casa1, flagX);
        grid123X76O.cerquilha.replace(casa2, casa2, flagX);
        grid123X76O.cerquilha.replace(casa3, casa3, flagX);
        grid123X76O.cerquilha.replace(casa7, casa7, flagO);
        grid123X76O.cerquilha.replace(casa6, casa6, flagO);

        String expectativa = """
                X|X|X
                4|5|O
                O|8|9
                """;
        String saida = grid123X76O.gerarCerquilha();
        Assertions.assertEquals(expectativa, saida);
    }

    @Test
    void jogada5XTest(){
        Grid jogada5X = new Grid();

        jogada5X.criarCerquilha();


        String expectativa = """
                1|2|3
                4|X|6
                7|8|9
                """;

        jogada5X.jogarRodada("X", "5");

        String saida = jogada5X.gerarCerquilha();

        Assertions.assertEquals(expectativa, saida);

    }

    @Test
    void jogada9OTest(){
        Grid jogada9O = new Grid();

        jogada9O.criarCerquilha();

        String expectativa = """
                1|2|3
                4|5|6
                7|8|O
                """;

        jogada9O.jogarRodada("O", "9");

        String saida = jogada9O.gerarCerquilha();

        Assertions.assertEquals(expectativa, saida);

    }

    @Test
    void casa9VaziaTest(){
        Grid gridCasa9Vazia = new Grid();

        String casa9 = "9";

        boolean expectativa = true;

        boolean saida = gridCasa9Vazia.heVazio(casa9);

        Assertions.assertEquals(expectativa, saida);
    }

    @Test
    void casa3OcupadaXTest() {
        Grid gridCasa3OcupadaX = new Grid();

        String casa3 = "3";
        String flag = "X";

        boolean expectativa = false;

        gridCasa3OcupadaX.jogarRodada(flag, casa3);

        boolean saida = gridCasa3OcupadaX.heVazio(casa3);

        Assertions.assertEquals(expectativa, saida);
    }
    @Test
    void casa1OcupadaOTest() {
        Grid gridCasa1OcupadaO = new Grid();

        String casa1 = "1";
        String flag = "O";

        boolean expectativa = false;

        gridCasa1OcupadaO.jogarRodada(flag, casa1);

        boolean saida = gridCasa1OcupadaO.heVazio(casa1);

        Assertions.assertEquals(expectativa, saida);
    }
}