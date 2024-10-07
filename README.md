# Otimização do Sistema de Pesquisa de Mercadorias

## Resumo
O projeto aborda a otimização de um sistema de pesquisa de mercadorias em uma empresa de varejo. Inicialmente, enfrentamos problemas de lentidão no carregamento do aplicativo e na busca de mercadorias por código, impactando negativamente a experiência do usuário. Para solucionar esses desafios, implementamos soluções eficientes, substituindo o algoritmo Bubble Sort pelo Merge Sort, o que reduziu significativamente o tempo de carregamento. Além disso, utilizamos a busca binária para acelerar a pesquisa de mercadorias, especialmente em grandes conjuntos de dados.

## 1. Introdução
Este projeto visa a otimização de desempenho para um sistema de pesquisa de informações sobre mercadorias em uma empresa do ramo de varejo. Para alcançar essa melhoria, foram implementadas soluções que envolvem algoritmos de ordenação e pesquisa altamente eficazes.

## 2. O Problema
O desafio foi otimizar um sistema de mercadorias que apresentava lentidão no carregamento de um aplicativo e no tempo de busca de mercadorias por meio de seus códigos, o que impactava a utilização da aplicação.

## 3. Processo de Solução
O processo de solução contou com a implementação do algoritmo Merge Sort, que substituiu a ordenação inicial em Bubble Sort, ineficiente para grandes quantidades de dados. O Merge Sort, com complexidade O(n log n), acelerou significativamente o processo de ordenação das mercadorias após o carregamento. Além disso, a busca binária (Binary Search) foi implementada para localizar mercadorias com base em seus códigos, o que acelerou a pesquisa em grandes conjuntos de dados, com complexidade O(log n).

## 4. Evidências de que o Problema foi Resolvido
Antes das alterações, ao testar com um arquivo de 50 mil mercadorias, o sistema levava cerca de 80 segundos para carregar o banco de dados, 14 segundos para localizar uma mercadoria específica e 17 segundos para retornar que não foi localizada. Com um arquivo de 100 mil mercadorias, a situação se tornava ainda mais crítica, com tempos superiores a 540 segundos para o carregamento do banco de dados e 692 segundos para localizar uma mercadoria. Após a implementação das soluções, os testes com ambos os tamanhos de arquivo mostraram eficácia notável, reduzindo os tempos de carregamento e pesquisa para 0 segundos, representando uma melhoria significativa.

## 5. Conclusões
A otimização do sistema de gerenciamento de mercadorias possibilitou resolver os problemas de lentidão e busca demorada. Agora, é possível realizar uma pesquisa rápida por código de mercadoria e carregar o aplicativo de forma ágil. Durante a execução do projeto, destacou-se a importância da escolha algorítmica na otimização de códigos, pois a mudança nos algoritmos foi crucial para a performance da aplicação. Enfrentamos adversidades, especialmente devido ao grande volume de mercadorias. Os testes iniciais com o algoritmo Bubble Sort foram desafiadores, mas conseguimos superar os obstáculos, conectando ideias e buscando a melhor forma de resolver o problema, sempre dentro das limitações permitidas pelo cliente.
