/**
 * ResultadoEscolar
 */
public class ResultadoEscolar {
    public static void main(String[] args) {
        // Estruturas condicionais
        /** int nota = 6;

        if(nota >= 7)
        System.out.println("Aprovado");

        else if (nota >= 5 && nota <7)
        System.out.println("Prova de Recuperaçõa");

        else
        System.out.println("Reprovado");        */

        // Condições ternárias

        int nota = 3;
        String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);            
    }
    
}