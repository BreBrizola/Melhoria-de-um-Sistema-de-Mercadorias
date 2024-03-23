import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class BancoDeDados {
    private static int CAPACIDADE = 1_000_000;
    private Mercadoria[] mercadorias;
    public int getQuantidade() {
        return quantidade;
    }
    private int quantidade;

    public BancoDeDados(String arquivoCSV)  {
        mercadorias = new Mercadoria[1_000_000];
        quantidade=0;
        carregarArquivo(arquivoCSV);
        ordenarPorCodigo();
    }
    
    private void carregarArquivo(String arquivoCSV) {
        FileReader arquivo = null;
        try {
            arquivo = new FileReader(arquivoCSV);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        BufferedReader leitor = new BufferedReader(arquivo);
        String linha;
        try {
            linha = leitor.readLine();
            while (linha != null) {
                if (!((linha = leitor.readLine()) != null)) break;
                String[] colunas = linha.split(",");
                Mercadoria m = new Mercadoria(colunas[0], colunas[1], Double.parseDouble(colunas[2]));
                mercadorias[quantidade] = m;
                quantidade++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public Mercadoria pesquisarMercadoria(String chave) {
        int indice = binarySearch(chave);
        if (indice != -1) {
            return mercadorias[indice];
        } else {
            return null;
        }
    }  

    private int binarySearch(String chave) {
        int posInicial = 0;
        int posFinal = quantidade - 1;

        while (posInicial <= posFinal) {
            int meio = posInicial + (posFinal - posInicial) / 2;
            int comparacao = mercadorias[meio].getCodigo().compareToIgnoreCase(chave);

            if (comparacao == 0) {
                return meio;
            } else if (comparacao < 0) {
                posInicial = meio + 1;
            } else {
                posFinal = meio - 1;
            }
        }

        return -1;
    }

    private void ordenarPorCodigo() {
            mergeSort(mercadorias, 0, quantidade - 1);
    }
    
    private void mergeSort(Mercadoria[] mercadorias, int esquerda, int direita) {
        if (esquerda < direita) {
            int meio = esquerda + (direita - esquerda) / 2;

            mergeSort(mercadorias, esquerda, meio);
            mergeSort(mercadorias, meio + 1, direita);
            merge(mercadorias, esquerda, meio, direita);
            }
        }
    
    private void merge(Mercadoria[] mercadorias, int esquerda, int meio, int direita) {
        int n1 = meio - esquerda + 1;
        int n2 = direita - meio;
    
        Mercadoria[] arraysEsq = new Mercadoria[n1];
        Mercadoria[] arraysDir = new Mercadoria[n2];
    

        for (int i = 0; i < n1; i++) {
            arraysEsq[i] = mercadorias[esquerda + i];
        }
        for (int j = 0; j < n2; j++) {
            arraysDir[j] = mercadorias[meio + 1 + j];
        }
    
        int i = 0, j = 0;
        int k = esquerda;
    
        while (i < n1 && j < n2) {
            if (arraysEsq[i].getCodigo().compareTo(arraysDir[j].getCodigo()) <= 0) {
                mercadorias[k] = arraysEsq[i];
                i++;
            } else {
                mercadorias[k] = arraysDir[j];
                j++;
            }
            k++;
            }
    
        while (i < n1) {
            mercadorias[k] = arraysEsq[i];
            i++;
            k++;
        }
    
        while (j < n2) {
            mercadorias[k] = arraysDir[j];
            j++;
            k++;
        }
        }
}

