**Relatório de desenvolvimento do trabalho T1 da Disciplina de Algoritmos e Estruturas de Dados**

**Resumo:** Este relatório aborda a otimização de um sistema de pesquisa de
mercadorias em uma empresa de varejo. No começo, lidamos com um
problema de lentidão significava no carregamento do aplicativo, bem como na
busca de cada mercadoria por seu código, o que impactava de forma negativa
a experiencia do usuário. Para solucionar esses desafios, criamos soluções
eficientes. Substituímos o algoritmo Bubble Sort (que para esse caso era
ineficiente) pelo Merge Sort, essa ação reduziu significativamente o tempo de
carregamento. Além disso, utilizamos a busca binária para acelerar a
pesquisa de mercadorias, especialmente nesse grande conjunto de dados.

**1. Introdução**

Neste relatório, exploramos uma proposta de otimização de desempenho para um
sistema de pesquisa de informações sobre mercadorias em uma empresa do ramo de
varejo. Para alcançar essa melhoria, implementamos soluções que envolvem algoritmos
de ordenação e pesquisa altamente eficazes.

**2. O problema**

O problema apresentado foi a otimização de um sistema de mercadorias, nesse
sistema o fator agravante foi a grande demora no carregamento de um dos aplicativos, o
tempo de busca de uma mercadoria através do seu código e o impacto desfavorável que
essa demora tinha na utilização dessa aplicação.

**3. Processo de solução**

O processo de solução contou com a implementação do algoritmo Merge Sort,
substituindo a ordenação inicial em Bubble Sort(que é ineficiente quando trabalhamos
com grandes quantidades de dados, como era o caso). O Merge Sort é um algoritmo de
complexidade O(n log n), o que o torna muito mais eficiente e acelerou significativamente
o processo de ordenação das mercadorias após o carregamento.
Em vez do processo de busca linear (que era extremamente demorado e pouco
otimizado), implementamos a busca binária (Binary Search) para localizar as mercadorias
com base em seus códigos, o que acelerou a pesquisa especialmente em grandes conjuntos
de dados. A busca binária tem complexidade O(log n).

**4. Evidências de que o problema foi resolvido**

Antes das alterações, quando testado utilizando o arquivo de 50 mil mercadorias,
o sistema demorava cerca de 80 segundos para carregar o banco de dados, 14 segundos
para localizar uma mercadoria específica e 17 segundos para retornar que não foi
localizada. Já no arquivo de 100 mil mercadorias as coisas ficavam ainda mais críticas,
com uma demora de mais de 540 segundos para o carregamento do banco de dados, 692
segundos para localizar uma mercadoria e 832 segundos para retorná-la como não
encontrada.
No entanto, após a implementação das soluções, os testes com ambos os tamanhos
de arquivo (50 mil e 100 mil mercadorias) apresentaram uma eficácia notável. Os tempos
de carregamento e pesquisa foram drasticamente reduzidos a 0 segundos, o que representa
uma melhoria significativa em relação aos resultados anteriores.

**5. Conclusões**

Com a elaboração deste trabalho foi possível realizar a otimização de um Sistema
de gerenciamento de mercadorias, os pontos que envolviam a lentidão e uma busca
demorada foram prontamente solucionados. Por meio da solução desenvolvida por nos
agora é possível realizar uma rápida pesquisa por código de cada mercadoria e carregar o
aplicativo rapidamente.
Durante a execução deste projeto, foi ressaltado a grande importância da escolha
algorítmica na otimização de códigos. A mudança na escolha dos algoritmos
desempenhou um papel crucial na performance da aplicação, ou seja, fica evidente que
traçar estratégias e se informar sobre qual algoritmo usar é necessário.
Ao decorrer desse trabalho, enfrentamos a algumas adversidades, especialmente
devido a ser um sistema com um grande volume de mercadorias, realizar os primeiros
testes com o algoritmo Bubble Sort foi um processo de muita paciência e perseverança,
conectar as ideias e pensar na melhora forma de resolver o problema também foi um
processo complexo, se limitar apenas a mexer nos métodos foram autorizados pelo
cliente, foram alguns dos grandes desafios pelos quais conseguimos passar com maestria. 
