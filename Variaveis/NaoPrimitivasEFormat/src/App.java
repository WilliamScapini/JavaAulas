public class App {
    public static void main(String[] args) throws Exception {
        String nome = "Gon";
        int idade = 12;
        float peso = 60.5f;
        char letraInicial = 'g';
        boolean éForte = true;
        String texto = String.format("O personagem %s de %d de idade\npeso %f kg com letra inicial %c é forte?\n %b.", nome,idade,peso,letraInicial,éForte);
        System.out.format(texto);
    }
}
