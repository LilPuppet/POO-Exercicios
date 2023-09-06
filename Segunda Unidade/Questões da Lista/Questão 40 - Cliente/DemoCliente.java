import java.util.ArrayList;
import java.util.Scanner;

public class DemoCliente {
    public static void main(String[] args) {

        ArrayList<Cliente> clientes = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        System.out.println("Cadastro de Clientes");

        while (true){
            System.out.print("Id: ");
            int id = s.nextInt();
            if(id <= 0){
                break;
            }
            s.nextLine();

            System.out.print("Nome: ");
            String nome = s.nextLine();

            System.out.print("Idade: ");
            int idade = s.nextInt();

            System.out.print("Telefone: ");
            int telefone = s.nextInt();
            
            Cliente c = new Cliente(nome, id, idade, telefone);
            clientes.add(c);
        } 

        for(int i = 0; i < clientes.size(); i++){
            System.out.println(clientes.get(i));
        }
        s.close();
    }
}

