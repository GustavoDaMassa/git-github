# GIT 

### *Funcionalidades:*

###  git init
  - iniciar novo projeto 
###  git add 
  - adicionar os arquivos que foram alterados para a área de alterações preparadas
  - ***git add 'nome do arq' / git add .(todos os arq)***
### git restore **(não é  o contrario do git add)**
-   volta as alterações para a versão anterior do arquivo 
-   ***git restore 'nome do arquivo'***
###  git commit -m "mensagem" 
  - commita os arquivos no repositório local 
###  git log
  - mostra os ultimos commmits, log de commmits
###  git status
  - como está os estado de preparação de commits 
###  git diff 
  - mostra as diferenças em relação a ultima versão
###  git merge 
-   merge de uma branch para a outra 
 -   ***git merge 'branch1' (branch1 será unida à brancha atual)***
###  git branch
- mostra a branch atual e as existentes
###  git checkout 
- transita entre as branchs
- ***git chechout 'branch1'***
###  git branch -b 
  - cria uma nova branch 
  -*** git branch -b 'branch1' (branch1 criada apartir da branch atual)***
 ### git remote add 
 - adiciona um novo repositório remoto
 -*** git remote add 'origin' 'url' ( repositorio origin add)***
 ###  git push 
- empurra as alterações do repositório local para o repositório remoto
- ***git push 'origin' 'branch1' (nome do repositorio remoto, nome da branch)***
### git pull
  - puxa as alterações do repositório remoto para o repositório local
  - ***git push 'origin' 'branch1' (nome do repositorio remoto, nome da branch)***
### git fetch
- sincroniza o repositório local de acordo com o histórico do repositório remoto 
- todas as atualizações de branches, novas branches, etc...
    



