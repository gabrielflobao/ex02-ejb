@echo off
call mvn clean package
call docker build -t com.br.utfpr/ex02-ejb .
call docker rm -f ex02-ejb
call docker run -d -p 9080:9080 -p 9443:9443 --name ex02-ejb com.br.utfpr/ex02-ejb