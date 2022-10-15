# Factory Method

## Problemas

- Diversas especificações na construção do objeto
- Criação em múltiplos objetos concretos
- Fábrica para separa a construção destes objetos

## Solução

- Criar uma classe abstrata
- Criar classes que implementam a interface
- Criar classe factory que é responsável pela
construção das classes

## Temática

Os Desenvolvedores do *The Order of the Seven*
estavam com um grande problema: como o jogo é 
multi-plataformas, a forma de armazenar arquivos
muda para diferentes tipos de dispositivos.

A fim de evitar confusão na criação dessas classes
e atender a escalibilidade para novos dispositivos,
o arquiteto sugeriu a implementação da arquiteura 
Factory Method.

