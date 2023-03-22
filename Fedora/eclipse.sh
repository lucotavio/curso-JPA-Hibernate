#!/bin/bash


## Criando diretorio Programas onde vao
## ficar os programaas que precisao de
## dwonloads para serem istalados
mkdir /home/$USER/Downloads/Programas/


## Entrando na para pasta de programas
cd /home/$USER/Downloads/Programas/


## Download Eclipse
echo -e "\n\n\n Eclipse"
if [ -e eclipse-2022_09-1.x86_64.rpm ];then
    echo "O arquivo  eclipse-2022_09-1.x86_64.rpm  ja existe"
else
    curl -L -o eclipse-2022_09-1.x86_64.rpm https://www.dropbox.com/s/x19ugg8usvlb57k/eclipse-2022_09-1.x86_64.rpm?dl=0
fi

chmod +x eclipse-2022_09-1.x86_64.rpm
sudo dnf localinstall eclipse-2022_09-1.x86_64.rpm -y
