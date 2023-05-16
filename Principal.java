public class Principal {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Gustavo",17,"Guza","12345678");

        System.out.println("Nome: "+usuario.getNome());
        System.out.println("Idade: "+usuario.getIdade());
        System.out.println("Username: "+usuario.getUsername());
        usuario.setSenha("etec123");

        if(usuario.verificaSenha("etec123")){
            System.out.println("senha valida");
        }else{
            System.out.println("senha invalida");
        }
    }
}
