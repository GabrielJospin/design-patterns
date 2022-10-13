# Singleton

## Problemas

- Controlar quantidade de instâncias uma classe tem
- Controlar recursos compartilhados
- Ponto de acesso global para uma instância

## Solução

- Fazer o construtor padrão privado
- criar metodo estãtico que age como um construtor
  - Testa se já existe uma instância
  - Se sim envia ela
  - Se não constroi uma nova e entrega

## Temática

Os Desenvolvedores do *The Order of the Seven*
enfrentavam um grande problema. O chat do jogo era
salvo de forma instantânea no cloud. Porém era muito
difícil abrir o arquivo em diversos computadores
diferentes sem sobrescrever arquivos ou sobrecarregar
a memória de escrita. Para resolver isso, foi utilizado
o Pattern ```Singleton```