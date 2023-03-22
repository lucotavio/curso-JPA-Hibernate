#!/bin/bash


echo -e "\n\n***************************************************** INSTALANDO  O  MYSQL *************************************************************"

## Gravando  aversão do Fedora no arquivo version.txt
cat /etc/fedora-release | tee -a version.txt

## Testando qual versão do Fedora esta instalada
if grep -qi "37" version.txt; then
    sudo dnf -y install https://dev.mysql.com/get/mysql80-community-release-fc37-1.noarch.rpm
elif grep -qi "36" version.txt; then
    sudo dnf -y install https://dev.mysql.com/get/mysql80-community-release-fc36-1.noarch.rpm
else
    read -p "Essa instalação suporta apenas as versões 36 e 37 do Fedora, sua versão não é nem a 36 nem a 37, cancele a instalação e instale o Fedora 36 ou 37"
fi

## Instalando o Mysql 8
sudo dnf install mysql-community-server -y

## Iniciando o Mysql
sudo systemctl start mysqld.service

## tornando o Mysql um serviço
sudo systemctl enable mysqld.service

## Vai mostrar  a senha temporaria do Mysql
sudo grep 'A temporary password' /var/log/mysqld.log |tail -1

## Configurando o Mysql
sudo mysql_secure_installation

echo -e "********************************************************************************************************************************************"




echo -e "\n\n\n************************************************** INSTALANDO  POSTGRES **************************************************************"


## Instalando PostgreSQL
sudo dnf install https://download.postgresql.org/pub/repos/yum/reporpms/F-37-x86_64/pgdg-fedora-repo-latest.noarch.rpm -y
sudo dnf install postgresql15-server -y
sudo /usr/pgsql-15/bin/postgresql-15-setup initdb
sudo systemctl enable postgresql-15

## Mudando permissao na pasta home do usuario corrente
sudo chmod 755 /home/$USER

## Mudando o tipo de autentificacao no PostgreSQL
sudo sed -i 's/ident/password/g' /var/lib/pgsql/15/data/pg_hba.conf

## Reiniciando o PostgreSQL
sudo systemctl restart postgresql-15
sudo systemctl enable postgresql-15
## sudo systemctl status mysqld

## Alterando a senha do usuario postgres no SGBD PostgreSQL
sudo -u postgres -H -- psql -c "ALTER USER postgres PASSWORD '789789';"

## Criando usuario luciano no SGBD PostgreSQL
sudo -u postgres -H -- psql -c "CREATE USER luciano WITH ENCRYPTED PASSWORD '789789';"

## Alterando permissoes do usuario luciano
## para ele se tornar um super usuario
## no SGBD PostgreSQL
sudo -u postgres -H -- psql -c "ALTER USER luciano WITH SUPERUSER"

echo -e "********************************************************************************************************************************************"

## Download JDK-17
echo -e "\n\n\n JDK-17"
if [ -e jdk-17.0.6_linux-x64_bin.rpm ];then
    echo "O arquivo  jdk-17.0.6_linux-x64_bin.rpm  ja existe"
else
    curl -L -o jdk-17.0.6_linux-x64_bin.rpm https://www.dropbox.com/s/5ycket71xq9v4qk/jdk-17.0.6_linux-x64_bin.rpm?dl=0
fi

chmod +x jdk-17.0.6_linux-x64_bin.rpm

sudo dnf localinstall jdk-17.0.6_linux-x64_bin.rpm -y

sudo mv /usr/lib/jvm/jdk-17-oracle-x64/ /usr/lib/jvm/jkd-17/


if [ -e /home/$USER/.bashrc ];then
    echo "O arquivo  /home/$USER/.bashrc  ja existe"
else
    touch .bashrc
fi

echo "export JAVA_HOME=/usr/lib/jvm/jkd-17" >> /home/$USER/.bashrc
echo "export PATH=\$PATH:\$JAVA_HOME/bin" >> /home/$USER/.bashrc

curl -L -o docker-compose https://www.dropbox.com/s/auvvs0rh9hvn9qr/docker-compose?dl=0

https://www.dropbox.com/s/auvvs0rh9hvn9qr/docker-compose?dl=0
