# aps-patterns
Exemplo de cenário usando 3 Design Patterns - State/Observer/Chain of Responsibility

01 - State
O jogo possui um jogador que possui o estado alterado conforme o dano recebido.
Esse pattern é adequado para esse cenário, porque os estados alternam entre si e o comportamento muda de acordo com o estado atual.

02 - Observer 
Usado para gerar uma notificação na tela de que o jogador está com o nível de vida crítico.
Esse pattern é útil, porque não é preciso verificar sempre quanto de dano um jogador recebeu,
a tela já observa o jogador para que, quando estiver muito ferido, gere a notificação.