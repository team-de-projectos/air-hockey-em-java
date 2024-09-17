
1. Passo 
# Para baixar o projeto pelo terminal/linha de comando use:
gh repo clone team-de-projectos/air-hockey-em-java

ou pode simplesmente "baixar o zip", apartir do link:
- https://github.com/team-de-projectos/air-hockey-em-java

2. Passo
# Como fazer enviar actualizações do que fizer?
R: Depois de fazer o download ou clonar o projeto, entre nele pelo 
terminal ou linha de commando.

projeto:
 - <src> (pasta onde esta os codigos. exemplo)
 	- <codigo_que_actualizei>.java


3. Passo
# Crie uma branch, isso so precisa ser feito uma vez
# apos o download ou clone do projeto pela primeira vez
git branch -m minha_branch_para_x

4. Passo
# ainda dentro do projeto (usando cmd ou terminal) voce 
# adiciona a pasta ou ficheiro que vai enviar no git
git add <codigo_que_actualizei>.(java, python, js pode ser qualquer extensão)
ou git add <nome_da_pasta>

5. Passo
# depois de adicionar voce precisa criar um commit, que é como
# tirar uma foto do codigo que voce atualizou.
git commit -m "aqui voce precisa descrever o que alterou/atualizou"

6. Passo
# Por último voce vai enviar essas actualizacoes na branch (ramo)
# que voce criou. pensa em branch (ramo) como um ramo de uma arvore
# ela pode ter varios ramos, no git é a mesma coisa ele serve para
# trabalhar em codigos paralelos sem alterar o codigo principal
git push -u origin minha_branch_para_x



