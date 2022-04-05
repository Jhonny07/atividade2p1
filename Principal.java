public class Principal {
    public static void main (String[] args){

        Aluno a= new Aluno();
        Professor p= new Professor();

        System.out.println("Adicionando Aluno");
        a.adicionar();
        a.excluir();
        a.pesquisar();

        System.out.println("---------------------");

        System.out.println("Adicionando Professor");
        p.adicionar();
        p.excluir();
        p.pesquisar();
    }
}
