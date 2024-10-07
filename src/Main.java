//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        public class Main {
            public static void main(String[] args) {
                // Criando uma lista encadeada de inteiros
                NodeT.ListaEncadeada<Integer> lista = new NodeT.ListaEncadeada<>();

                // Testando inserção
                System.out.println("Inserindo elementos...");
                lista.adicionarNoInicio(10);
                lista.adicionarNoFim(20);
                lista.adicionarNoFim(30);
                lista.adicionarNaPosicao(1, 15);
                System.out.println("Lista atual: " + lista);

                // Testando remoção
                System.out.println("Removendo do início: " + lista.removerDoInicio());
                System.out.println("Lista após remover do início: " + lista);

                System.out.println("Removendo do fim: " + lista.removerDoFim());
                System.out.println("Lista após remover do fim: " + lista);

                System.out.println("Removendo da posição 1: " + lista.removerDaPosicao(1));
                System.out.println("Lista após remover da posição 1: " + lista);

                // Testando busca
                lista.adicionarNoFim(40);
                lista.adicionarNoFim(50);
                System.out.println("Lista atual: " + lista);
                System.out.println("Elemento na posição 1: " + lista.buscar(1));
                System.out.println("Posição do valor 50: " + lista.buscarPosicao(50));

                // Testando atualização
                System.out.println("Atualizando valor na posição 1 para 100.");
                lista.atualizar(1, 100);
                System.out.println("Lista após atualização: " + lista);

                // Testando verificação de tamanho e esvaziamento
                System.out.println("Tamanho da lista: " + lista.tamanho());
                System.out.println("A lista está vazia? " + lista.estaVazia());

                // Limpando a lista
                lista.limpar();
                System.out.println("Lista após limpar: " + lista);
                System.out.println("A lista está vaz");


            }
        }
