# Bridge
## Problemas

- Classes complexas ou clases intimamente ligadas com
for tendencia de alterações.
- necessidade de simplificar teste

## Soluções
- Construir uma classe que converte a herança em
composição.
## Temática

Os desenvolvedoras da *The order of the seven* estavam
observando um mal cheiro muito grande no código de
construção de personagem. As classes estavam obtendo muitas
heranças para especificar classe, raça, etc.

Para resolver o problema, o arquiteto sugeriu que fosse
implementado o Desing Pattern Bridge, para simplificar
esta construção.