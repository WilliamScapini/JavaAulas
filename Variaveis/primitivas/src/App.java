public class App {
    public class  Outra {
        public static void byteMensagem(){
            byte numeroPequeno = 127;
            byte outroNumeroPequeno = -128;
            System.out.println("Em java o byte armazena numeros de " + outroNumeroPequeno + " ate " + numeroPequeno);
            }
        public static void shortMensagem(){
            short numeroPoucoMaior = 32767;
            short outroNumeroPoucoMaior = -32768;
            System.out.println("E o short armazena numeros de "+outroNumeroPoucoMaior + " ate "+ numeroPoucoMaior);
            }
        public static void intMensagem(){
            int numero = 2147483647;
            int numeroNegativo = -2147483648;
            System.out.println("Int vai de "+ numeroNegativo + " ate "+numero);
        }
        public static void longMensagem(){
            long numeroGiga = 214748380000000l;
            long numeroGigaNegativo = -214748364800000000l;
            System.out.println("long ring long land vai de "+ numeroGigaNegativo + " ate "+numeroGiga);
        }
        public static void floatMensagem(){
            float numerofloat = 79.502f;
            System.out.println("Para numeros decimais usamos float, mas ele nao tem precisao grande " + numerofloat);
        }
        public static void doubleMensagem(){
            double numeroDouble = 79.500004568;
            System.out.println("Para numeros decimais usamos float, e ele tem precisao grande " + numeroDouble);
        }
        }
    public static void main(String[] args) throws Exception {
        Outra.byteMensagem();
        Outra.shortMensagem();
        Outra.intMensagem();
        Outra.longMensagem();
        Outra.floatMensagem();
        Outra.doubleMensagem();
    }
}
