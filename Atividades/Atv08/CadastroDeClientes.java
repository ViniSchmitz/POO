package POO.Atividades.Atv08;
public class CadastroDeClientes {
    public static void main(String[] args) {
        
        Client client = new Client();

        client.setCod(12); //definir valro usa set
        client.setNumero_credito(2023);
        client.nome = "Vinicis";
        client.data_nasc = "10-12-2054";
        client.endereco = "Rua Presidente Bolsonaro 24";
        client.cidade = "Rio do Salto";
        client.estado = "Paraiba";
        client.cep = 80805080;
        client.email = "2070correr@gmail.com";
        
        System.out.println(client.getCod());
        System.out.println(client.getNumero_credito());
        System.out.println(client.nome);
        System.out.println(client.data_nasc);
        System.out.println(client.endereco);
        System.out.println(client.cidade);
        System.out.println(client.estado);
        System.out.println(client.cep);
        System.out.println(client.email);
    
    }
        




}
