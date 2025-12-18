public class Pessoa {

    String nome;
    int CPF;
    int idade;

    void dizOi(){
        System.out.println(nome + " diz: Olá, mundo!");
    }

    void fazAniversario(){
        idade++;
        System.out.println(nome + " fez aniversário! Agora tem: " + idade + " anos");
    }
}
