public class Main {
    public static void main(String[] args) {

        // ** Formatações de Strings **
        // toLowerCase(); Transformar para minúsculo
        // toUpperCase(); Transformar para maiúsculo
        // trim(); Remover espaços

        // ** Recortando Strings **
        // substring(inicio);
        // substring(inicio, fim);

        // ** Substituindo String/índice **
        // Replace(char, char);
        // Replace(String, String);

        // ** Buscar **
        // IndexOf
        // LastIndexOf

        // ** Recortar String **
        // str.Split("");

        String exemploGeral = "abcde FGHIJ abc DEFG ABCDE   ";

        String minusculo = exemploGeral.toLowerCase();
        System.out.println("Tudo minúsculo\n <" + minusculo + ">");
        System.out.println(" <" + exemploGeral + "> Original\n");

        String maiusculo = exemploGeral.toUpperCase();
        System.out.println("Tudo maiúsculo\n <" + maiusculo + ">");
        System.out.println(" <" + exemploGeral + "> Original\n");

        String semEspaco = exemploGeral.trim();
        System.out.println("Sem espaços em branco nas extremidades\n <" + semEspaco + ">");
        System.out.println(" <" + exemploGeral + "> Original\n");

        String subStringInicio = exemploGeral.substring(4);
        System.out.println("Escolhendo por índice o inicio (escolhi do 4º índice)\n <" + subStringInicio + ">");
        System.out.println(" <" + exemploGeral + "> Original\n");

        String subStringInicioFim = exemploGeral.substring(5, 18);
        System.out.println("Escolhendo por índice o inicio e fim (escolhi do 5º ao 10º índice)\n <" + subStringInicioFim + ">");
        System.out.println(" <" + exemploGeral + "> Original\n");

        String substituindoCaracteres = exemploGeral.replace("e", "?");
        System.out.println("Substituindo os caracteres 'e' por '?'\n <" + substituindoCaracteres + ">");
        System.out.println(" <" + exemploGeral + "> Original\n");

        String substituindoTrechos = exemploGeral.replace("ab", "####");
        System.out.println("Substituindo o trecho 'ab' por '####'\n <" + substituindoTrechos + ">");
        System.out.println(" <" + exemploGeral + "> Original\n");

        int localizandoIndicePorTrechoInicial = exemploGeral.indexOf("HIJ");
        System.out.println("o trecho 'HIJ' tem como primeira ocorrência o índice \n <" + localizandoIndicePorTrechoInicial + ">");
        System.out.println(" <" + exemploGeral + "> Original\n");

        int localizandoIndicePorTrechoFinal = exemploGeral.lastIndexOf(" AB");
        System.out.println("o trecho ' AB' tem como última ocorrência o índice \n <" + localizandoIndicePorTrechoFinal + ">");
        System.out.println(" <" + exemploGeral + "> Original\n");

        String separandoStringPorPartes = "Meu nome é Felipe";
        System.out.println("Iremos dividir a seguinte String pelos espaços: " + separandoStringPorPartes);
        String[] vetor = separandoStringPorPartes.split(" "); // O separador será os espaços
        String parte1 = vetor[0];
        String parte2 = vetor[1];
        String parte3 = vetor[2];
        String parte4 = vetor[3];
        System.out.println("Parte um: " + parte1 + "\nParte dois: " + parte2 + "\nParte três: " +parte3 + "\nParte quatro: " + parte4);

    }
}