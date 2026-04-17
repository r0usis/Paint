# 🖌️ Mini-Paint

Um projeto de editor gráfico inspirado no Paint clássico, desenvolvido em **2018** como trabalho final da disciplina de **Programação Orientada a Objetos**, sob orientação do **Professor Dr. André Carvalho** — Turma 2018.2.

**Autoras:** [Luzia (@luh450)](https://github.com/luh450) e [Roseane (@r0usis)](https://github.com/r0usis)

---

## 📋 Sobre o projeto

O **Mini-Paint** é uma aplicação desktop desenvolvida em **Java** com interface gráfica via **Java Swing**. O projeto aplica os principais conceitos de POO — herança, polimorfismo, encapsulamento e tratamento de exceções — na construção de um editor de formas geométricas interativo.

### Funcionalidades

- ✏️ **Desenhar formas geométricas** com o mouse:
  - Quadrado
  - Triângulo Retângulo
  - Círculo
- 🎨 **Escolher cor** livremente com um seletor de cores
- 🪣 **Preencher formas** já desenhadas (balde de tinta)
- 🔲 **Modo preenchido** — desenhar formas já preenchidas
- ✏️ **Editar formas** — alterar posição (X, Y) e tamanho (base, altura) de formas existentes
- 🔁 **Repintar** — trocar a cor de uma forma já desenhada
- ❌ **Remover formas** individualmente pelo histórico
- 🗑️ **Apagar tudo** (com opção de salvar antes)
- 💾 **Salvar** o desenho em arquivo `.txt` (dados das formas) e `.jpeg` (imagem)
- 📂 **Carregar** um desenho salvo anteriormente
- 📋 **Histórico** lateral com todas as formas adicionadas na sessão
- 🖱️ **Exibição de coordenadas** do cursor em tempo real

---

## 🗂️ Estrutura do projeto

```
Paint/
├── JanelaInicial.java       # Tela inicial com botão para iniciar
├── Janela.java              # Janela principal do editor
├── Painel.java              # Painel de desenho (canvas)
├── Editor.java              # Lógica central: desenhar, editar, salvar, carregar
├── Figura.java              # Gerenciador da lista de formas
├── Forma2D.java             # Classe abstrata base para as formas
├── Quadrado.java            # Implementação do quadrado/retângulo
├── Circulo.java             # Implementação do círculo
├── TrianguloRetangulo.java  # Implementação do triângulo retângulo
├── CoordNegativa.java       # Exceção customizada para coordenadas inválidas
├── Fechar.java              # Dialog de confirmação ao sair
├── MandaJobs.java           # Tela "Sobre" com informações do projeto
├── RunPaint.jar             # JAR executável (pronto para rodar)
└── *.png                   # Ícones da interface
```

---

## ⚙️ Pré-requisitos

- **Java JDK 8** ou superior instalado
  - Verifique com: `java -version`
  - Caso não tenha, baixe em: https://www.oracle.com/java/technologies/downloads/

---

## 🚀 Como executar

### Opção 1 — Executar pelo JAR (mais simples)

Sem necessidade de compilar nada. Basta ter o Java instalado.

```bash
java -jar RunPaint.jar
```

Ou clique duas vezes no arquivo `RunPaint.jar` (se o Java estiver associado a arquivos `.jar` no seu sistema).

---

### Opção 2 — Compilar e executar pelo código-fonte

**Passo 1 — Clone o repositório**

```bash
git clone https://github.com/r0usis/Paint.git
cd Paint
```

**Passo 2 — Crie uma pasta para os arquivos compilados**

```bash
mkdir -p out/poo
```

**Passo 3 — Copie os recursos (imagens) para a pasta de saída**

```bash
cp *.png out/poo/
```

**Passo 4 — Compile todos os arquivos `.java`**

```bash
javac -d out *.java
```

**Passo 5 — Execute a aplicação**

```bash
java -cp out poo.JanelaInicial
```

---

## 🖥️ Como usar

1. Na **tela inicial**, clique em **"Iniciar"** para abrir o editor.
2. Selecione uma **forma** na barra de ferramentas (quadrado, círculo ou triângulo).
3. Clique e arraste no **painel de desenho** para criar a forma.
4. Use o botão de **cores** para escolher a cor antes de desenhar.
5. Ative o botão de **formas preenchidas** para desenhar já com preenchimento.
6. Selecione uma forma no **histórico lateral** e use os botões:
   - **Remover** — apaga a forma selecionada
   - **Editar** — altera posição e tamanho
   - **Repintar** — troca a cor
   - **Preencher (balde)** — preenche a forma selecionada
7. Para **salvar**, vá em `Arquivo > Salvar` ou use `Ctrl + S`.
8. Para **carregar** um arquivo salvo, vá em `Arquivo > Carregar` ou use `Ctrl + L`.

---

## 📌 Observações

- Ao tentar carregar um arquivo com um desenho em andamento, o programa perguntará se deseja salvar antes.
- Coordenadas negativas são tratadas com uma exceção customizada (`CoordNegativa`) que exibe uma mensagem de erro ao usuário.
- O arquivo salvo gera dois arquivos: um `.txt` com os dados das formas e um `.jpeg` com a imagem do desenho.
