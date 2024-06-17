import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class OrdenacaoPessoas {
    private final List<Pessoa> ordenarPessoas;

    public OrdenacaoPessoas() {
        this.ordenarPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        ordenarPessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasOrdenadas = new ArrayList<>(ordenarPessoas);
        Collections.sort(pessoasOrdenadas);
        return pessoasOrdenadas;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> ordemAltura = new ArrayList<>(ordenarPessoas);
        Collections.sort(ordemAltura, new ComparatorAltura());
        return ordemAltura;
    }


    public static void main(String[] args) {
        OrdenacaoPessoas ordenarPessoas = new OrdenacaoPessoas();
        ordenarPessoas.adicionarPessoa("Nome 1", 20, 1.56);
        ordenarPessoas.adicionarPessoa("Nome 2", 30, 1.80);
        ordenarPessoas.adicionarPessoa("Nome 3", 25, 1.70);
        ordenarPessoas.adicionarPessoa("Nome 4", 17, 1.56);

        //System.out.println(ordenarPessoas.ordenarPorIdade());
        System.out.println(ordenarPessoas.ordenarPorAltura());
    }
}