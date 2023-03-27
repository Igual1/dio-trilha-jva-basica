public class Operadores {
    public static void main(String[] args){
        /* 
        int numero = 5;

        numero = numero + 2;

        System.out.println(numero);
        */


        /* 
        //Inverter o valor de uma variavel booleana
        boolean variavel =true;

        variavel = !variavel;

        System.out.println(variavel);
        */


        /* 
        int a, b;

        a = 6;
        b = 6;

        String resultado = a==b ?"verdadeiro" : "falso"; //Condição de decisão if
        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
        
        System.out.println(resultado); */


        int numero1 = 2;
        int numero2 = 1;

        boolean SimNao = numero1 == numero2;

        if(numero1 < numero2){
            System.out.println("Essa condição é verdadeira (true)");
        }

        System.out.println("numeroUm é igual a numeroDois? " + SimNao);

        SimNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois? " + SimNao);

        
    }

}
