#!/bin/bash

# Criar diretório de saída
mkdir -p out

# Gerar lista de arquivos-fonte
find src -name "*.java" ! -name "module-info.java" > sources.txt

# Compilar os arquivos
javac -d out @sources.txt

# Copiar os arquivos .dat para junto dos .class
cp src/curtain/parser/parser.dat out/curtain/parser/
cp src/curtain/lexer/lexer.dat out/curtain/lexer/ 2>/dev/null

# Executar a aplicação
java -cp out curtain.Main
