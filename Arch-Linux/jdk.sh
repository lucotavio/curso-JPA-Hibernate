#!/bin/bash


sudo pacman -Syu
sudo pacman -S jre17-openjdk
sudo pacman -S jdk17-openjdk


echo "export JAVA_HOME=/usr/lib/jvm/java-17-openjdk" >> /home/$USER/.bashrc
echo "export PATH=\$PATH:\$JAVA_HOME/bin" >> /home/$USER/.bashrc
